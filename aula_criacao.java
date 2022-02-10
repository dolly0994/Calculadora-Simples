package com.dio;

import java.util.Locale;
import java.util.Scanner;

public class aula_criacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char resp;

		do {
			System.out.println("Entre com dois valores!");

			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();

			System.out.println("Escolha a operacão que deseja fazer com os valores informados:");
			System.out.print("Soma(+) " + "Subtracão(-) " + "Multiplicacão(*) " + "Divisão(/)");
			System.out.println("");
			char ope = sc.next().charAt(0);

			switch (ope) {

			case '+':
				Calculadora.Soma(valor1, valor2);
				break;

			case '-':
				Calculadora.Subtracao(valor1, valor2);
				break;

			case '*':
				Calculadora.Multiplicacao(valor1, valor2);
				break;

			case '/':
				Calculadora.Divisao(valor1, valor2);
				break;
			}

			System.out.println("");
			System.out.print("Deseja fazer outra operacão? (s/n)");
			resp = sc.next().charAt(0);

		} while (resp == 's');

		sc.close();

	}

	public static class Calculadora {

		public static void Soma(double a, double b) {

			double resultado = a + b;
			System.out.println("Resultado da soma: " + resultado);

		}

		public static void Subtracao(double a, double b) {

			double resultado = a - b;
			System.out.println("Resultado da subtracao: " + resultado);

		}

		public static void Multiplicacao(double a, double b) {

			double resultado = a * b;
			System.out.printf( "Resultado da multiplicacão: %.5f%n", resultado);

		}

		public static void Divisao(double a, double b) {

			if (a > b) {
				double resultado = a / b;
				System.out.println("Resultado da divisão: " + resultado);
			} else if(a<b) {
				System.out.println("Impossivel de realizar");
			}

		}

	}

}
