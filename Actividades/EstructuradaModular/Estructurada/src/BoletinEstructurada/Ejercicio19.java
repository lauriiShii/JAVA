package BoletinEstructurada;
import java.util.Scanner;

public class Ejercicio19 {

	/**
	 * Realiza un programa que calcule xn, siendo x y n dos números enteros que
	 * se introducen por teclado. (Nota: no se puede utilizar Math.pow)
	 */
	public static void main(String[] args) {

		/** OBJETOS Y VARIABLES */
		Scanner teclado = new Scanner(System.in);
		int x, n, i, solucion;

		/** PEDIMOS DATOS AL USUARIO */
		System.out.println("Indica base: ");
		x = teclado.nextInt();
		System.out.println("Indica exponente: ");
		n = teclado.nextInt();

		teclado.close();

		/** CALCULO EXPONENCIAL */
		solucion = x;
		for (i = 1; i < n; i++) {
			solucion *= x;
		}
		System.out.println("El resultado es: " + solucion + ".");

	}

}
