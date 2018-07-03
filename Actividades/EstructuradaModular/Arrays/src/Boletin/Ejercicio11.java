package Boletin;
import Teclado.Teclado;

public class Ejercicio11 {
	/**Rellena mediante el teclado una matriz bidimensional de enteros. Calcula y muestra en pantalla
	la suma de cada fila y de cada columna. El tamaño del array se le solicita al usuario. El número
	de filas no tiene por qué ser igual al número de columnas.*/
	public static void main(String[] args) {
		
		/**DECLARACION VARIABLES*/
		int datos [][], filas, columnas,i ,j, k, m, n, l, o, p, sumaFila, sumaColumna;
		
		/**PEDIMOS DATOS*/
		//TAMAÑOS
		filas = Teclado.numeroInt("Introduce el numero de filas para la matriz: ");
		columnas = Teclado.numeroInt("Introduce el numero de columnas para la matriz: ");
		//Damos tamaño a datos
		datos = new int [filas][columnas];
		
		//DATOS
		for(i=0; i < filas; i++)
			for(j=0; j < columnas; j++)
				datos [i][j] = Teclado.numeroInt("Fila "+i+" y columna "+j+" : ");
		
		/**MOSTRAMOS MATRIZ INTRODUCIDA*/
		System.out.println("\nMATRIZ INTRODUCIDA");
		for (m = 0; m < filas; m++) {
			for (n = 0; n < columnas; n++) {
				System.out.print(datos [m][n]+"\t");
			}
			System.out.println("");
		}
		
		/**SUMA DE CADA FILA*/
		System.out.println("\nSUMA FILAS");
		for(l=0; l < filas; l++){
			//INICIAMOS LA CUENTA EN 0
			sumaFila =0;
			//SUMAMOS FILA
			for(o=0; o < columnas; o++){
				sumaFila += datos [l][o];
			}
			//MOSTRAMOS
			System.out.println(sumaFila);
		}
		
		/**SUMA DE CADA COLUMNA*/
		System.out.println("\nSUMA COLUMNAS");
		for(k=0; k < columnas; k++){
			//INICIAMOS LA CUENTA EN 0
			sumaColumna =0;
			//SUMAMOS COLUMNA
			for(p=0; p < filas; p++){
				sumaColumna += datos [p][k];
			}
			//MOSTRAMOS
			System.out.print(sumaColumna+"\t");
		}

	}

}
