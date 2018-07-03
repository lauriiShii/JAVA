package Boletin;
import java.util.Scanner;

public class Ejercicio03 {

	/** Contar el número de vocales que tiene una cadena. */
	public static void main(String[] args) {

		/** VARIABLES Y OBJETOS */
		Scanner teclado = new Scanner(System.in);
		String cadena, resultado;

		/** PEDIMOS DATOS */
		System.out.print("Introduce una cadena: ");
		cadena = teclado.nextLine();

		teclado.close();

		/** CONTAMOS VOCALES */
		// Pasamos la cadena a minusculas para que la comprobacion sea más
		// simple
		resultado = cadena.toLowerCase();

		// Remplaza por "" todos los caracteres que no sean vocales acentuadas o
		// no.
		resultado = cadena.replaceAll("[^aeiouáéíóú]", "");
		// Mostramos
		System.out.printf("%nEsta cadena \"%s\" contiene %d vocales.%n",
				cadena, resultado.length());

	}

}
