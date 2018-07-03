package BoletinEstructurada;
import java.util.Scanner;

public class Ejercicio22 {

	/**
	 * Escribe un programa que calcule el primer elemento de la serie de
	 * Fibonacci que sea mayor o igual que un valor introducido por teclado. La
	 * serie de Fibonacci se define mediante: a0 = a1 = 1 an = an-1 + an-2 es
	 * decir, la serie de Fibonacci sería la siguiente: 1, 1, 2, 3, 5, 8, 13,
	 * 21, 34, …..
	 */
	public static void main(String[] args) {
		
		/**OBJETOS Y VARIABLES*/
		Scanner teclado = new Scanner(System.in);
		int num, fibo1=1, fibo2=1;
		
		/**PEDIMOS DATOS*/
		do {
			System.out.print("Introduce numero mayor que 1: ");
			num = teclado.nextInt();
		} while (num <= 1);
		
		teclado.close();
		
		/**NUMERO SUPERIOR A NUM EN FIBONACCI*/
		System.out.println("Mostramos la serie fibonacci hasta llegar al primero mayor que "+num);
		System.out.print(fibo1 + " ");
		while (num>=fibo2) {
			System.out.print(fibo2 + " ");
			fibo2 = fibo1 + fibo2;
			fibo1 = fibo2 - fibo1;
		}
		System.out.println(fibo2);
		System.out.printf("%n%d es el numero que buscamos.",fibo2);

	}

}
