package PrimerosEjercicios;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Dada una cantidad, si es mayor de 1000, que muestre el 15% de dicha
		 * cantidad. Si no, que no haga nada.
		 * Es un condicional simple If.
		 */
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Número:  ");
		numero = teclado.nextInt();
		if (numero > 1000) 
			System.out.println(numero * (15d / 100));
		else 
			System.out.println(numero);
		
		teclado.close();
	}

}
