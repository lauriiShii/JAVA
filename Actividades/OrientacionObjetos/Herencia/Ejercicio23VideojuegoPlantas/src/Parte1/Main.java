package Parte1;

public class Main {

	public static void main(String[] args) {
		
		Plantas miPlanta = new Plantas(3.60, false);
		System.out.printf("Se ha creado la planta numero: %d", miPlanta.getOrden());
	
		Insectos miInsecto = new Insectos("Verde", 5, 4);
		System.out.printf("\nSe ha creado el insecto numero: %d", miInsecto.getOrden());
		
		Plantas miPlanta2 = new Plantas(1.20, true);
		System.out.printf("\nSe ha creado la planta numero: %d", miPlanta2.getOrden());
	
		Insectos miInsecto2 = new Insectos("Rojo", 6, 3);
		System.out.printf("\nSe ha creado el insecto numero: %d", miInsecto2.getOrden());
		
		Plantas miPlanta3 = new Plantas(3.60, false);
		System.out.printf("\nSe ha creado la planta numero: %d", miPlanta3.getOrden());
		
		Insectos miInsecto3 = new Insectos("Verde", 5, 4);
		System.out.printf("\nSe ha creado el insecto numero: %d", miInsecto3.getOrden());
		
		
		
		
		
		
	}
	
	

}
