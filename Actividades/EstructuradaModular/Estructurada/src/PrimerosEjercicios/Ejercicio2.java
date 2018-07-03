package PrimerosEjercicios;
import java.util.Scanner;

public class Ejercicio2 {

	//2. Dada una edad, que te muestre por pantalla si es mayor de edad o no.
	//Tipo de estructura: Condicional compuesta.
	public static void main(String[] args) {
		
		int edad=0;
		Scanner teclado= new Scanner(System.in);

		System.out.println("¿Que edad tienes?");
		
		edad=teclado.nextInt();
		
		teclado.close();
		
		if(edad>=18)
			System.out.println("Mayor de edad");
		else
			System.out.println("Menor de edad");

	}

}
