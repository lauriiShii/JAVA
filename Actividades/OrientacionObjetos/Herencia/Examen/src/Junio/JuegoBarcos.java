package Junio;

public class JuegoBarcos {
	public static void main(String[] args) {
	
		//APARTADO 1
		Portaaviones Portaavion1 = new Portaaviones ("Poortavion1",39);
		Velero Velero1 = new Velero ("Velero1", 30, 3);
		Velero Velero2 = new Velero ("Velero2", 25, 3);
		Velero Velero3 = new Velero ("Velero3", 18, 2);
		Velero Velero4 = new Velero ("Velero4", 5, 1);
		Velero Velero5 = new Velero ("Velero5", 3, 1);
		
		//APARTADO 3
		// Creamos tablero
		Tablero tablero = new Tablero();

		// Clonamos
		Tablero c1;
		c1 = (Tablero) tablero.clone();
		
		// Comparamos
		System.out.printf("\n¿EL CLON DE TABLERO Y C1 SON IGUALES?: %s%n", tablero.equals(c1) ? "Si" : "No");

	}
}
