package com.exemplo.calculadora.operacoesmatematicas;

public class Operacoes extends ValidarLimitesPermitidos implements Operadores {

    @Override
    public int adicao(int a, int b) {
        validarLimitesInteiros(a, b);
        return a + b;
    }


    @Override
    public int subtracao(int a, int b) {
        validarLimitesInteiros(a, b);
        return a - b;
    }


    @Override
    public int multiplicacao(int a, int b) {
        validarLimitesInteiros(a, b);
        return a * b;
    }

    @Override
    public double divisao(double a, double b) {
        if(b == 0) {
            throw new IllegalArgumentException ("Divisão por zero não é possivel. ");
        }
        return a / b;
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



    @Override
    protected String mensagemErroMaximo() {
        return "O valor ultrapassa o máximo permitido.";
    }

    @Override
    protected String mensagemErroMinimo() {
        return "O valor ultrapassa o mínimo permitido.";
    }
}
