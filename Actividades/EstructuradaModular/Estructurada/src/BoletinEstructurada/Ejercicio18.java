package BoletinEstructurada;
import java.util.Scanner;


public class Ejercicio18 {

	/**
	 * Escribe un algoritmo que lea tres n�meros positivos y compruebe si son
	 * iguales. Por ejemplo: Si la entrada fuese 5 5 5, la salida deber�a ser
	 * �hay tres n�meros iguales a 5�. Si la entrada fuese 4 6 4, la salida
	 * deber�a ser �hay dos n�meros iguales a 4�. Si la entrada fuese 0 1 2, la
	 * salida deber�a ser �no hay n�meros iguales�.
	 */
	public static void main(String[] args) {

		/** OBJETOS Y VARIABLES */
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3;

		/** PEDIMOS DATOS AL USUARIO */

		System.out.println("Indica n�mero 1: ");
		num1 = teclado.nextInt();
		System.out.println("Indica n�mero 2: ");
		num2 = teclado.nextInt();
		System.out.println("Indica n�mero 3: ");
		num3 = teclado.nextInt();

		teclado.close();
		
		/**COMPROBAMOS IGUALDAD*/
		if (num1 == num2 && num1 == num3 && num2 == num3) 
			System.out.println("Hay tres n�meros iguales a "+num1);
		else if (num1 == num2) 
			System.out.println("Hay dos n�meros iguales a "+num1);
		else if (num2 == num3) 
			System.out.println("Hay dos n�meros iguales a "+num3);
		else if (num1 == num3) 
			System.out.println("Hay dos n�meros iguales a "+num3);
		else 
			System.out.println("No hay n�meros iguales");
		
	}

}
