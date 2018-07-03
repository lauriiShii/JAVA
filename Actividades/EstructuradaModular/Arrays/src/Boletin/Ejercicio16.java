package Boletin;

import java.util.Arrays;
import Teclado.Teclado;

public class Ejercicio16 {
	/**Escribe un programa que inicialice una matriz de NxN desde teclado y que diga si existe
	alguna fila exactamente igual a alguna columna, junto con los índices de las filas y columnas
	que son iguales.*/
	public static void main(String[] args) {
		
	/**DECLARAMOS VARIABLES Y OBJETOS*/
	int datos [][], tamaño,i ,j, k, l, m, o, p, w, fila [], columna [], cont = 0 ;
	
	/**PEDIMOS DATOS AL USUARIO*/
	//TAMAÑOS
	tamaño = Teclado.numeroInt("TAMAÑO DE LA MATRIZ NxN:  ");
	//Damos tamaño a datos y los arrays de ayuda
	datos = new int [tamaño][tamaño];
	fila = new int [tamaño];
	columna = new int [tamaño];
	
	//DATOS
	System.out.println("INTRODUCE DATOS: ");
	for(i=0; i < datos.length; i++)
		for(j=0; j < datos[i].length; j++)
			datos [i][j] = Teclado.numeroInt("Fila "+i+" y columna "+j+" : ");
	
	/**MOSTRAMOS MATRIZ*/
	System.out.println("\nMATRIZ INTRODUCIDA");
	for (m = 0; m < datos.length; m++) {
		for (o = 0; o < datos[m].length; o++) {
			System.out.print(datos [m][o]+"\t");
		}
		System.out.println("");
	}
	
	/**BUSCMOS COLUMNAS Y FILAS IGUALES*/
	System.out.println("\nIGUALDADES");
	for (k = 0; k < tamaño; k++) {
		
		// ALMACENAMOS FILA EN UN ARRAY
		for (l = 0; l < tamaño; l++)
			fila [l] = datos [k][l];

		// ALMACENAMOS COLUMNA EN UN ARRAY
		for (p = 0; p < tamaño; p++){
			for ( w = 0; w < tamaño; w++)
				columna [w] =  datos [w][p];
			
			//COMPARAMOS FILA CON CADA COLUMNA
			if( Arrays.equals( fila, columna) == true){
				System.out.printf("La fila con indice %d y columna con indice %d son iguales.%n", k, p );
				cont++;
			}

		}
	}
	if (cont == 0)
		System.out.println("No hay igualdades.");

	}

}
