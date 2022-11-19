package exerciciosConceitosBasicos;

import java.util.Scanner;

public class FahrenheitParaCelsius {
	public static void main(String[] args) {
		// Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira a terperatura em graus °F: ");
		String temperaturaFahrenheit = teclado.next().replace(",", ".");
		
		double temperaturaCelsius = (Double.parseDouble(temperaturaFahrenheit) - 32) / 1.8;
		System.out.println("A temperatura convertida em °C é: " + temperaturaCelsius);
		teclado.close();
	}

}
