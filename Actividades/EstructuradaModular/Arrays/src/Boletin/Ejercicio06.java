package Boletin;

import Teclado.Teclado;

public class Ejercicio06 {
	/**Crea un array, rell�nalo con valores desde el teclado. Copia sus elementos al rev�s en otro
	array y muestra los elementos de los dos arrays.*/
	public static void main(String[] args) {
		
		/**DECLARACION VARIABLES Y OBJETOS*/
		int tamanio, datos [], datosAlreves [];
		int i, j, k=0, m ,n ;
		
		/**PEDIMOS DATOS*/
		//TAMA�O
		tamanio = Teclado.numeroInt("�Qu� cantidad de datos quieres introducir?");
		datos = new int [tamanio];
		datosAlreves = new int [tamanio];
		
		//DATOS
		for(i=0; i<tamanio; i++)
			datos [i]= Teclado.numeroInt("Dato "+i+" :");
		
		/**ALMACENAMOS ARRAY ALREVES*/
		//RECORREMOS datosAlreves DESDE SU ULTIMA POSICION HASTA LA PRIMERA
		for (j = tamanio-1; j >= 0; j--){
			// EN SU ULTIMA POSICION ALMACENAMOS LA PRIMERA DE datos
			datosAlreves [j] = datos [k];
			k++;
		}
		
		/**MOSTRAMOS*/
		//DATOS TAL CUAL
		System.out.println("\nDatos introducidos por teclado: ");
		for (m = 0; m < datos.length; m++)
			System.out.printf("Dato %d : %d%n", m, datos [m]);
		
		//DATOS ALREVES
		System.out.println("\nDatos alreves: ");
		for (n = 0; n < datos.length; n++)
			System.out.printf("Dato %d : %d%n", n, datosAlreves [n]);
	}

}
