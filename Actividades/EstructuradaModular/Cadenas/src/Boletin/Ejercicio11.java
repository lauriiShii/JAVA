package Boletin;
import java.util.Scanner;

/**
 * Escribe un programa que dada una cadena de caracteres, dé la suma de todos
 * los dígitos que hay en ella. Por ejemplo, si la cadena es “abc12de3f4gh”,
 * dará como resultado 10.
 **/

public class Ejercicio11 {

	/** MAIN **/
	public static void main(String[] args) {

		// DECLARAMOS VARIABLES Y OBJETO TECLADO
		int resultado;
		String cad;
		Scanner teclado = new Scanner(System.in);

		// PEDIMOS CADENA
		System.out.print("Introduce  cadena: ");
		cad = teclado.nextLine();

		// SUMAMOS DIGITOS QUE HAY EN LA CADENA (función)
		resultado = contar(cad);

		// MOSTRAMOS RESULTADO
		System.out.println("La suma de los digitos es: " + resultado);

		// CERRAMOS TECLADO
		teclado.close();
	}

	/** FUNCIONES **/
	// FUNCIÓN CONTAR
	public static int contar(String cad) {

		// DECLARAMOS VARIABLES
		int i, resultado = 0;

		// SACAMOS CARACER A CARACTER LA CADENA
		// Recorremos la cadena de principio a fin
		for (i = 0; i < cad.length(); i++)

			// Compruebo si es un digito
			if (cad.charAt(i) >= '0' && cad.charAt(i) <= '9')
				// Si es un numero, obtenemos su valor y lo sumamos a un
				// acumulador
				resultado += Integer.parseInt(String.valueOf(cad.charAt(i)));

		// DEVOLVEMOS RESULTADO
		return resultado;
	}

}
