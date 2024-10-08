package com.exemplo.calculadora.operacoesmatematicas;

public class Operacoes extends ValidarLimitesPermitidos implements Operadores {

    @Override
    public int adicao(int a, int b) {
        validarLimitePermitido(a, b);
        return a + b;
    }


    @Override
    public int subtracao(int a, int b) {
        validarLimitePermitido(a, b);
        return a - b;
    }


    @Override
    public int multiplicacao(int a, int b) {
        validarLimitePermitido(a, b);
        return a * b;
    }

    @Override
    public double divisao(double a, double b) {
        validarLimitePermitido((int) a, (int) b);
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
    public double potencia(long base, long expoente) {
        if(expoente == 0) {
           return 1;
        }
        if(expoente < 0) {
            return 1.0/ potencia(base, -expoente);
        }
        return base * potencia(base, expoente - 1);
    }



    @Override
    protected String mensagemErroValorMaximo() {
        return "O valor ultrapassa o máximo permitido.";
    }

    @Override
    protected String mensagemErroValorMinimo() {
        return "O valor ultrapassa o mínimo permitido.";
    }
}
