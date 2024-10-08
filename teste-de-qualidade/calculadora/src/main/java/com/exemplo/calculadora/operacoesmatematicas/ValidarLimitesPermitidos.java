package com.exemplo.calculadora.operacoesmatematicas;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public abstract class ValidarLimitesPermitidos {

    protected void validarLimitePermitido(int a, int b) {
        if(a > 0 && b > 0 && (MAX_VALUE -a) < b) {
            throw new IllegalArgumentException(mensagemErroValorMinimo());
        }
        if(a < 0 && b < 0 && (MIN_VALUE -a) > b) {
            throw new IllegalArgumentException(mensagemErroValorMaximo());
        }

    }
    protected abstract String mensagemErroValorMaximo();
    protected abstract String mensagemErroValorMinimo();
}
