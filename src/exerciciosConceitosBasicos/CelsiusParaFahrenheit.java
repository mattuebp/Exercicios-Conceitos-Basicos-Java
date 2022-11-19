package exerciciosConceitosBasicos;

import java.util.Scanner;

public class CelsiusParaFahrenheit {
	public static void main(String[] args) {
		// Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira a terperatura em graus °C: ");
		String temperaturaCelsius = teclado.next().replace(",", ".");
		
		double temperaturaFahrenheit = Double.parseDouble(temperaturaCelsius) * 1.8 + 32;
		System.out.println("A temperatura convertida em °F é: " + temperaturaFahrenheit);
		teclado.close();
	}

}
