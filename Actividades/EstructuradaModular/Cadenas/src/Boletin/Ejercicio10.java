package Boletin;
import java.util.Scanner;

/** Copiar los caracteres de una cadena en orden inverso en otra cadena. **/

public class Ejercicio10 {

	public static void main(String[] args) {

		// DECLARAMOS VARIABLES Y OBJETO TECLADO
		Scanner teclado = new Scanner(System.in);
		String cad, resultado = "";
		int i;

		// PEDIMOS UNA CADENA
		do {
			System.out.print("Introduce una cadena: ");
			cad = teclado.nextLine().trim(); // Se quita los espacios que haya
												// delante y detras de la cadena

			// Controlamos que no sea una cadena vac�a
			if (cad.length() == 0)
				System.out.println("�ERROR! La cadena no puede estar vac�a");
		} while (cad.length() == 0);

		// INVERTIMOS LA CADENA Y LA ALMACENAMOS EN OTRA VARIABLE
		// Recorremos la cadena alrev�s
		for (i = cad.length() - 1; i >= 0; i--)

			// Creamos la cadena invertida en resultado
			resultado += cad.charAt(i) + "";

		// MOSTRAMOS CADENA INVERTIDA
		System.out.printf("\"%s\" Invertido es igual a \"%s\"%n", cad,
				resultado);

		// CERRAMOS TECLADO
		teclado.close();
	}

}
