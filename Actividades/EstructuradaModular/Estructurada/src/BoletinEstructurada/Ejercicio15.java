package BoletinEstructurada;
import java.util.Scanner;

public class Ejercicio15 {

	/**
	 * Hacer una calculadora sencilla, es decir, que sume, reste, multiplique o
	 * divida dos n�meros enteros introducidos por teclado. El programa tendr�
	 * un men� para que el usuario pueda hacer varias operaciones hasta que
	 * quiera salir.
	 */
	public static void main(String[] args) {

		// Declaramos variables y creamos objetos teclado.
		Scanner teclado = new Scanner(System.in);
		int opcion, numero1, numero2, suma, resta, multiplicacion, division;

		// Mostrar menu.
		do {
			do {
				System.out.println("introduce una opcion:");
				System.out.println("1.sumar");
				System.out.println("2.restar");
				System.out.println("3.multiplicar");
				System.out.println("4.dividir");
				System.out.println("5.salir");
				opcion = teclado.nextInt();
				if ((opcion < 1) || (opcion > 5))
					System.out.println("�ERROR!");
			} while ((opcion < 1) || (opcion > 5));// Control de datos.

			// Funcionamiento.
			if (opcion != 5) {

				// Introducir datos
				System.out.print("numero 1: ");
				numero1 = teclado.nextInt();
				do {

					System.out.print("numero 2: ");
					numero2 = teclado.nextInt();

					if (numero2 == 0)
						System.out.println("�ERROR!");

				} while (numero2 == 0); // Control de errores.

				// Calcular operacion con los datos introducidos y mostrar
				// por pantalla
				switch (opcion) {
				case 1:
					suma = numero1 + numero2;
					System.out.println("el resultado es: " + suma);
					break;
				case 2:
					resta = numero1 - numero2;
					System.out.println("el resultado es: " + resta);
					break;
				case 3:
					multiplicacion = numero1 * numero2;
					System.out.println("el resultado es: " + multiplicacion);
					break;
				case 4:
					division = numero1 / numero2;
					System.out.println("el resultado es: " + division);
					break;
				}

			}
		} while (opcion != 5); // Si NO es SALIR de la calculadora:

		// Cerrar eclado.
		teclado.close();
	}
}