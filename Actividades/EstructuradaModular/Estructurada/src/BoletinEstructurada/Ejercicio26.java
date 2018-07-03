package BoletinEstructurada;
import java.util.Scanner;

public class Ejercicio26 {
	/**
	 * Escribe un algoritmo que lea un número natural n por teclado y dibuje un
	 * triángulo de asteriscos con base y altura n. Por ejemplo si n = 5 debería
	 * dibujarse:
	 */
	public static void main(String[] args) {

		/** OBJETOS Y VARIABLES */
		Scanner teclado = new Scanner(System.in);
		int num, i, j ,k ;
		final char ESPACIO = ' ';
		final String ASTERISCO = "*";
		final String FONDO_AZUL = "\u001B[44m";
		final String CELESTE = "\u001B[36m";
		final String RESET = "\u001B[0m";

		/** PEDIMOS DATOS */
		do {
			System.out.print("Introduce numero mayor que 1: ");
			num = teclado.nextInt();
		} while (num <= 1);

		teclado.close();

		/** CREAMOS PIRAMIDE */
		//Creamos fila
		for (i = 0; i < num; i++) {
			for (j = 0; j <= num - i; j++)  
				// Imprimimos los espacios por fila
				System.out.print(ESPACIO);
			
			for (k = 0; k <= i; k++)
				// Imprimimos caracteres por fila
				System.out.print(FONDO_AZUL+CELESTE+ASTERISCO+RESET+ESPACIO);
			
			//Sato de linea
			System.out.println("");
		}

	}

}
