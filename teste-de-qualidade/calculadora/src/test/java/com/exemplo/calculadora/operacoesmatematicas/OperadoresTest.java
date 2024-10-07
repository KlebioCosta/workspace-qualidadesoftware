package com.exemplo.calculadora.operacoesmatematicas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperadoresTest {

    private Operacoes calculadora;
    private int numeroPositivoInteiro;
    private int numeroNegativoInteiro;
    private int numeroZero;
    private double numeroPositivoDoube;
    private double numeroNegativoDoube;

    @BeforeEach
    void setUp() {
        calculadora = new Operacoes();
        numeroPositivoInteiro = 11;
        numeroNegativoInteiro = -7;
        numeroZero = 0;
        numeroPositivoDoube = 11.0;
        numeroNegativoDoube = -7.0;

    }

    @Nested
    @DisplayName("Testes de Adição ")
    class TestAdicao {

        @Test
        @DisplayName("A soma de dois números positivos retorna o valor correto. ")
        void testAdicao_NumerosPositivos() {
            assertEquals(22, calculadora.adicao(numeroPositivoInteiro, numeroPositivoInteiro));
        }
        @Test
        @DisplayName("A soma de um número negativo e um número positivo retorna uma subtração e mantem o sinal do maior número. ")
        void testAdicao_NumeroNegativoEPositivo() {
            assertEquals(4, calculadora.adicao(numeroNegativoInteiro, numeroPositivoInteiro));
        }
        @Test
        @DisplayName("A soma de dois números negativos soma os valores e manter o sinal. ")
        void testAdicao_NumerosNegativos() {
            assertEquals(-14, calculadora.adicao(numeroNegativoInteiro, numeroNegativoInteiro));
        }
        @Test
        @DisplayName("O número somado com zero resulta no valor do proprio número. ")
        void testAdicao_NumeroZero() {
            assertEquals(11, calculadora.adicao(numeroZero, numeroPositivoInteiro));
        }
        @Test
        @DisplayName("O número excede o tamanho Máximo permitido. ")
        void testAdicao_NumerosGrandesPositivos() {
            assertThrows(IllegalArgumentException.class, () -> {
                calculadora.adicao(Integer.MAX_VALUE, +1);
            });
        }
        @Test
        @DisplayName("O número negativo excede o tamanho Mínimo permitido. ")
        void testAdicao_NumerosGrandesNegativos() {
            assertThrows(IllegalArgumentException.class, () -> {
                calculadora.adicao(Integer.MIN_VALUE, -1);
            });
        }
    }
    @Nested
    @DisplayName("Testes de Subtração ")
    class Subtracao {

        @Test
        @DisplayName("A subtração de dois números positivos retorna o valor correto. ")
        void testSubtracao_NumerosPositivos() {
            assertEquals(0, calculadora.subtracao(numeroPositivoInteiro, numeroPositivoInteiro));
        }
        @Test
        @DisplayName("A subtração de um número positivo e um número negativo retorna o valor correto. ")
        void testSubtraca_NumerosPsitovosENegativos() {
            assertEquals(18, calculadora.subtracao(numeroPositivoInteiro, numeroNegativoInteiro));
        }
        @Test
        @DisplayName("A subtração de dois números negativos retorna o valor correto. ")
        void testSubtraca_NumerosNegativos() {
            assertEquals(0, calculadora.subtracao(numeroNegativoInteiro, numeroNegativoInteiro));
        }
        @Test
        @DisplayName("O número subtraido por zero resulta no valor do proprio número. ")
        void testSubtracao_NumeroZero() {
            assertEquals(-11, calculadora.subtracao(numeroZero, numeroPositivoInteiro));
        }
        @Test
        @DisplayName("O número excede o limite Máximo permitido. ")
        void testSubtracao_NumerosGrandesPositivos() {
            assertThrows(IllegalArgumentException.class, () -> {
                calculadora.subtracao(Integer.MAX_VALUE, +1);
            });
        }
        @Test
        @DisplayName("O número excede o limite minimo permitido ")
        void testSubtracao_NumerosGrandesNegativos() {
            assertThrows(IllegalArgumentException.class, () -> {
               calculadora.subtracao(Integer.MIN_VALUE, -1);
            });
        }
    }

    @Nested
    @DisplayName("Testes de Multiplicação ")
    class Multipliacao {

        @Test
        @DisplayName("A multiplicação de dois números positivos retorna o valor correto. ")
        void testMultiplicacao_NumerosPositivos() {
            assertEquals(121, calculadora.multiplicacao(numeroPositivoInteiro, numeroPositivoInteiro));
        }
        @Test
        @DisplayName("A multiplicação de um número positivo com um número negativo retorna o valor correto. ")
        void testMultiplicacao_NumeroPositivoENegativo() {
            assertEquals(-77, calculadora.multiplicacao(numeroPositivoInteiro, numeroNegativoInteiro));
        }
        @Test
        @DisplayName("A multiplicação de dois números negativos retorna o valor correto. ")
        void testMultiplicacao_NumerosNegativos() {
            assertEquals(49, calculadora.multiplicacao(numeroNegativoInteiro, numeroNegativoInteiro));
        }
        @Test
        @DisplayName("A multiplicação de números com Zero retorna o valor correto. ")
        void testMultiplicacao_NumeroZero() {
            assertEquals(0, calculadora.multiplicacao(numeroPositivoInteiro, numeroZero));
        }
        @Test
        @DisplayName("O número excede o valor máximo permitido. ")
        void testMultiplicacao_NumerosGrandesPermitidos() {
            assertThrows(IllegalArgumentException.class, () -> {
                calculadora.multiplicacao(Integer.MAX_VALUE, +1);
            });
        }
        @Test
        @DisplayName("O número excede o valor mínimo permitido. ")
        void testMultiplicacaoNumerosGrandesNegativos() {
            assertThrows(IllegalArgumentException.class, () -> {
                calculadora.multiplicacao(Integer.MIN_VALUE, -1);
            });
        }

    }
    @Nested
    @DisplayName("Testes de Divisão")
    class Divisao {

        @Test
        @DisplayName("A divisão com dividendo e divisor positivo retorna valor correto. ")
        void testDivisao_NumerosPositivos() {
            assertEquals(1, calculadora.divisao(numeroPositivoDoube, numeroPositivoDoube));
        }
        @Test
        @DisplayName("A divisão com dividendo positivo e divisor negativo retorna valor correto.  ")
        void testDivisao_NumeroPositivoENegativo() {
            assertEquals(-1.571, calculadora.divisao(numeroPositivoDoube, numeroNegativoDoube), 0.001);
        }
        @Test
        @DisplayName("A divisão com dividendo negativo e Didivisor positivo retorna o valor correto. ")
        void testDivisao_NumeroNegativoEPositivo() {
            assertEquals(-0.636, calculadora.divisao(numeroNegativoDoube, numeroPositivoDoube), 0.001);
        }
        @Test
        @DisplayName("A divisão com dividendo e divisor negativo retorna o valor correto. ")
        void testDivisao_NumerosNegativos() {
            assertEquals(1, calculadora.divisao(numeroNegativoDoube, numeroNegativoDoube));
        }
        @Test
        @DisplayName("A divisão com dividendo Zero retorna Zero. ")
        void testDivisao_DividendoZero() {
            assertEquals(0, calculadora.divisao(numeroZero, numeroPositivoDoube));
        }
        @Test
        @DisplayName("A divisão por Zero não é possivel. ")
        void testDivisaoPorZero() {
            assertThrows(IllegalArgumentException.class, () -> {
                calculadora.divisao(numeroPositivoDoube, numeroZero);
            });
        }

    }

    @Test
    void fatorial() {
    }

    @Test
    void potencia() {
    }
}