package BoletinEstructurada;


public class Ejercicio30 {
	/**
	 * Crear un programa que imprima un tablero de ajedrez en el que casillas
	 * blancas se simbolicen con una B y las negras con una N.
	 */
	public static void main(String[] args) {

		/** VARIABLES */
		int i,j,k;
		
		/**DIBUJAMOS TABLERO*/
		for (i = 0; i < 8; i++) {
			//Imprimimos fila
			//Si es par
			if(i%2==0)
				for (j = 0; j < 8; j++) 
					System.out.print("B"+"N");	
			//Si es impar
			if(i%2!=0)
				for (k = 0; k < 8; k++) 
					System.out.print("N"+"B");
			//Salto de linea
			System.out.println("");
		}


	}

}
