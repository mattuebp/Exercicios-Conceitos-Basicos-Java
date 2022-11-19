package exerciciosConceitosBasicos;

import java.util.Scanner;

public class QuadradoECubo {
	public static void main(String[] args) {
		// Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Esse programa calcula o quadrado e o cubo do valor inserido.\n");
		System.out.println("Digite o valor para fazer a operação: \n");
		Double valor = teclado.nextDouble();
		
		System.out.printf("O quadrado do número informado é %.2f e o cubo é %.2f.",
				Math.pow(valor, 2), Math.pow(valor, 3));		
		teclado.close();
		
	}

}
