package BoletinEstructurada;
import java.util.Scanner;

public class Ejercicio03 {

	/**
	 * Pedir dos n�meros por teclado e indicar si el primero es m�ltiplo del
	 * segundo. Nota: un n�mero x es m�ltiplo de y, si al dividir x entre y, el
	 * resto es 0.
	 */
	public static void main(String[] args) {
		
		/** VARIABLES Y OBJETOS */
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		
		/**PEDIMOS NUMEROS*/
		do {
			System.out.println("Escribe un primer numero: ");
			num1 = teclado.nextInt();
			
			System.out.println("Escribe un segundo numero: ");
			num2 = teclado.nextInt();
			
			if (num1<num2) 
				System.out.printf("El n�mero %d debe ser mayor que %d para que pueda ser multiplo de %d.%n%n",num1,num2,num2);
			
		} while (num1<num2);

		
		teclado.close();
		
		/**COMPROBAMOS QUE NUM1 ES MULTIPLO DE NUM2	*/
		if (num1%num2 == 0) 
			System.out.printf("El n�mero %d es m�ltiplo de %d.",num1,num2);
		else 
			System.out.printf("El n�mero %d  no es m�ltiplo de %d.",num1,num2);

	}

}
