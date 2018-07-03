package BoletinEstructurada;
import java.util.Scanner;

public class Ejercicio04 {

	/**
	 * Diseñar un algoritmo que calcule el precio de un billete de ida y vuelta
	 * por avión, conociendo la distancia a recorrer, el número de días de
	 * estancia y sabiendo que si la distancia es superior a 1.000 Km y el
	 * número de días de estancia es superior a 7, la línea aérea le hace un
	 * descuento del 30 %. (Precio por kilómetro = 0,35 €).
	 */
	public static void main(String[] args) {

		/** VARIABLES Y OBJETOS */
		Scanner teclado = new Scanner(System.in);
		
		int distancia, numDias;
		final int MAXDISTANCIA = 1000;
		final int MAXDIAS = 7;
		double precioKm = 0.35;

		/** PEDIMOS DATOS AL CLIENTE */
		do {
			System.out
			.println("¡BIEN VENIDO A SU BUSCADOR DE OFERTAS!\n"
					+ "Para comenzar introduzca los siguientes datos: "
					+ "\n\nDistancia en km que recorrera en total  entre la ida y la vuelta: ");
			distancia = teclado.nextInt();
	
			System.out.println("Días que estara en el viaje: ");
			numDias = teclado.nextInt();
			
			if(distancia <=0 && numDias <=0)
				System.out.println("La distancia y el número de días de la estancia deben ser mayores que 0.");
			
		} while (distancia <=0 && numDias <=0);
		
		teclado.close();
		
		/**COMPROBAMOS DESCUENTOS Y MOSTRAMOS PRECIO TOTAL*/
		if (numDias >= MAXDIAS && distancia >= MAXDISTANCIA)
			System.out.println("¡EN HORABUENAAA!\n"
					+ "¡LE CORRESPONDE UN DESCUENTO POR DÍAS DE ESTANCIA Y KM RECORRIDOS!\n"
					+ "El precio de su viaje es de: "+((distancia*precioKm)*0.30));
		else
			System.out.println("¡OHHHHHH, NO SE HA ENONTRADO NINGUN DESCUENTO!\n"
					+ "El precio de su viaje es: "+(distancia*precioKm)+"€");

		

	}

}
