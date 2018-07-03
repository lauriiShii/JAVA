package Boletin;

public class Ejercicio14 {
	/**Un array bidimensional a de N filas y N columnas es simétrico si sus elementos satisfacen la
	condición a[i,j] = a[j,i] para todo i,j, es decir, si se obtiene la misma tabla al cambiar las filas
	por las columnas. Escribe un programa que determine si un array de ese tipo es simétrico.*/
	public static void main(String[] args) {
		
		/**DECLARAMOS VARIABLES Y OBJETOS*/
		int a [][] = {{1,2,3},{2,5,6},{3,6,8}},i ,j;
		boolean simetrico = true;

		/**COMPROBAMOS QUE ES SIMETRICO*/
		for (i = 0; i < a.length; i++)
			for (j =0; j < a[i].length; j++){
				if (a[i][j] != a[j][i])
					simetrico = false;
			}
		
		/**MOSTRAMOS RESULTADO*/
		if (simetrico == true)
			System.out.println("El array SI es simetrico.");
		else 
			System.out.println("El array NO es simetrico.");
		
	}

}
