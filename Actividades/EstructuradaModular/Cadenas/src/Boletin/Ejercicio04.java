package Boletin;

public class Ejercicio04 {

	/**Contar el n�mero de apariciones de un car�cter en una cadena.*/
	public static void main(String[] args) {

		/**VARIABLES*/
		String cadena= "tengo 122334083597435 millones ahorrados de caca",resultado;
		
		/** CONTAMOS VOCALES */
		resultado = cadena.toLowerCase().replaceAll("[^c]", "");
		
		System.out.printf("%nEsta cadena \"%s\" contiene %d caracteres \"c\".%n",
				cadena, resultado.length());

	}

}
