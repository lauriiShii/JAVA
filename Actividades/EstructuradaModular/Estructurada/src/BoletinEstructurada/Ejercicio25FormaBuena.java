package BoletinEstructurada;

import java.util.Scanner;

public class Ejercicio25FormaBuena {
	/*
	 * 1.-Petición de un número positivo.
	 * 2.-Hacer un bucle que me vaya obteniendo el número en orden inverso hasta que su cociente sea 0.
	 * 		2.1.-Le vamos dando la vuelta utilizando esta operación matemática:
	 * 			Ej: 123%10=3 && 123/10=12 12%10=2 && 12/10=1 1%10=1;
	 * 			El resto del número dividido entre 10 es igual al último número de x.
	 *  		y se continúa esta operación con el cociente.
	 *		2.2.-Y vamos guardando en una variable con esta:
		 * 			0*10+3=3 -> 3*10+2=32 -> 32*10+1=321
	 * 3.-Imprimir resultado.
	 */

	public static void main(String[] args) {
		// Declaración de variables.
		final int DIVISOR = 10;
		final String MENSAJEBIENVENIDA = "Introduzca un número positivo.";
		final String MENSAJEERROR = "¡El dato introducido debe ser un número positivo!";
		int num = 0, resultado = 0, cociente, resto;
		boolean error = true;
		
		Scanner teclado = new Scanner(System.in);

		// 1.-Petición de un número positivo.
		do {
				System.out.println(MENSAJEBIENVENIDA);
				num = teclado.nextInt();

				if (num <= 0) { //Incluimos el 0 porque con 0 no se puede hacer las operaciones.
					System.out.println(MENSAJEERROR);
					error = false;
				}
				else
					error = true;
		} while (!error);
		
		teclado.close();


		
		/*2.-Hacer un bucle que me vaya obteniendo el número en orden inverso hasta que el cociente sea 0.
		 * 		2.1.-Le vamos dando la vuelta utilizando esta operación matemática:
		 * 			123%10=3 -> 123/10=12 -> 12%10=2 -> 12/10=1 -> 1%10=1;
		 * 		2.2.-Y vamos guardando en una variable con esta:
		 * 			0*10+3=3 -> 3*10+2=32 -> 32*10+1=321
		 */
		cociente = num;
		while (cociente != 0) {
			resto = cociente % DIVISOR;
			cociente /= DIVISOR;
			resultado = resultado * DIVISOR + resto;//Dando la vuelta.
		}
		
		//3.-Mostramos resultado.
		System.out.printf("%d invertido es %d", num, resultado);
		
	}

}