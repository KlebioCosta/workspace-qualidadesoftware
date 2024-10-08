package com.exemplo.calculadora;

import com.exemplo.calculadora.operacoesmatematicas.Operacoes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculadoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraApplication.class, args);

		Operacoes operacoes = new Operacoes();
		 double result = operacoes.potencia(-7, -7);
		System.out.println(result);
	}



}
