package BoletinEstructurada;
import java.util.Scanner;

public class Ejercicio21 {
	/**
	 * Realiza un programa que encuentre el primer valor N para el que la suma 1
	 * + 2 + 3 + ... + N exceda a un valor M que se introduce por teclado.
	 */
	public static void main(String[] args) {

		/** OBJETOS Y VARIABLES */
		Scanner teclado = new Scanner(System.in);
		int M, N = 1, i = 0;

		/** PEDIMOS DATOS AL USUARIO */
		do {
			System.out.println("Indica un munero: ");
			M = teclado.nextInt();
			if (M <= 0)
				System.out.println("ANo puede ser menor o igual a 0.");
		} while (M <= 0);

		teclado.close();

		/** BUSCAMOS UN N SUPERIOR QUE M */
		while (N < M) {
			N += i;
			i++;
		}

		System.out.printf("El numero que excede a %d es %d", M, N);
	}

}
