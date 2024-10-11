package com.exemplo.calculadora.operacoesmatematicas;

import java.math.BigInteger;

public interface Operadores {
    int adicao(int a, int b) throws IllegalArgumentException;
    int subtracao(int a, int b)throws IllegalArgumentException;
    int multiplicacao(int a, int b)throws IllegalArgumentException;
    double divisao(double a, double b) throws IllegalArgumentException;
    BigInteger fatorial(int a) throws IllegalArgumentException;
    double potencia(long base, long expoente);

}
