package BoletinEstructurada;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio23 {
	/**
	 * Realiza un juego de adivinanza de un número entero. El programa pedirá
	 * dos números (el número inferior y el número superior), por ejemplo 1 y
	 * 100, y un número de intentos, por ejemplo, 4. El programa obtendrá a
	 * continuación un número aleatorio entre 1 y 100, y el usuario deberá
	 * adivinarlo utilizando como mucho 4 intentos. Cada vez que el usuario
	 * introduce un número, el programa le dice si es mayor o menor. Al final,
	 * el programa indica si se ha ganado o no. Si acierta, el programa finaliza
	 * aunque no haya agotado el número de intentos.
	 */
	public static void main(String[] args) {
		
		/** VARIABLES Y OBJETOS */
		Scanner teclado = new Scanner(System.in);
		int numInferior, numSuperior, numIntento;
		Random rnd = new Random();
		int numAle,respuesta;
		
		/**PEDIMOS VARIABLES*/
		do {
			System.out.print("Número inferior: ");
			numInferior = teclado.nextInt();
			System.out.print("Número superior: ");
			numSuperior = teclado.nextInt();
			if(numInferior>=numSuperior)
				System.out.println("El numero inferior no puede ser mayor que el superior ni igual.");
		} while (numInferior>=numSuperior);

		do {
			System.out.println("Número de intentos");
			numIntento=teclado.nextInt();
			if(numIntento <=0)
				System.out.println("El numero de intentos no puede ser menor o igual a 0.");
			
		} while (numIntento <=0);

		
		/**OBTENEMOS NUMERO ALtEATORIO*/
		numAle=rnd.nextInt(numSuperior-numInferior+1)+numInferior;
		
		/**PREGUNTAMOS AL USUARIO CUAL ES EL NUMERO*/
		System.out.println("¡¡¡¡ADIVINA ADIVINANZAAAAAA!!!!");
		do {
			System.out.println("¿Qué numero tengo en mi cabezita?");
			respuesta=teclado.nextInt();
			
			if(respuesta != numAle){//OPORTUNIDAD FALLIDA
				numIntento --;
				System.out.println("Ohhhh ... Ese número no es.");
				
				if(numIntento==0)//NOS HEMOS QUEDADO SIN INTENTOS
					System.out.printf("Has agotado el número de intentos.%nEl número que tenía en mente es: %d.%nGAME OVER%n",numAle);
				else {//AUN TENEMOS INTENTOS
					System.out.printf("Número de oportunidades restantes: %d. %n¡¡¡Sigue intentandolo !!!%n",numIntento);
					
					//INDICAMOS SI EL NUMERO DADO ES MAYOR O MENOR AL ALEATORIO
					if(respuesta <= numAle)
						System.out.printf("Como pista te diré que el número es mayor que %d.%n%n",respuesta);
					else if(respuesta >= numAle)
						System.out.printf("Como pista te diré que el número es menor que %d.%n",respuesta);
				}
			}
			else//OPORTUNIDAD ACERTADA
				System.out.printf("¡¡¡ME GANASTES!!!%nEl número que tenía en mente efectivamente, es %d.%n",numAle);
			
		} while (numIntento==0 || respuesta !=numAle);
		
		teclado.close();

	}

}
