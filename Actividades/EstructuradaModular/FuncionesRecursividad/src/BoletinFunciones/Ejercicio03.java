package BoletinFunciones;

public class Ejercicio03 {

	/**
	 * Se dice que un n�mero entero es primo si s�lo es divisible entre 1 y
	 * entre s� mismo. Por ejemplo, 2, 3, 5 y 7 son primos, pero 4, 6, 8 y 9 no
	 * lo son. a) Escribe una funci�n que determine si un n�mero es primo o no.
	 * b) Utiliza esta funci�n en un programa que muestre todos los n�meros
	 * primos entre 1 y 10.000.
	 */

	public static void main(String[] args) {

		/** DECLARACION VARIABLES Y OBJETOS */
		int num1 = 1, num2 = 10000, numR;
		boolean primo;

		/** MOSTRAMOS RESULTADO */
		System.out.printf("%d, ",num1);
		for (numR = num1; numR <= num2; numR++) {
			// COMPROBAMOS SI ES PRIMO
			primo = primo(numR);
			// IMPRIME PRIMOS
			if (primo){
				if (numR == num2)
					System.out.printf("%d.",numR);
				else
					System.out.printf("%d, ", numR);
			}
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
