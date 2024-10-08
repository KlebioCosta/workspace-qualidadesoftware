package com.exemplo.calculadora.operacoesmatematicas;

import com.jayway.jsonpath.internal.function.numeric.Max;
import com.jayway.jsonpath.internal.function.numeric.Min;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
import static org.junit.jupiter.api.Assertions.*;

class OperadoresTest {

    private Operacoes calculadora;
    private int numeroPositivoInteiro;
    private int numeroNegativoInteiro;
    private int numeroZero;
    private double numeroPositivoDouble;
    private double numeroNegativoDouble;

    @BeforeEach
    void setUp() {
        calculadora = new Operacoes();
        numeroPositivoInteiro = 11;
        numeroNegativoInteiro = -7;
        numeroZero = 0;
        numeroPositivoDouble = 11.0;
        numeroNegativoDouble = -7.0;

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
                calculadora.adicao(MAX_VALUE, +1);
            });
        }
        @Test
        @DisplayName("O número negativo excede o tamanho Mínimo permitido. ")
        void testAdicao_NumerosGrandesNegativos() {
            assertThrows(IllegalArgumentException.class, () -> {
                calculadora.adicao(MIN_VALUE, -1);
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
        void testSubtracao_NumerosPsitovosENegativos() {
            assertEquals(18, calculadora.subtracao(numeroPositivoInteiro, numeroNegativoInteiro));
        }
        @Test
        @DisplayName("A subtração de dois números negativos retorna o valor correto. ")
        void testSubtracao_NumerosNegativos() {
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
                calculadora.subtracao(MAX_VALUE, +1);
            });
        }
        @Test
        @DisplayName("O número excede o limite minimo permitido ")
        void testSubtracao_NumerosGrandesNegativos() {
            assertThrows(IllegalArgumentException.class, () -> {
               calculadora.subtracao(MIN_VALUE, -1);
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
                calculadora.multiplicacao(MAX_VALUE, +1);
            });
        }
        @Test
        @DisplayName("O número excede o valor mínimo permitido. ")
        void testMultiplicacao_NumerosGrandesNegativos() {
            assertThrows(IllegalArgumentException.class, () -> {
                calculadora.multiplicacao(MIN_VALUE, -1);
            });
        }

    }

    @Nested
    @DisplayName("Testes de Divisão ")
    class Divisao {

        @Test
        @DisplayName("A divisão com dividendo e divisor positivo retorna valor correto. ")
        void testDivisao_NumerosPositivos() {
            assertEquals(1, calculadora.divisao(numeroPositivoDouble, numeroPositivoDouble), 0.001);
        }
        @Test
        @DisplayName("A divisão com dividendo positivo e divisor negativo retorna valor correto.  ")
        void testDivisao_NumeroPositivoENegativo() {
            assertEquals(-1.571, calculadora.divisao(numeroPositivoDouble, numeroNegativoDouble), 0.001);
        }
        @Test
        @DisplayName("A divisão com dividendo negativo e Didivisor positivo retorna o valor correto. ")
        void testDivisao_NumeroNegativoEPositivo() {
            assertEquals(-0.636, calculadora.divisao(numeroNegativoDouble, numeroPositivoDouble), 0.001);
        }
        @Test
        @DisplayName("A divisão com dividendo e divisor negativo retorna o valor correto. ")
        void testDivisao_NumerosNegativos() {
            assertEquals(1, calculadora.divisao(numeroNegativoDouble, numeroNegativoDouble));
        }
        @Test
        @DisplayName("A divisão com dividendo Zero retorna Zero. ")
        void testDivisao_DividendoZero() {
            assertEquals(0, calculadora.divisao(numeroZero, numeroPositivoDouble));
        }
        @Test
        @DisplayName("A divisão por Zero não é possivel. ")
        void testDivisaoPorZero() {
            assertThrows(IllegalArgumentException.class, () -> {
                calculadora.divisao(numeroPositivoDouble, numeroZero);
            });
        }
        @Test
        @DisplayName("O número excede o valor máximo permitido. ")
        void testDivisao_NumerosGrandesPermitidos() {
            assertThrows(IllegalArgumentException.class, () -> {
                calculadora.divisao(MAX_VALUE, +1);
            });
        }
        @Test
        @DisplayName("O número excede o valor mínimo permitido. ")
        void testDivisao_NumerosGrandesNegativos() {
            assertThrows(IllegalArgumentException.class, () -> {
                calculadora.divisao(MIN_VALUE, -1);
            });
        }

    }

    @Nested
    @DisplayName("Testes de Fatorial ")
    class Fatorial {
        @Test
        @DisplayName("Fatorial não definido para números negativos. ")
        void testFatorial_NumeroNegativo() {
            assertThrows(IllegalArgumentException.class, () -> {
               calculadora.fatorial(numeroNegativoInteiro);
            });
        }
        @Test
        @DisplayName("Fatorial de zero retorna o valor correto. ")
        void testFatorial_Zero() {
            assertEquals(1, calculadora.fatorial(numeroZero));
        }
        @Test
        @DisplayName("Fatorial números grandes positivos. ")
        void testFatorial_NumerosGrandesPsitovos() {
            assertThrows(IllegalArgumentException.class, () -> {
                calculadora.fatorial(MAX_VALUE + 1);
            });
        }
        @Test
        @DisplayName("Fatorial números grandes negativos. ")
        void testFatorial_NumerosGrandesNegativos() {
            assertThrows(IllegalArgumentException.class, () -> {
                calculadora.fatorial(MIN_VALUE + 1);
            });
        }
        @Test
        @DisplayName("Fatorial de número positivo retorna o valor correto. ")
        void testFatorial_NumerosPositivos() {
            assertEquals(39916800, calculadora.fatorial(numeroPositivoInteiro));
        }
    }


    @Nested
    @DisplayName("Testes de Potência")
    class Potencia {
        @Test
        @DisplayName("Potência com expoente Zero retorna o valor coreto. ")
        void testPotencia_ExpoenteZero() {
            assertEquals(1, calculadora.potencia(numeroPositivoInteiro, numeroZero));
        }
        @Test
        @DisplayName("Potência com base e expoente positivos retorna o valor correto. ")
        void testPotencia_ValoresPositivos() {
            assertEquals(285_311_670_611L, calculadora.potencia(numeroPositivoInteiro, numeroPositivoInteiro));
        }
        @Test
        @DisplayName("Potencia com expoente negativo. ")
        void testPotencia_ExpoenteNegativo() {
            assertEquals(5.1315811823070673E-8, calculadora.potencia(numeroPositivoInteiro, numeroNegativoInteiro));
        }
        @Test
        @DisplayName("Potencia com base e expoente negativo. ")
        void testPotencia_BaseEExpoenteNegativo() {
            assertEquals(-1.2142656789020123E-6, calculadora.potencia(numeroNegativoInteiro, numeroNegativoInteiro));
        }
    }
}