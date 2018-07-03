package BoletinRecursividad;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio09 {

	static Scanner scan= new Scanner (System.in);
	
	public static void main(String[] args) {
		/*
		 * Escribe un programa que calcule x^n, siendo x y n dos números enteros que se introducen por teclado.
		 */
		/** VARIABLES **/
		
		int base, exponente;
		double resu;
				
		/** CÓDIGO **/
		
		base=introInt("Introduce una base entera.");
		
		exponente=introInt("Introduce un exponente entero.");
		
		resu=potencia(base, exponente);
		
		System.out.printf("%nResultado: %d elevado a %d = %.15f%n", base, exponente, resu);
		
		scan.close();
	}
	
	public static double potencia(int base, int exponente){
		double resu=0;

		//Si la base es cero el resultado es cero
		if (base==0) resu=0;
		//Si el exponente es 0, el resultado vale 1 (condición salida recursiva)
		else if (exponente==0) resu=1;
		//Si el exponente es negativo 1/base*función con valor absoluto de exponente-1 (para pasar el exponente a positivo)
		else if (exponente<0) resu=(double)1/(base*potencia(base, Math.abs(exponente)-1));
		//Sino base por la función con exponente-1
		else resu=base*potencia(base, exponente-1);
		
		return resu;
	}
	
	public static int introInt(String mensaje){
		int num=0;
		boolean error=false;
		do {
			try{
				System.out.printf("%s%n",mensaje);
				num=scan.nextInt();
				error=false;
			}catch(InputMismatchException e){
				//Imprimir el mensaje de error
				System.out.printf("¡¡ERROR!! El valor introducido no es reconocido, por favor:.%n%n");
				//Limpiar el buffer
				scan.nextLine();
				//Forza la repetición del bucle
				error=true;
			}
		} while (error);
		
		return num;
	}

}
