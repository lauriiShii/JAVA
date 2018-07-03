package Boletin;
import java.util.Scanner;

/**
 * Concatenar dos cadenas introducidas por teclado. El resultado debe quedar en
 * otra cadena. El método concat o el operador + solamente se pueden usar a
 * nivel de carácter.
 **/
public class Ejercicio07 {

	public static void main(String[] args) {

		// DECLARAMOS VARIABLES Y OBJETO TECLADO
		Scanner teclado = new Scanner(System.in);
		int i;
		String cadena1, cadena2, resultado;
		System.out.println("Concatenar dos cadenas introducidas por teclado.");

		// PEDIMOS DOS CADENAS
		System.out.println("Dime la primera cadena: ");
		cadena1 = teclado.nextLine();
		System.out.println("Dime la segunda cadena: ");
		cadena2 = teclado.nextLine();

		// CONCATENAMOS CADENAS
		// Guardamos el resultado en otra cadena
		resultado = cadena1;

		// Recorremos un for concatenando la cadena2 con la cadena1
		for (i = 0; i < cadena2.length(); i++)
			resultado = resultado + cadena2.charAt(i);

		// MOSTRAOS CADENAS CONCATENADAS
		System.out.println("Las dos frases concatenadas dan: " + resultado);

		// CERRAMOS TECLADO
		teclado.close();
	}

}
