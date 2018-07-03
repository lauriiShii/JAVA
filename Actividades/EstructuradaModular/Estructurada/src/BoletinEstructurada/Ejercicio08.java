package BoletinEstructurada;

public class Ejercicio08 {

	/**
	 * Hacer un programa que saque una carta aleatoria de una baraja donde haya
	 * Picas ♠, Corazones ♥, Diamantes ♦ y Tréboles ♣. Las cartas irán del as al
	 * diez y habrá tres figuras: jota, reina y rey.
	 */
	public static void main(String[] args) {

		/**VARIABLES Y OBJETOS*/
		int iPalo = (int)(Math.random()*4);
		int iCarta = (int)(Math.random()*13);
		String palo [] = {"♠","♥","♦","♣"};
		String carta [] = {"as","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez","jota","reina","rey"};
		

		/**MOSTRAMOS LA CARTA*/
		System.out.println("La carta aleatoria es " + carta[iCarta] + " de " + palo[iPalo]);

	}

}
