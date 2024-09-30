package com.exemplo.calculadora.operacoesmatematicas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;
    private int numeroPositivo;
    private int numeroNegativo;
    private int numeroZero;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
        numeroPositivo = 11;
        numeroNegativo = -7;
        numeroZero = 0;

    }

    @Nested
    @DisplayName("Testes de Adição ")
    class TestAdicao {

        @Test
        @DisplayName("A soma de dois números positivos retorna o valor correto. ")
        void testAdicao_NumerosPositivos() {
            assertEquals(22, calculadora.adicao(numeroPositivo, numeroPositivo));
        }
        @Test
        @DisplayName("A soma de um número negativo e um número positivo resulta subtração e mantem o sinal do maior número. ")
        void testAdicao_NumeroNegativoEPositivo() {
            assertEquals(4, calculadora.adicao(numeroNegativo, numeroPositivo));
        }
        @Test
        @DisplayName("A soma de dois números negativos resulta em somar os valores e manter o sinal. ")
        void testAdicao_NumerosNegativos() {
            assertEquals(-14, calculadora.adicao(numeroNegativo, numeroNegativo));
        }
        @Test
        @DisplayName("O número somado com zero resulta no valor do proprio número. ")
        void testAdicao_NumeroZero() {
            assertEquals(11, calculadora.adicao(numeroZero, numeroPositivo));
        }
        @Test
        @DisplayName("O número exede o tamanho Máximo permitido. ")
        void testAdicao_NumerosGrandesPositivos() {
            assertThrows(IllegalArgumentException.class, () -> {
                calculadora.adicao(Integer.MAX_VALUE, +1);
            });
        }
        @Test
        @DisplayName("O número negativo exede o tamanho Mínimo permitido. ")
        void testAdicao_NumerosGrandesNegativos() {
            assertThrows(IllegalArgumentException.class, () -> {
                calculadora.adicao(Integer.MIN_VALUE, -1);
            });

        }

    }


    @Test
    void subtracao() {
    }

    @Test
    void multiplicacao() {
    }

    @Test
    void divisao() {
    }

    @Test
    void fatorial() {
    }

    @Test
    void potencia() {
    }
}