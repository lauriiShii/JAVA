package BoletinEstructurada;
import java.util.Scanner;

public class Ejercicio28 {
	/**
	 * Elabore un programa que imprima el tri�ngulo hasta un valor dado. El
	 * tri�ngulo contiene los n�meros naturales correlativos, uno en la primera
	 * l�nea, dos en la segunda, etc.; es decir, en la fila n-esima aparecen n
	 * valores.
	 */
	public static void main(String[] args) {
		
		/** OBJETOS Y VARIABLES */
		Scanner teclado = new Scanner(System.in);
		int num, i, j ,k ;
		final char ESPACIO = ' ';

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
			
			for (k = 1; k <= i+1; k++)
				// Imprimimos caracteres por fila
				System.out.print(k+" ");
			
			//Sato de linea
			System.out.println("");
		}

	}

}
