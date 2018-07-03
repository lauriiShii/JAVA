package BoletinEstructurada;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio24 {
	/**
	 * Realiza el mismo programa que el ejercicio anterior pero al revés, es
	 * decir, es la máquina la que tiene que adivinar el número pensado por el
	 * usuario.
	 */
	public static void main(String[] args) {

		/** VARIABLES Y OBJETOS */
		Scanner teclado = new Scanner(System.in);
		int numInferior, numSuperior, numIntento;
		Random rnd = new Random();
		int numAle, respuesta, pista;

		/** PEDIMOS VARIABLES */
		System.out
				.println("¡¡¡¡ADIVINA ADIVINANZAAAAAA!!!!"
						+ "\nPiensa un numero en tu mente para jugar con la maquina y escribe los limites que quieras donde este comprendido dicho número");
		do {
			System.out.print("Número inferior: ");
			numInferior = teclado.nextInt();
			System.out.print("Número superior: ");
			numSuperior = teclado.nextInt();
			if (numInferior >= numSuperior)
				System.out
						.println("El numero inferior no puede ser mayor que el superior ni igual.");
		} while (numInferior >= numSuperior);

		do {
			System.out.println("Número de intentos que tendra el ordenador");
			numIntento = teclado.nextInt();
			if (numIntento <= 0)
				System.out
						.println("El numero de intentos no puede ser menor o igual a 0.");

		} while (numIntento <= 0);

		/** JUGAMOS CON LA MAQUINA */
		do {
			// NUMERO ALEATORIO
			numAle = rnd.nextInt(numSuperior - numInferior + 1) + numInferior;
			do {
				System.out.printf("¿¿¿¿El número es %d??? %n(1.SI - 2.NO)%n",
						numAle);
				respuesta = teclado.nextInt();
			} while (respuesta < 1 || respuesta > 2);

			if (respuesta == 2) {// OPORTUNIDAD FALLIDA
				numIntento--;
				System.out.println("Ese número no es.");

				if (numIntento == 0) {// NOS HEMOS QUEDADO SIN INTENTOS
					System.out.printf("HE PERDIDO :(");
				} else if (numIntento>0){// AUN TENEMOS INTENTOS
					System.out.printf("Aun me queda %d intentos !!!%n",
							numIntento);
					// INDICAMOS SI EL NUMERO DADO ES MAYOR O MENOR AL ALEATORIO
					do {
						System.out
								.printf("¿¿El numero es mayor que %d?? ¿¿o es menor??%n(1.MAYOR - 2.MENOR)%n",
										numAle);
						pista = teclado.nextInt();
						if (pista == 1)
							numInferior = numAle;
						else
							numSuperior = numAle;
					} while (pista < 1 || pista > 2);
				}
			} else // OPORTUNIDAD ACERTADA
				System.out.println("¡¡¡HE GANADOOOO!!!");

		} while (numIntento >0 && respuesta == 2);

		teclado.close();

	}

}
