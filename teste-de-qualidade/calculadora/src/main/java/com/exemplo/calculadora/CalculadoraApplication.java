package com.exemplo.calculadora;

import com.exemplo.calculadora.operacoesmatematicas.Operacoes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigInteger;
import java.util.Scanner;

@SpringBootApplication
public class CalculadoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraApplication.class, args);

		Operacoes operacoes = new Operacoes();
		Scanner sc = new Scanner(System.in);

		while(true) {
			try {
				System.out.println("-=-=-=-= Menu da Calculadora =-=-=-=-");
				System.out.println("1. Adição");
				System.out.println("2. Subtração");
				System.out.println("3. Multiplicação");
				System.out.println("4. Divisão");
				System.out.println("5. Fatorial");
				System.out.println("6. Potência");
				System.out.println("0. Sair");
				System.out.println("-=-=-=-=-=-=--*-*-*-*-*--=-=-=-=-=-=-");

				System.out.print("Escolha uma operação: ");

				int opcao = entradaUsuario(sc);

				switch (opcao) {
					case 1:
						int[] valoresAdicao = capturarNumerosInt(sc, "Adção");
						int resultAdicao = operacoes.adicao(valoresAdicao[0], valoresAdicao[1]);
						System.out.println("Resultado: " + resultAdicao);
						break;
					case 2:
						int[] valoresSubtracao = capturarNumerosInt(sc, "Subtração");
						int resultSubtracao = operacoes.subtracao(valoresSubtracao[0], valoresSubtracao[1]);
						System.out.println("Resultado: " + resultSubtracao);
						break;
					case 3:
						int[] valoresMultiplicacao = capturarNumerosInt(sc, "Multiplicação");
						int resultMultiplicacao = operacoes.multiplicacao(valoresMultiplicacao[0], valoresMultiplicacao[1]);
						System.out.println("Resultado: " + resultMultiplicacao);
						break;
					case 4:
						double[] valoresDivisao = capturarNumerosDouble(sc, "Divisão");
						double resultDivisao = operacoes.divisao(valoresDivisao[0], valoresDivisao[1]);
						System.out.printf("\nResultado: %.3f\n", resultDivisao);
						break;
					case 5:
						System.out.println("Digite um valor para o fatorial: ");
						int fatorialNumero = entradaUsuario(sc);
						BigInteger resultadoFatorial = operacoes.fatorial(fatorialNumero);
						System.out.println("Resultado: " + resultadoFatorial);
						break;
					case 6:
						System.out.println("Digite a base: ");
						long base = sc.nextLong();
						System.out.println("Digite o expoente: ");
						long expoente = sc.nextLong();
						double resultadoPotencia = operacoes.potencia(base, expoente);
						System.out.println("Resultado: " + resultadoPotencia);
						break;
					case 0:
						System.out.println("Finalizando...");
						 sc.close();
						 return;
					default:
						System.out.println("Opcao inválida. Tente novamente. ");
				}

			} catch (Exception e) {
				System.out.println("Erro: " + e.getMessage());
				sc.nextLine();
			}
		}
    }


	private static int entradaUsuario(Scanner sc) {
		while(!sc.hasNextInt()) {
			System.out.println("Valor invalido. Por favor insira apenas números válidos! ");
			System.out.println("Digite um número: ");
			sc.next();
		}
		return sc.nextInt();
	}

	private static int[] capturarNumerosInt(Scanner sc, String operacao) {
		System.out.println("Digite o primeiro valor para " + operacao + ": ");
		int a = entradaUsuario(sc);
		System.out.print("Digite o segundo número para " + operacao + ": ");
		int b = entradaUsuario(sc);
		return new int[]{a, b};
	}
	private static double[] capturarNumerosDouble(Scanner sc, String operacao) {
		System.out.println("Digite o primeiro valor para " + operacao + ": ");
		while (!sc.hasNextDouble()) {
			System.out.println("Valor invalido. Por favor insira apenas números validos: ");
			sc.next();
		}
		double a = sc.nextDouble();

		System.out.print("Digite o segundo número para " + operacao + ": ");
		while (!sc.hasNextDouble()) {
			System.out.print("Valor invalido. Por favor, insira apenas números validos: ");

			sc.next();
		}
		double b = sc.nextDouble();
		return new double[]{a, b};
	}

}
