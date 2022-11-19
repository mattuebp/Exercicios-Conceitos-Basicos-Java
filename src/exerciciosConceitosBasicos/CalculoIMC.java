package exerciciosConceitosBasicos;

import java.util.Locale;
import java.util.Scanner;

public class CalculoIMC {
	public static void main(String[] args) {
		// Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
		
		System.out.println("Esse programa calcula o seu Índice de Massa Corporal (IMC).\n");
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);
		
		System.out.println("Digite o seu peso em Kg:\n ");
		Double peso = teclado.nextDouble();		
		
		System.out.println("Digite a sua altura em metros:\n ");
		Double altura = teclado.nextDouble();		
		
		//double IMC = peso / (altura * altura);
		
		System.out.println("O seu índice de massa corpotal é: " + (peso / altura * altura));
		
		teclado.close();
		
		}
}
