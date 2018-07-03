package Boletin;
import Teclado.Rango;
import Teclado.Teclado;

public class Ejercicio08 {
	/**Dado un array de caracteres, insertar un car�cter en una posici�n concreta, desplazando el resto
	de caracteres una posici�n. Controlar que existe espacio en el array para insertar dicho car�cter.*/
	public static void main(String[] args) {
		
		/**DECLARAMOS DATOS Y OBJETOS*/
		char caracteres [] = {'a','b','c','d'}, caracter;
		int posicion, i, j, tamanio=0;
		
		/**PEDIMOS DATOS*/
		//TAMA�O
		tamanio = Teclado.numeroInt("�Qu� cantidad de datos quieres introducir?");
		caracteres = new char [tamanio+1];// Le sumamos 1 para controlar que se pueda introducir luego el caracter
				
		//DATOS
		for(i=0; i<tamanio; i++)
			caracteres [i]= Teclado.caracter("Dato "+i+" :");
				
		//POSICION EN LA QUE QUEREMOS INTRODUCIR EL NUEVO CARACTER
		posicion = Teclado.numeroInt("�En que posicion deseas introducir el nuevo caracter?", 0, caracteres.length, Rango.INCLUIDO_MIN_MAX);
		
		//CARACTER QUE QUEREMOS INTRODUCIR
		caracter = Teclado.caracter("�Qu� caracter quieres introducir?");
		
		/**INSERTAMOS EL CARACTER*/
		// Desplazamos los caracteres una posicion mas hasta llegar a la posicion donde introducimos el nuevo caracter
		for (i = caracteres.length - 1; i > posicion; i--)
			caracteres[i] = caracteres[i - 1];

		// Introducimos el caracter
		caracteres[posicion] = caracter;

		/**MOSTRAMOS ARRAY RESULTANTE*/
		for (j = 0; j < caracteres.length; j++)
			System.out.printf("Dato %d : %s%n", j, caracteres[j]);
		}
}
