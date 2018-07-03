package BoletinEstructurada;
import java.util.Scanner;

public class Ejercicio29 {
	/**
	 * Escribe un algoritmo que imprima una pirámide de dígitos como la de la
	 * figura, tomando como entrada el número de filas de la misma.
	 */
	public static void main(String[] args) {

		/** OBJETOS Y VARIABLES */
		Scanner teclado = new Scanner(System.in);
		int num, i, j, k, l;
		final char ESPACIO = ' ';

		/** PEDIMOS DATOS */
		do {
			System.out.print("Introduce numero mayor que 1: ");
			num = teclado.nextInt();
		} while (num <= 1);

		teclado.close();

		/** CREAMOS PIRAMIDE */
		// Creamos fila
		for (i = 0; i <= num; i++) {
			for (j = 1; j <= (num - i); j++)
				// Imprimimos los espacios por fila
				System.out.print(ESPACIO);
			for (k = 1; k <= i; k++)
				// Imprimimos caracteres por fila
				System.out.print(k);
			for (l = (i - 1); l >= 1; l--)
				// Imprimimos caracteres por fila
				System.out.print(l);

			// Sato de linea
			System.out.println("");
		}

	}

}