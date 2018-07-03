package Boletin;

import java.util.Random;

import Teclado.Rango;
import Teclado.Teclado;

public class Ejercicio21 {
	/** ADIVINANZA */
	static Random rnd = new Random();

	public static void main(String[] args) {

		/** DECLARACION VARIABLES Y OBJETOS */
		int AleTipo, Ale, oportunidad, opcion, numero[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		char vocal[] = { 'a', 'e', 'i', 'o', 'u' }, consonante[] = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
				'n', 'p', 'q', 't', 'v', 'w', 'x', 'y', 'z' };
		String tipo[] = { "un numero del 0 al 9", "una vocal minuscula", "una consonante minuscula" }, comenzar;
		boolean salir = false, respuestaCorrecta;

		/** INTRODUCION */
		comenzar = Teclado.cadena(
				"Hola amigo !!! He pensado que podemos jugar a un juego.\nTú piensas en una letra o número de un digito y yo tengo que adivinarlo :)\nPiensalo y cuando estes listo pulsa cualquier tecla.");

		/** ADIVINANZA DEL TIPO */

		oportunidad = 0;
		respuestaCorrecta = false;
		do {
			oportunidad++;
			AleTipo = rnd.nextInt(tipo.length);
			System.out.printf("¿¿Es %s ?? ", tipo[AleTipo]);
			opcion = Teclado.numeroInt("(1.SI  2.NO)", 1, 2, Rango.INCLUIDO_MIN_MAX);

			if (opcion == 1){
				System.out.println("Pasamos al siguiente paso :P");
				respuestaCorrecta = true;
			}

			else if (oportunidad == 2) {
				System.out.println("Ooohhhhhhh... Yo pierdo, TÚ GANAS !!\nJuego finalizdo.");
				salir = true;
			}

		} while (respuestaCorrecta == false && salir == false);

		/** ADIVINANZA DEL CARACTER PENSADO */
		if(salir == false){
			switch (AleTipo) {
	
			/** NUMERO 0-9 */
			case 0:
				oportunidad = 0;
				respuestaCorrecta = false;
				do {
					oportunidad++;
					Ale = rnd.nextInt(numero.length);
					System.out.printf("¿¿Es %d ?? ", numero[Ale]);
					opcion = Teclado.numeroInt("(1.SI  2.NO)", 1, 2, Rango.INCLUIDO_MIN_MAX);
	
					if (opcion == 1){
						System.out.println("La maquina te ha ganado, YO GANO !!\nJuego finalizado.");
						respuestaCorrecta = true;
					}
					else if (oportunidad == 2) {
						System.out.println("Ooohhhhhhh... Yo pierdo, TÚ GANAS !!\nJuego finalizdo.");
						salir = true;
					}
	
				} while (respuestaCorrecta == false && salir == false);
				break;
	
			/** VOCAL MINUSCULA */
			case 1:
				oportunidad = 0;
				respuestaCorrecta = false;
				do {
					oportunidad++;
					Ale = rnd.nextInt(vocal.length);
					System.out.printf("¿¿Es %c ?? ", vocal[Ale]);
					opcion = Teclado.numeroInt("(1.SI  2.NO)", 1, 2, Rango.INCLUIDO_MIN_MAX);
	
					if (opcion == 1){
						System.out.println("La maquina te ha ganado, YO GANO !!\nJuego finalizado.");
						respuestaCorrecta = true;
					}
					else if (oportunidad == 3) {
						System.out.println("Ooohhhhhhh... Yo pierdo, TÚ GANAS !!\nJuego finalizdo.");
						salir = true;
					}
	
				} while (respuestaCorrecta == false && salir == false);
				break;
	
			/** CONSONANTE MINUSCULA */
			case 2:
				oportunidad = 0;
				respuestaCorrecta = false;
				do {
					oportunidad++;
					Ale = rnd.nextInt(consonante.length);
					System.out.printf("¿¿Es %c ?? ", consonante[Ale]);
					opcion = Teclado.numeroInt("(1.SI  2.NO)", 1, 2, Rango.INCLUIDO_MIN_MAX);
	
					if (opcion == 1){
						System.out.println("La maquina te ha ganado, YO GANO !!\nJuego finalizado.");
						respuestaCorrecta = true;
					}
					else if (oportunidad == 5) {
						System.out.println("Ooohhhhhhh... Yo pierdo, TÚ GANAS !!\nJuego finalizdo.");
						salir = true;
					}
	
				} while (respuestaCorrecta == false && salir == false);
				break;
			}
		}
	}

}
