package BoletinEstructurada;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio07 {
	/**
	 * Dada una cadena solicitada al usuario, obtener y mostrar uno de sus
	 * caracteres elegidos aleatoriamente. Mostrar tambi�n en qu� posici�n se
	 * encuentra dicho car�cter. Utiliza el m�todo charAt de las cadenas para
	 * obtener el car�cter.
	 */
	public static void main(String[] args) {
		
		/**VARIABLE Y OBJETOS*/
		Scanner teclado = new Scanner(System.in);
		Random rnd = new Random();
		int aleatorio, numCaracter;
		String cadena;
		char caracter;
		
		/**PEDIMOS CADENA*/
		System.out.print("Introduce una cadena: ");
		cadena=teclado.nextLine();
		
		teclado.close();
		
		/**SELECCIONAMOS UN CARACTER ALEATORIO*/
		//primero conocemos cuantos caracteres tiene la cadena
		numCaracter=cadena.length();
		
		//En segundo lugar generamos un aleatorio ente 0 y numCaracter -1
		aleatorio=rnd.nextInt(numCaracter-1);
		caracter=cadena.charAt(aleatorio);
		
		/**MOSTRAMOS LOS DATOS*/
		System.out.println("El caracter que hemos seleccionado aleatoriamente esta en la posici�n "+(aleatorio+1)+".");
		System.out.println("El caracter es "+caracter+".");
		

	}

}
