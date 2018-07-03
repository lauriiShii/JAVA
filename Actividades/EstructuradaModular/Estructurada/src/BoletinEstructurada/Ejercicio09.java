package BoletinEstructurada;
import java.util.Scanner;

public class Ejercicio09 {
	/**
	 * Pedir un número entre 0 y 10 por teclado y mostrar la tabla de
	 * multiplicar de dicho número.
	 **/
	public static void main(String[] args) {

		/**VARIABLES Y OBJETOS*/
		Scanner teclado = new Scanner(System.in);
		int num, contador;
		
		/**PEDIMOS DATOS*/
		do {
			System.out
					.print("Introduce un número entre 0 y 10 para ver su tabla de multiplicar:\nnum: ");
			num = teclado.nextInt();
			if (num > 10 || num < 0)
				System.out.println("¡ERROR!");
		} while (num > 10 || num < 0);

		teclado.close();
		
		/**TABLA DE MULTIPLICAR*/
		for (contador = 0; contador <= 10; contador++) 
			System.out.println(num + " X " + contador + " = "
					+ (contador * num));

	}

}
