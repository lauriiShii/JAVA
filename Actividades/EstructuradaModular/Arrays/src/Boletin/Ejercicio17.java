package Boletin;

public class Ejercicio17 {
	/**
	 * Ordenar un array unidimensional seg�n el m�todo de la burbuja. Consiste
	 * en comparar pares de elementos adyacentes en un array y si est�n
	 * desordenados intercambiarlos hasta que est�n todos ordenados. Este m�todo
	 * consiste en ordenar el array moviendo el mayor hasta la �ltima casilla
	 * comparando e intercambiando los n�meros comenzando desde la casilla cero
	 * hasta situarlo en la �ltima posici�n. Una vez situado el m�s grande, se
	 * procede a encontrar y situar el siguiente m�s grande comparando e
	 * intercambiando de nuevo los n�meros desde el inicio del array, y as�
	 * sigue sucesivamente hasta ordenar todos los elementos del array.
	 */
	public static void main(String[] args) {

		/** DECLARACION DE VARIABLES Y OBJETOS */
		int datos[] = { 50, 26, 7, 9, 15, 27 }, j = 0, k, i, numSiguientePos = 0;

		for (i = 0; i < datos.length - 1; i++)
			//BUSCAMOS EL NUMERO MAYOR
			for (j = 0; j < datos.length - i - 1; j++)
	
				//MOVEMOS EL NUMERO SI ES MAYOR AL SIGUIENTE
				if (datos[j + 1] < datos[j]) {
					
					//EXPLICAMOS MOVIMIENTO
					System.out.printf("Movimiento %d.%d :%n  - %d avanza una posicion, dejando atras a %d %n", i+1, j+1, datos[j], datos[j + 1]);
					
					numSiguientePos = datos[j + 1];
					datos[j + 1] = datos[j];
					datos[j] = numSiguientePos;
					
					//MOSTRAMOS MOVIMIENTO REALIZADO
					for (k = 0; k < datos.length; k++)
						System.out.print(datos[k]+" ");
					System.out.println(" ");
				}
	}

}
