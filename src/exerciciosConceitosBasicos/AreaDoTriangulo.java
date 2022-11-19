package exerciciosConceitosBasicos;

import java.util.Scanner;

public class AreaDoTriangulo {
	public static void main(String[] args) {
		// Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
		
		System.out.println("Esse programa calcula a área de um triangulo dados sua base e altura em metros.");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a medida da base do triângulo em metros: \n");
		Double base = teclado.nextDouble();
		
		System.out.println("Informe a medida da altura do triângulo em metros: \n");
		Double altura = teclado.nextDouble();
		
		System.out.printf("A área do triangulo mede %.2f m².", base * altura / 2);
		
		
		
		teclado.close();
	}

}
