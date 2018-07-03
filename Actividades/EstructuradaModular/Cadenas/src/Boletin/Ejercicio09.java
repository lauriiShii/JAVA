package Boletin;
import java.util.InputMismatchException;
import java.util.Scanner;

/**Copiar en una cadena los últimos n caracteres de otra cadena. No se puede usar el método
substring.**/

public class Ejercicio09 {

	public static void main(String[] args) {
		
		//DECLARAMOS VARIABLES Y OBJETO TECLADO
		Scanner teclado = new Scanner(System.in);
		String cad, resultado="";
		int caracter=0, i;
		boolean error = false;
		
		//PEDIMOS CADENA Y N CARACTERES
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
							.print("Introduce el numero de caracter a partir del que quieres tener en otra cadena: ");
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
		
		//SACAMOS LA SEGUNDA CADENA A PARTIR DE N
		//Recorremos la cadena de alreves hasta llegar a n
		for (i = caracter ; i <= cad.length()-1 ; i++)
			
			//almacenamos la cadena resultante en otra cadena
			resultado += cad.charAt(i) + "";
		
		//MOSTRAMOS LA SEGUNDA CADENA
		System.out.println("El la cadena resultante es: "+resultado);
		
		// CERRAMOS TECLADO
		teclado.close();
	}

}
