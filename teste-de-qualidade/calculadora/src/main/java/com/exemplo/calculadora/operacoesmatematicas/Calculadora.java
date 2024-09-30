package com.exemplo.calculadora.operacoesmatematicas;

public class Calculadora implements Operacoes{

    @Override
    public int adicao(int a, int b) {
        if(a > 0 && b > 0 && (Integer.MAX_VALUE - a) < b) {
            throw new IllegalArgumentException("A soma ultrapassa o valor máximo permitido. ");
        }
        if(a < 0 && b < 0 && (Integer.MIN_VALUE - a) > b) {
            throw new IllegalArgumentException("a soma ultrapassa o valor negativo mínimo permitido. ");
        }
        return a + b;
    }

    @Override
    public int subtracao(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplicacao(int a, int b) {
        return a * b;
    }

    @Override
    public double divisao(int a, int b) {

        if(b == 0) {
            throw new IllegalArgumentException (
                    "Divisão por zero não permitido. ");
        }
        double resultado = (double) a / b;
        return Double.parseDouble((String.format("%.3f", resultado)));
    }

    @Override
    public int fatorial(int a) {
        if(a < 0) {
            throw new IllegalArgumentException("Fatorial negativo não peritido");
        }
        if(a == 0) {
            return 1;
        }
        return a * fatorial(a - 1);
    }
    @Override
    public int potencia(int base, int expoente) {
        if(expoente < 0) {
            throw new IllegalArgumentException("Expoente não pode ser negativo. ");
        }
        if(expoente == 0) {
           return 1;
        }
        return base * potencia(base, expoente - 1);
    }
}
