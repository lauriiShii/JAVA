package BoletinEstructurada;
import java.util.Scanner;


public class Ejercicio18 {

	/**
	 * Escribe un algoritmo que lea tres números positivos y compruebe si son
	 * iguales. Por ejemplo: Si la entrada fuese 5 5 5, la salida debería ser
	 * “hay tres números iguales a 5”. Si la entrada fuese 4 6 4, la salida
	 * debería ser “hay dos números iguales a 4”. Si la entrada fuese 0 1 2, la
	 * salida debería ser “no hay números iguales”.
	 */
	public static void main(String[] args) {

		/** OBJETOS Y VARIABLES */
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3;

		/** PEDIMOS DATOS AL USUARIO */

		System.out.println("Indica número 1: ");
		num1 = teclado.nextInt();
		System.out.println("Indica número 2: ");
		num2 = teclado.nextInt();
		System.out.println("Indica número 3: ");
		num3 = teclado.nextInt();

		teclado.close();
		
		/**COMPROBAMOS IGUALDAD*/
		if (num1 == num2 && num1 == num3 && num2 == num3) 
			System.out.println("Hay tres números iguales a "+num1);
		else if (num1 == num2) 
			System.out.println("Hay dos números iguales a "+num1);
		else if (num2 == num3) 
			System.out.println("Hay dos números iguales a "+num3);
		else if (num1 == num3) 
			System.out.println("Hay dos números iguales a "+num3);
		else 
			System.out.println("No hay números iguales");
		
	}

}
