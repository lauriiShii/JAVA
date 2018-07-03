package BoletinEstructurada;
import java.util.Scanner;

public class Ejercicio27 {
	/**
	 * Escribe un algoritmo que lea un número natural n y un carácter por
	 * teclado. La salida debe ser un rombo compuesto del carácter y de la
	 * anchura que especifica el número n. Por ejemplo, si n es 5 y el carácter
	 * es *, el rombo sería:
	 */
	public static void main(String[] args) {
		
		/** OBJETOS Y VARIABLES */
		Scanner teclado = new Scanner(System.in);
		int num, linea, j ,k ;
		final char ESPACIO = ' ';
		final String ASTERISCO ="* ";

		/** PEDIMOS DATOS */
		do {
			System.out.print("Introduce numero mayor que 1: ");
			num = teclado.nextInt();
		} while (num <= 1);

		teclado.close();

		/** CREAMOS ROMBO */
		//DERECHA
		for (linea = 0; linea < num; linea++) {
			for (j = 0; j < num-linea; j++)  
				// Imprimimos los espacios por fila
				System.out.print(ESPACIO);
			
			for (k = 0; k <= linea; k++)
				// Imprimimos caracteres por fila
				System.out.print(ASTERISCO);
			
			//Sato de linea
			System.out.println("");
		}
		//ALREVES
		for (linea = 1; linea < num; linea++) {
			for (j = 0; j <= linea; j++)  
				// Imprimimos los espacios por fila
				System.out.print(ESPACIO);
			
			for (k = 0; k <num - linea; k++)
				// Imprimimos caracteres por fila
				System.out.print(ASTERISCO);
			
			//Sato de linea
			System.out.println("");
		}

	}

}
