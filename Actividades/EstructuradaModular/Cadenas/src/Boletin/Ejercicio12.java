package Boletin;
import java.util.Scanner;

/**
 * Reemplazar todas las apariciones de un carácter en una cadena por un
 * asterisco. El resultado queda en otra cadena. No se puede usar la función
 * replace.
 **/

public class Ejercicio12 {

	public static void main(String[] args) {

		// DECLARAMOS VARIABLES Y OBJETO TECLADO
		Scanner teclado = new Scanner(System.in);
		String cad, resultado = "";
		char caracter;
		int i;

		// PEDIMOS CADENA Y CARACTER PARA SUSTITUIR
		// Pedimos cadena
		do {
			System.out.print("Introduce una cadena: ");
			// Convertimos la cadena en minusculas y quitamos los caracteres en
			// blanco al principio y al final
			cad = teclado.nextLine().toLowerCase().trim();

			// Controlamos que no sea una cadena vacía
			if (cad.length() == 0)
				System.out.println("¡ERROR! La cadena no puede estar vacía");

		} while (cad.length() == 0);

		// Pedimos caracter que queremos sustituir
		do {
			System.out
					.print("Introduce un caracter que exista en la cadena para sustituirlo por *: ");
			// Convertimos la cadena en minusculas y quitamos los caracteres en
			// blanco al principio y al final
			caracter = teclado.nextLine().toLowerCase().trim().charAt(0);

			// Controlamos que no introduzca más de un caracter
			if (caracter == 0)
				System.out.println("¡ERROR! Introduce un solo caracter.");

		} while (caracter == 0);

		// COMPROBAMOS SI EXISTE Y REEMPLAZAMOS EL CARACTER DADO POR UN
		// ASTERISCO
		// Recorremos el bucle buscando el caracter
		for (i = 0; i <= cad.length() - 1; i++){
			
			// Si caracter es igual al caracter para sustituir se sustituye
			if (cad.charAt(i) == caracter)
				
				// El resultado se almacena en otra variable
				resultado += "*";
			
			// Sino no sconcatenamos el caracter que corresponda
			else 
				resultado+=cad.charAt(i)+"";
		}
		
		// MOSTRAMOS CADENA FINAL
		System.out.printf("La cadena \"%s\", con todos los carácteres \"%c\", remplazados por \"*\" queda: \"%s\"%n",cad, caracter, resultado);
		
		// CERRAMOS TECLADO
		teclado.close();
	}

}
