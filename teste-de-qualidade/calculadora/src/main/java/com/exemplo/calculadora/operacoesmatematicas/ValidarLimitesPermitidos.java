package com.exemplo.calculadora.operacoesmatematicas;

public abstract class ValidarLimitesPermitidos {

    protected void validarLimitesInteiros(int a, int b) {
        if(a > 0 && b > 0 && (Integer.MAX_VALUE - a) < b) {
            throw new IllegalArgumentException(mensagemErroMaximo());
        }
        if(a < 0 && b < 0 && (Integer.MIN_VALUE - a) > b) {
            throw new IllegalArgumentException(mensagemErroMinimo());
        }
    }
    protected abstract String mensagemErroMaximo();
    protected abstract String mensagemErroMinimo();
}
