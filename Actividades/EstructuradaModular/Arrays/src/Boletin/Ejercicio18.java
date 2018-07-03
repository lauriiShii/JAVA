package Boletin;

import Teclado.Teclado;

public class Ejercicio18 {
	/**Escribe un programa que halle si una matriz introducida es un cuadrado m�gico. Un
	cuadrado m�gico es una matriz cuadrada NxN donde las sumas de cada columna, de cada
	fila y de cada diagonal son iguales.*/
	public static void main(String[] args) {
		
		/**DECLAraMOS VARIABLES Y OBJETOS*/
		int tamanio = 0, i, j, k, l, m, n, o, datos [][], sumaFila[], sumaColumna[], sumaDiagonalDerecha = 0, sumaDiagonalIzquierda = 0, suma;
		boolean cuadradoMagico = true;
		
		/**PEDIMOS DATOS AL USUARIO*/
		//TAMA�OS
		tamanio = Teclado.numeroInt("TAMA�O DE LA MATRIZ NxN:  ");
		//Damos tama�o a datos y los arrays de ayuda
		datos = new int [tamanio][tamanio];
		sumaFila = new int [tamanio];
		sumaColumna = new int [tamanio];
		
		//DATOS
		System.out.println("\n0INTRODUCE DATOS: ");
		for(i=0; i < datos.length; i++)
			for(j=0; j < datos[i].length; j++)
				datos [i][j] = Teclado.numeroInt("Fila "+i+" y columna "+j+" : ");
		
		/**MOSTRAMOS MATRIZ*/
		System.out.println("\nMATRIZ INTRODUCIDA");
		for (k = 0; k < datos.length; k++) {
			for (l = 0; l < datos[k].length; l++) {
				System.out.print(datos [k][l]+"\t");
			}
			System.out.println("");
		}
		
		/**COMPROBAMOS SI ES UN CUADRADO MAGICO*/
		// LA SUMA DE CADA FILA DEBE SER IGUAL
		for(m=0; m < datos.length; m++){
			suma = 0;
			for(n=0; n < datos[m].length; n++)
				suma += datos [m][n];
			sumaFila [m] = suma;
		}
		//COMPROBAMOS
		for (o = 0; o < sumaColumna.length - 1 && cuadradoMagico == true; o++) {
			if (sumaFila [o] == sumaFila [o+1])
				cuadradoMagico = true;
			else
				cuadradoMagico = false;
		}
		
		// LA SUMA DE CADA COLUMNA DEBE SER IGUAL
		for(m=0; m < datos.length; m++){
			suma = 0;
			for(n=0; n < datos[m].length; n++)
				suma += datos [n][m];
			sumaColumna [m] = suma;
		}
		//COMPROBAMOS
		for (o = 0; o < sumaColumna.length - 1 && cuadradoMagico == true; o++) {
			if (sumaFila [o] == sumaFila [o+1])
				cuadradoMagico = true;
			else
				cuadradoMagico = false;
		}
		
		// LA SUMA DE CADA DIAGONAL DEBE SER IGUAL 
		//DIAGONAL IZQUIERDA
		for(m=0; m < datos.length; m++)
			for(n=0; n < datos[m].length; n++)
				if (m == n)
					sumaDiagonalIzquierda += datos [n][m];
		//DIAGONAL DERECHA
		for(m=0; m < datos.length; m++)
			for(n=0; n < datos[m].length; n++)
				if(tamanio-1-m == n )
					sumaDiagonalDerecha += datos [n][m];
		//COMPROBAMOS
		if (sumaDiagonalDerecha == sumaDiagonalIzquierda)
			cuadradoMagico = true;
		else
			cuadradoMagico = false;
		
		/**MOSTRAMOS SI ES MAGICO O NO*/
		if(cuadradoMagico == true)
			System.out.println("\nEl cuadrado es m�gico.");
		else
			System.out.println("\nEl cuadrado no es m�gico.");
	}

}
