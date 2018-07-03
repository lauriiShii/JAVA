package Boletin;
import java.util.Scanner;

/**
 * Contar el número de palabras que hay en una cadena. Hacer dos versiones: •
 * Las palabras están separadas por un espacio • Las palabras pueden estar
 * separadas por más de un espacio.
 **/
public class Ejercicio13 {

	/** MAIN **/
	public static void main(String[] args) {

		// DECLARAMOS VARIABLES Y EL OBJETO TECLADO
		Scanner teclado = new Scanner(System.in);
		String cad; // Reciclo la variable
		int i=0, cont; //Reciclo i y cont
		boolean error=true;

		/** APARTADO 1 (palabras separadas por un solo espacio) **/
		System.out.println("¡APARTADO 1! Contaremos las palabras de una cadena separadas por un solo espacio.");
		
		// PEDIMOS CADENA
		cad = pedirCadena();
			
		// CONTAMOS NÚMERO DE PALABRAS
		//Controlamos que siempre va a haber una palabra minimo (cont=1)
		cont=1;
		
		//Recorremos la cadena
		for (i=0; i<=cad.length()-1; i++){
				
			// Si hay un espacio suma 1 al contador (CONTADOR=PALABRA) 
			if (cad.charAt(i)==' ') 
				cont++;
		}
		
		// MOSTRAMOS NÚMERO DE PALABRAS		
		System.out.println("El número de palabras de la cadena es: "+(cont));

		/** APARTADO 2 (palabras separadas por más de un espacio) **/
		System.out.println("¡APARTADO 2! Contaremos las palabras de una cadena separadas por más de un solo espacio.");
		
		// PEDIMOS CADENA
		cad = pedirCadena();
		
		// CONTAMOS NÚMERO DE PALABRAS
		//Controlamos que siempre va a haber una palabra minimo (cont=1)
		cont=1;
		
		//Recorremos la cadena
		for (i=0; i<=cad.length()-1; i++){
			
			// Si hay un espacio y el caracter anterior no es un espacio suma 1 al contador (CONTADOR=PALABRA) 
			if (cad.charAt(i)==' ' &&  cad.charAt(i-1)!=' ') 
				cont++;
		}

		// MOSTRAMOS NÚMERO DE PALABRAS		
		System.out.println("El número de palabras de la cadena es: "+cont);

		// CERRAMOS TECLADO
		teclado.close();
	}

	/** FUNCIONES **/
	// FUNCIÓN PARA PEDIR CADENA
	public static String pedirCadena() {

		// DECLARAMOS VARIABLES Y EL OBJETO TECLADO
		Scanner teclado = new Scanner(System.in);
		String cadena;

		// PIDE AL USUARIO LA CADENA
		do{
			System.out.print("Introduce una cadena: ");
			
			// Quitamos espacios antes y despues de la frase
			cadena = teclado.nextLine().trim();
			
			//Controlamos que la cadena no sea vacia
			if(cadena.length()==0)
				System.out.print("¡ERROR! La cadena no puede ser vacía. ");
			
		}while(cadena.length()==0);
		
		// DEVUELVE LA CADENA INTRODUCIDA POR TECLADO
		return cadena;
	}

	// FUNCION PARA CONTAR EL NUMERO DE PALABRAS

}
