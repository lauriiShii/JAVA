package BoletinEstructurada;
import java.util.Random;

public class Ejercicio08Forma2 {

	/**
	 * Hacer un programa que saque una carta aleatoria de una baraja donde haya
	 * Picas ♠, Corazones ♥, Diamantes ♦ y Tréboles ♣. Las cartas irán del as al
	 * diez y habrá tres figuras: jota, reina y rey.
	 */
	public static void main(String[] args) {
		
		/**VARIABLE Y OBJETOS*/
		Random rnd = new Random();
		int carta=rnd.nextInt((13-1)+1)+1;
		int palo=rnd.nextInt((4-1)+1)+1;
		String figura="", mensaje="";
		
		switch (carta) {
		case 1:
			if (carta == 1) 
				mensaje="As";
			break;
		case 2:
			if (carta == 2)
				mensaje="Jota";
			break;
		case 3:
			if (carta == 3)
				mensaje="Reina";
			break;
		case 4:
			if (carta == 4)
				mensaje="Rey";
			break;
		case 5:
			
			break;
		}
		
		switch (palo) {
		case 1:
			if (palo == 1) 
				figura="Corazones ♥";
			break;
		case 2:
			if (palo == 2)
				figura="Picas ♠";
			break;
		case 3:
			if (palo == 3)
				figura="Rombos ♦";
			break;
		case 4:
			if (palo == 4)
				figura="Treboles ♣";
			break;
		}
		
		System.out.println("La carta aleatoria es:  " +mensaje+ " de " +figura);
	}

}
 