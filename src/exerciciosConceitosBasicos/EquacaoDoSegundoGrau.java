package exerciciosConceitosBasicos;

import java.util.Scanner;

public class EquacaoDoSegundoGrau {
	public static void main(String[] args) {
//		Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0)
//		utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13.
//		Encontre o delta.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Esse programa resolve equações do 2° grau.");
		System.out.println("Considerando o formato de equação Ax² + Bx + C = 0,"
				+ " informe os valores de Ax², Bx e C, respectivamente: \n");
		Double a = teclado.nextDouble();
		Double b = teclado.nextDouble();
		Double c = teclado.nextDouble();
		
		Double delta = Math.pow(b, 2) - 4*a*c;
		Double x1 = (-b + Math.sqrt(delta)) / 2*a;
		Double x2 = (-b - Math.sqrt(delta)) / 2*a;
		
		System.out.printf
		("As raízes dessa equação são %.1f e %.1f", x1, x2);
		teclado.close();
	}

}
