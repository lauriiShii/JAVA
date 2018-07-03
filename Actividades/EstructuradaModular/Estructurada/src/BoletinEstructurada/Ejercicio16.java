package BoletinEstructurada;
import java.util.Scanner;

public class Ejercicio16 {
	
	/**Realiza un programa que calcule la suma de los pares y de los impares comprendidos entre dos
valores enteros A y B que se introducen por teclado (A < B).*/
	public static void main(String[] args) {
		
		/**OBJETOS Y VARIABLES*/
		Scanner teclado = new Scanner(System.in);
		int A,B, i,sumaPar=0, sumaImpar=0;
		
		/**PEDIMOS DATOS AL USUARIO*/
		do {
			System.out.println("Indica valor A: ");
			A=teclado.nextInt();
			System.out.println("Indica valor B: ");
			B=teclado.nextInt();
			if(B<A)
				System.out.println("A no puede ser mayor que B.");
		} while (B<A);
		
		teclado.close();
		
		/**CALCULO DE SUMAS*/
		for (i=A; i <= B; i++) {
			if(i%2==0)
				sumaPar=sumaPar+i;
			else
				sumaImpar=sumaImpar+i;
		}
		
		System.out.printf("%nSuma par: %d%nSuma impar: %d",sumaPar,sumaImpar);

	}

}
