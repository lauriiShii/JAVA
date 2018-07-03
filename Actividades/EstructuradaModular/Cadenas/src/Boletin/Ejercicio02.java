package Boletin;
import java.util.Scanner;

public class Ejercicio02 {

	/**Suprimir los espacios en blanco de una cadena que se introduce por teclado. El resultado
debe quedar en otra cadena.*/
	public static void main(String[] args) {
		
		/**VARIABLES Y OBJETOS*/
		Scanner teclado = new Scanner (System.in);
		String cadena,resultado;
		
		/**PEDIMOS DATOS*/
		System.out.print("Introduce una cadena: ");
		cadena=teclado.nextLine();
		
		teclado.close();
		
		/**QUITAMOS ESPACIOS EN BLANCO*/
		resultado =cadena.replaceAll(" ","");
		
		System.out.println("La cadena sin espacios quedaría: "+resultado+".");

	}

}
