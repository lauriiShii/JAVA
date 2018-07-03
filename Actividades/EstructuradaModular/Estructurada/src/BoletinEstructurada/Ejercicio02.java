package BoletinEstructurada;
import java.util.Scanner;

public class Ejercicio02 {

	/**
	 * Hacer un programa que lea por teclado un n�mero entero y nos diga si el
	 * n�mero es positivo, negativo o cero.
	 */
	public static void main(String[] args) {

		/** VARIABLES Y OBJETOS */
		Scanner teclado = new Scanner(System.in);
		int num;
		
		/**PADIMOS NUMERO*/
		System.out.println("Escribe un numero: ");
		num = teclado.nextInt();
		teclado.close();
		
		/**COMPROBAMOS QUE ES EL NUMERO*/
		if (num >= 1)
			System.out.println("El n�mero introducido es positivo.");

		else if (num <= -1)
			System.out.println("El n�mero introducido es negativo.");

		else
			System.out.println("El n�mero introducido es cero.");

	}

}
