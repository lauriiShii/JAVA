package Boletin;

import Teclado.Teclado;

public class Ejercicio04 {
	/**Realizar un programa para sumar y mostrar los elementos impares de un array cargado
	desde teclado.*/
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
		
		/**SUMAMOS DATOS IMPARES Y LOS MOSTRAMOS*/
		for (j = 0; j < datos.length; j++){ 
			if(datos [j] % 2 != 0){
				System.out.printf("Dato %d : %d%n",j, datos [j] );
				resultado += datos [j];
			}
		}
		
		/**MOSTAMOS SUMA*/
		System.out.printf("La suma de todos los enteros introducidos es: %d",resultado);

	}

}
