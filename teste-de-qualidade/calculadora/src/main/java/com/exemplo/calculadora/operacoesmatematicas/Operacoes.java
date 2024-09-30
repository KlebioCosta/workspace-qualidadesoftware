package com.exemplo.calculadora.operacoesmatematicas;

public interface Operacoes {
    int adicao(int a, int b) throws IllegalArgumentException;
    int subtracao(int a, int b);
    int multiplicacao(int a, int b);
    double divisao(int a, int b) throws IllegalArgumentException;
    int fatorial(int a) throws IllegalArgumentException;
    int potencia(int base, int expoente);

}
