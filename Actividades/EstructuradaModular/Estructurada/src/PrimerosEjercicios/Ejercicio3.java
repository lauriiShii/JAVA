package PrimerosEjercicios;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*3. Dado un número, indicar si es par o impar.
		 * Tipo de estructura; condicional compuesta*/ 
		
	Scanner teclado=new Scanner (System.in); 
	int numero;
	
	System.out.print("Introducir numero ");
	numero=teclado.nextInt();
	
	if(numero%2==0) System.out.print("par");
	else System.out.print("impar");
	
	teclado.close();
	
	}

}
