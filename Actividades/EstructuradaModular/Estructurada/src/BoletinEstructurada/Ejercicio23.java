package BoletinEstructurada;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio23 {
	/**
	 * Realiza un juego de adivinanza de un n�mero entero. El programa pedir�
	 * dos n�meros (el n�mero inferior y el n�mero superior), por ejemplo 1 y
	 * 100, y un n�mero de intentos, por ejemplo, 4. El programa obtendr� a
	 * continuaci�n un n�mero aleatorio entre 1 y 100, y el usuario deber�
	 * adivinarlo utilizando como mucho 4 intentos. Cada vez que el usuario
	 * introduce un n�mero, el programa le dice si es mayor o menor. Al final,
	 * el programa indica si se ha ganado o no. Si acierta, el programa finaliza
	 * aunque no haya agotado el n�mero de intentos.
	 */
	public static void main(String[] args) {
		
		/** VARIABLES Y OBJETOS */
		Scanner teclado = new Scanner(System.in);
		int numInferior, numSuperior, numIntento;
		Random rnd = new Random();
		int numAle,respuesta;
		
		/**PEDIMOS VARIABLES*/
		do {
			System.out.print("N�mero inferior: ");
			numInferior = teclado.nextInt();
			System.out.print("N�mero superior: ");
			numSuperior = teclado.nextInt();
			if(numInferior>=numSuperior)
				System.out.println("El numero inferior no puede ser mayor que el superior ni igual.");
		} while (numInferior>=numSuperior);

		do {
			System.out.println("N�mero de intentos");
			numIntento=teclado.nextInt();
			if(numIntento <=0)
				System.out.println("El numero de intentos no puede ser menor o igual a 0.");
			
		} while (numIntento <=0);

		
		/**OBTENEMOS NUMERO ALtEATORIO*/
		numAle=rnd.nextInt(numSuperior-numInferior+1)+numInferior;
		
		/**PREGUNTAMOS AL USUARIO CUAL ES EL NUMERO*/
		System.out.println("����ADIVINA ADIVINANZAAAAAA!!!!");
		do {
			System.out.println("�Qu� numero tengo en mi cabezita?");
			respuesta=teclado.nextInt();
			
			if(respuesta != numAle){//OPORTUNIDAD FALLIDA
				numIntento --;
				System.out.println("Ohhhh ... Ese n�mero no es.");
				
				if(numIntento==0)//NOS HEMOS QUEDADO SIN INTENTOS
					System.out.printf("Has agotado el n�mero de intentos.%nEl n�mero que ten�a en mente es: %d.%nGAME OVER%n",numAle);
				else {//AUN TENEMOS INTENTOS
					System.out.printf("N�mero de oportunidades restantes: %d. %n���Sigue intentandolo !!!%n",numIntento);
					
					//INDICAMOS SI EL NUMERO DADO ES MAYOR O MENOR AL ALEATORIO
					if(respuesta <= numAle)
						System.out.printf("Como pista te dir� que el n�mero es mayor que %d.%n%n",respuesta);
					else if(respuesta >= numAle)
						System.out.printf("Como pista te dir� que el n�mero es menor que %d.%n",respuesta);
				}
			}
			else//OPORTUNIDAD ACERTADA
				System.out.printf("���ME GANASTES!!!%nEl n�mero que ten�a en mente efectivamente, es %d.%n",numAle);
			
		} while (numIntento==0 || respuesta !=numAle);
		
		teclado.close();

	}

}
