package Boletin;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Copiar en una cadena los primeros n caracteres de otra cadena. No se puede
 * usar el método substring.
 **/

public class Ejercicio08 {

	public static void main(String[] args) {

		// DECLARAMOS VARIABLES Y OBJETO TECLADO
		Scanner teclado = new Scanner(System.in);
		String cad, resultado="";
		int caracter=0, i;
		boolean error = false;
		
		// PEDIMOS UNA CADENA Y NUMERO DE LOS PRIMEROS CARACTERES
		// Pedimos cadena
		do {
			System.out.print("Introduce una cadena: ");
			cad = teclado.nextLine();
			
			//Controlamos que no sea una cadena vacía
			if(cad.length() == 0)
				System.out.println("¡ERROR! La cadena no puede estar vacía");
			
		} while (cad.length() == 0);
		
		// Pedimos n caracteres
		do {
			try {
				do {
					System.out
							.print("Introduce el numero de caracteres primeros que quieres tener en otra cadena: ");
					caracter = teclado.nextInt();

					// Controlamos que el numero de caracter exista en la cadena
					// introducida o que el valor no sea 0
					if (caracter > cad.length() || caracter == 0)
						System.out
								.println("¡ERROR! No se puede trabajar con el número de caracteres que has introducido, la cadena anterior no contiene el número caracteres introducidos.");

				} while (caracter > cad.length() || caracter == 0);
				// Error es falso.
				error = false;

				// Si el tipo de dato no es correcto rescatamos la excepción
			} catch (InputMismatchException e) {

				// Imprimimos el mensaje de error
				System.out
						.printf("¡¡ERROR!! El valor introducido no es reconocido, por favor introduce un número decimal");
				teclado.nextLine();// Limpiamos el buffer

				// Error es verdadero
				error = true;
			}
		} while (error);

		// COPIAMOS EN OTRA CADENA LOS N CARACTERES
		// Recorreresultado += cad.charAt(i) + "";mos la cadena hasta llegar al caracter n
		for (i = 0; i <= caracter - 1; i++)
			
			// extraemos el primer trozo de cadena metiendolo en otra cadena
			resultado += cad.charAt(i) + "";

		// MOSTRAMOS CARACTERES
		System.out.println("El la cadena resultante es: "+resultado);
		

		// CERRAMOS TECLADO
		teclado.close();
	}

}
