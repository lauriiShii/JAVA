package Boletin;

import Teclado.Teclado;

public class Ejercicio05 {
	/**Mostrar, contar y sumar los elementos pares que ocupan las posiciones impares de un array
	cargado desde teclado. Mostrar las posiciones que ocupan dichos elementos en el array.*/
	public static void main(String[] args) {
		
		/**DECLARACION VARIABLES Y OBJETOS*/
		int tamanio, datos [], resultado=0;
		int i, j, cont =0;
		
		/**PEDIMOS DATOS*/
		//TAMA�O
		tamanio = Teclado.numeroInt("�Qu� cantidad de datos quieres introducir?");
		datos = new int [tamanio];
		
		//DATOS
		for(i=0; i<tamanio; i++)
			datos [i]= Teclado.numeroInt("Dato "+i+" :");
		
		/**SUMAMOS DATOS PARES Y LOS MOSTRAMOS*/
		System.out.println("\nDATOS PARES EN POSICIONES IMPARES");
		for (j = 0; j < datos.length; j++){ 
			if(j % 2 != 0 && datos [j] % 2 == 0){
				System.out.printf("Dato %d : %d%n",j, datos [j] );
				resultado += datos [j];
				cont++; //Numero de pares que hay almacenados
			}
		}
		
		/**MOSTAMOS CUENTA Y SUMA*/
		System.out.printf("%nLa cantidad de numeros pares en posiciones impares es: %d%n", cont);
		System.out.printf("La suma de todos los enteros introducidos es: %d",resultado);

	}

}
