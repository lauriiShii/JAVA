package BoletinEstructurada;
import java.util.Scanner;

public class Ejercicio06 {

	/**
	 * Realizar un programa que dados tres números, los devuelva en orden
	 * ascendente.
	 */
	public static void main(String[] args) {

		// Declaramos variables y creamos el objeto teclado.
		Scanner teclado = new Scanner(System.in);
		double numero1, numero2, numero3;

		// introduciomos 3 numeros independientes
		System.out
				.println("introduce 3 numeros cualquiera enteros o decimales para ordenarlos de forma ascendente.");

		// numero1
		System.out.print("numero 1:");
		numero1 = teclado.nextDouble();

		// numero2
		System.out.print("numero 2:");
		numero2 = teclado.nextDouble();

		// numero3
		System.out.print("numero 3:");
		numero3 = teclado.nextDouble();

		// serie de sentencias en las que se puede encontrar los tres numeros e
		// imprimimos los numeros ordenados
		if ((numero1 <= numero2) && (numero2 <= numero3)
				&& (numero1 <= numero3)) {
			System.out.print("Los números ordenados son: ");
			System.out.print(numero1 + ", " + numero2 + " y " + numero3);
		}

		else if ((numero1 <= numero2) && (numero2 >= numero3)
				&& (numero1 <= numero3)) {
			System.out.print("Los números ordenados son: ");
			System.out.print(numero1 + ", " + numero3 + " y " + numero2);
		}

		else if ((numero1 <= numero3) && (numero2 <= numero1)
				&& (numero1 >= numero2)) {
			System.out.print("Los números ordenados son: ");
			System.out.print(numero2 + ", " + numero1 + " y " + numero3);
		}

		else if ((numero1 >= numero3) && (numero2 <= numero3)
				&& (numero1 >= numero2)) {
			System.out.print("Los números ordenados son: ");
			System.out.print(numero2 + ", " + numero3 + " y " + numero1);
		}

		else if ((numero1 >= numero2) && (numero2 >= numero3)
				&& (numero1 >= numero3)) {
			System.out.print("Los números ordenados son: ");
			System.out.print(numero3 + ", " + numero2 + " y " + numero1);
		}

		else if ((numero1 >= numero3) && (numero2 >= numero3)
				&& (numero1 <= numero2)) {
			System.out.print("Los números ordenados son: ");
			System.out.print(numero3 + ", " + numero1 + " y " + numero2);
		}

		// Cerramos teclado
		teclado.close();
	}

}