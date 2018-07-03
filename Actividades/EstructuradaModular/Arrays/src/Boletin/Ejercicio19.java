package Boletin;

import Teclado.Teclado;

public class Ejercicio19 {
	/**Realiza un programa que lea por teclado una cadena de caracteres y guarde en un array las
	palabras que componen dicha cadena (una palabra en cada posición del array). Por último,
	mostrar por pantalla el contenido de dicho array mostrando cada palabra en una línea
	distinta. No usar el método split.
	Hacer dos versiones:
	• Las palabras están separadas por un espacio
	• Las palabras pueden estar separadas por más de un espacio.*/
	public static void main(String[] args) {

		/**DECLARAMOS VARIABLES Y OBJETOS*/
		String cadena, palabras [], palabra;
		int numPalabras = 1, i, j, caracter = 0;
		boolean fin = false;
		
		/**PEDIMOS DATO A USUARIO*/
		cadena = Teclado.cadena("Introduce una frase: ");
		
		/**GUARDAMOS PALABRAS EN palabras []*/
		//ELIMINAMOS LOS POSIBLES ESPACIOS EN BLANCO
		cadena = cadena.trim();
		
		/**SI HAY MAS DE UN ESPACIO JUNTO LO TRANSFORMAMOS EN UNO SOLO*/
		//cadena = cadena.replaceAll("  ", "");
		cadena = cadena.replaceAll("[ ]+", " ");
		
		//CONTAMOS CUANTAS PALABRAS TIENE NUESTRA CADENA
		//Si la cadena esta vacia no hay palabras
		if (cadena.isEmpty())
			System.out.println("No hay palabras introducidas.");
		else
			//POR CADA ESPACIO EN BLANCO QUE ENCONTREMOS INDICAMOS UNA NUEVA PALABRA
			for (i = 0; i < cadena.length(); i++)
				if (cadena.charAt(i) == ' ')
					numPalabras++;
				
		//DAMOS TAMAÑO A NUESTRO ARRAY
		palabras = new String [numPalabras];
		
		//RELLENAMOS EL ARRAY CON PALABRAS DE LA CADENA
		for (j = 0; j < palabras.length; j++) {
			palabra = "";
			fin = false;
			
			//RECORREMOS LA CADENA
			while ( caracter < cadena.length() && fin == false) {
				
				//SI EL CARACTER ES DISTINTO A UN ESPACIO LO ALMACENAMOS EN UNA PALABRA
				if(cadena.charAt(caracter) != ' ')
					palabra += cadena.charAt(caracter);
				
				//SI ES UN ESPACIO ES QUE HA ACABADO LA PALABRA POR LO QUE PARAMOS DE ANADIR CARACTERES A LA PALABRA EN CUESTION
				else
					fin = true;	
					
				caracter++;
			}
			// SE INTRODUCE LA PALABRA EN EL ARRAY
			palabras [j] = palabra;
			
			/**MOSTRAMOS PALABRA*/
			System.out.println(palabras [j]);
			
		}
		

	}

}
