package Parte2;

public class Main {

	public static void main(String[] args) {
		
		Plantas miPlanta = new Plantas(3.60, false);
		Insectos miInsecto = new Insectos("Verde", 5, 4);
		Plantas miPlanta2 = new Plantas(1.20, true);
		Insectos miInsecto2 = new Insectos("Rojo", 6, 3);
		Plantas miPlanta3 = new Plantas(3.60, false);
		Insectos miInsecto3 = new Insectos("Verde", 5, 4);
		
		//COMPARACION IGUAL CLASE PLANTA
		System.out.println((miPlanta3.equals(miPlanta)?miPlanta3.toString() + " \nEs igual a " + miPlanta.toString():miPlanta3.toString() + " \nNo es igual a " + miPlanta.toString()));
		
		//COMPARACION DIFERENTE PLANTA
		System.out.println((miPlanta.equals(miPlanta2)?miPlanta.toString() + " \nEs igual a " + miPlanta2.toString():miPlanta.toString() + " \nNo es igual a " + miPlanta2.toString()) + "\n");
		
		//COMPARACION IGUAL CLASE INSECTO
		System.out.println((miInsecto3.equals(miInsecto)?miInsecto3.toString() + " \nEs igual a " + miInsecto.toString():miInsecto3.toString() + " \nNo es igual a " +miInsecto.toString()));
		
		//COMPARACION DIFERENTE INSECTO
		System.out.println((miInsecto.equals(miInsecto2)?miInsecto.toString() + " \nEes igual a " + miInsecto2.toString():miInsecto.toString() + " \nNo es igual a " + miInsecto2.toString()));
		
		//COMPARACION DIFERENTE DE DISTINTAS CLASES.
		System.out.println((miPlanta.equals(miInsecto)?miPlanta.toString() + " \nEs igual a " + miInsecto.toString():miPlanta.toString() + " \nNo es igual a " + miInsecto.toString()));
	}
}