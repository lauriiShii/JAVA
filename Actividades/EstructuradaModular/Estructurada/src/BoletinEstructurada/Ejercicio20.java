package BoletinEstructurada;
import java.util.Scanner;

public class Ejercicio20 {

	/**
	 * Realiza un programa que calcule el factorial de un número entero positivo
	 * que se introduce por teclado. El factorial de un número entero positivo n
	 * se define como el producto de todos los números enteros positivos desde 1
	 * hasta n: n! = 1 * 2 * ….* (n-1) * n
	 */
	public static void main(String[] args) {

		/** OBJETOS Y VARIABLES */
		Scanner teclado = new Scanner(System.in);
		int num, factorial = 1, i;

		/** PEDIMOS DATOS AL USUARIO */
		do {
			System.out.println("Indica un munero: ");
			num = teclado.nextInt();
			if (num <= 0)
				System.out.println("ANo puede ser menor o igual a 0.");
		} while (num <= 0);

		teclado.close();

		/** CALCULAMOS FACTORIAL */
		for (i = 1; i <= num; i++)
			factorial *= i;

		System.out.printf("El factorial de %d es %d", num, factorial);

	}

}
