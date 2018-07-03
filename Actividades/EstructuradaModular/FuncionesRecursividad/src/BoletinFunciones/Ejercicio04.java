package BoletinFunciones;
import Teclado.Teclado;

public class Ejercicio04 {
	/**
	 * Escribe un programa que lea un n�mero entero y lo descomponga en factores
	 * primos. Utiliza la funci�n realizada en el ejercicio anterior. Ejemplo:
	 * 18 = 2 * 3 * 3 
	 * 11 = 11 
	 * 35 = 5 * 7 
	 * 40 = 2 * 2 * 2 * 5
	 */
	public static void main(String[] args) {
		
		/**DECLARACION VARIABLES Y OBJETOS*/
		int numR,num;
		boolean primo=false;
		
		/**PEDIMOS DATOS*/
		num= Teclado.numeroInt("Introduce un n�mero entero: ");
		
		// BUSCAMOS NUMEROS PRIMOS Y MOSTRAMOS
		// Recorremos todos los n�mero entre num y 1
		for (numR = num; numR >= 1; numR--) {
			// Llamada a la funci�n que comprueba si un n�mero es primo.
			primo = primo(numR);
			// Imprime n�mero primo
			if (primo)
				System.out.printf("%d, ", numR);
			// 1 siempre es primo.
			if (numR == 1)
				System.out.print("1.");
		}
	}
	
	public static boolean primo(int numR) {

		boolean primo;
		int i, cont = 0;

		// COMPROBAMOS NUMERO PRIMO
		for (i = 1; i <= numR; i++) {
			// SI SE DIVIDE ENTRE SI MISMO Y 1
			if (numR % i == 0)
				cont++;
		}
		//SI SOLO HAY DOS NUMEROS POR LOS QUE PUEDA DIVIDIR
		if (cont == 2)
			primo = true;
		//SIMO
		else
			primo = false;

		return primo;

	}

}
