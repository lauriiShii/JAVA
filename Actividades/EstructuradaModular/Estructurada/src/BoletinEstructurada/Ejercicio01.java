package BoletinEstructurada;
import java.util.Scanner;

public class Ejercicio01 {
	/**
	 * Solicita al usuario un booleano, un entero, un carácter y un decimal.
	 * Pásalos todos a cadena utilizando el método valueOf de las cadenas.
	 * Luego, obtener una cadena resultante de concatenar todas las cadenas
	 * obtenidas anteriormente.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/** VARIABLES Y OBJETOS */
		Scanner teclado = new Scanner(System.in);
		boolean booleano;
		int entero;
		char caracter;
		double decimal;

		/** PEDIMOS DATOS AL USUARIO */
		System.out.print("Itroduce verdadero o falso: ");
		booleano = teclado.nextBoolean();
		System.out.print("Introduce un entero: ");
		entero = teclado.nextInt();
		System.out.print("Introduce un cararcter: ");
		caracter = teclado.next().charAt(0); // charAt coge el digito de la
												// posicion que se le marca
		System.out.print("Introduce un decimal: ");
		decimal = teclado.nextInt();

		teclado.close();

		/** CONSTRUIMOS CADENA */
		System.out.println("\nBoolean :" + String.valueOf(booleano)
				+ "\nEntero :" + String.valueOf(entero) + "\nCaracter :"
				+ String.valueOf(caracter) + "\nDecimal :"
				+ String.valueOf(decimal));

	}

}
