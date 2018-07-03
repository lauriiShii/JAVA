package BoletinRecursividad;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio08 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que calcule el factorial de un número entero positivo que se introduce por
		 * teclado.
		 */
		
		/** VARIABLES **/
		
		int num;
		
		Scanner scan= new Scanner (System.in);
		
		/** CÓDIGO **/
		
		do {
			try{
				System.out.printf("Introduce un número entero positivo mayo de cero..%n");
				num=scan.nextInt();
				if (num<1) System.out.printf("Por favor, introduzca un número entero mayor de cero.%n%n");
			}catch(InputMismatchException e){
				//Imprimimos el mensaje de error
				System.out.printf("¡¡ERROR!! El valor introducido no es reconocido, por favor:.%n%n");
				//Limpiamos el buffer
				scan.nextLine();
				//Forza la repetición del bucle
				num=-1;
			}
		} while (num<=0);
		
		System.out.printf("%n5!= %.0f %n", factorial(num));
		
		scan.close();	
	}
	
	public static double factorial(int num){
		double resu;
		//Si el número es menor o igual que uno que retorne 1
		if(num<=1) resu=1;
		//Sino vuelve a llamar la función, pero de num-1
		else resu=num*factorial(num-1);
		
		return resu;
	}

}
