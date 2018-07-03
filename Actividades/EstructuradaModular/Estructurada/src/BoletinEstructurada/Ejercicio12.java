package BoletinEstructurada;
import java.util.Random;

public class Ejercicio12 {
	
	/**Hacer un programa para simular 20 lanzamientos de un dado.*/
	public static void main(String[] args) {
		
		/**VARIABLES Y OBJETOS*/
		Random rnd = new Random();
		int i, dado;
		
		/**TIRAMOS DADO 6 VECES*/
		for (i = 0; i <=20; i++) {
			dado=rnd.nextInt(6)+1; // Se pone dentro del for para que el resultado del random sea diferente siempre
			System.out.println("Tirada "+i+": "+dado);
		}

	}

}
