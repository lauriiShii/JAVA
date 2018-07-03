package Boletin;

import Teclado.Teclado;

public class Ejercicio03 {
	/**Crear un programa que rellene por teclado un array de enteros y nos devuelva la suma de
	todos. El tama�o del array se le solicita al usuario.*/
	public static void main(String[] args) {
		
		/**DECLARACION VARIABLES Y OBJETOS*/
		int tamanio, datos [], resultado=0;
		int i, j;
		
		/**PEDIMOS DATOS*/
		//TAMA�O
		tamanio = Teclado.numeroInt("�Qu� cantidad de datos quieres introducir?");
		datos = new int [tamanio];
		
		//DATOS
		for(i=0; i<tamanio; i++)
			datos [i]= Teclado.numeroInt("Dato "+i+" :");
		
		/**SUMAMOS DATOS*/
		for (j = 0; j < datos.length; j++) 
			resultado += datos [j];
		
		/**MOSTAMOS RESULTADO*/
		System.out.printf("La suma de todos los enteros introducidos es: %d",resultado);
	}

}
