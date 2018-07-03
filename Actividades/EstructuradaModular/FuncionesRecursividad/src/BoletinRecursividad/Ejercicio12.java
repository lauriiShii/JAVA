package BoletinRecursividad;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio12 {
	
	static Scanner scan= new Scanner (System.in);

	public static void main(String[] args) {
		/*
		 * Escribe un programa que calcule el primer elemento de la serie de Fibonacci que sea mayor o 
		 * igual que un valor introducido por teclado. Utiliza la función recursiva hecha en el ejercicio 
		 * anterior.
		 */
		
		/** VARIABLES **/
		int num, i, resultado=0;
		
		/** CÓDIGO **/
		
		num=introInt("Introduzca un entero positivo mayor de 0: ");
		
		System.out.printf("Serie fibonacci: ");
		for (i=1;num>=resultado;i++){
			resultado= fibonacci(i);
			//System.out.printf("%d ", resultado);
		}
		System.out.printf("%nEl valor de la serie Fibonacci mayor que %d es: %d %n", num, resultado);
		
		scan.close();
		
	}
	
	public static int fibonacci(int num){
		int resultado;
		
		if (num<2) resultado=num;
		else resultado=fibonacci(num-1)+fibonacci(num-2);
		
		return resultado;
	}
	
	public static int introInt(String mensaje){
		int num=0;
		//Scanner scan= new Scanner (System.in);
		
		do {
			try{
				System.out.printf("%s%n",mensaje);
				num=scan.nextInt();
				if (num<1) System.out.printf("%nValor no válido, por favor: ");
			}catch(InputMismatchException e){
				//Imprimimos el mensaje de error
				System.out.printf("%n¡¡ERROR!! El valor introducido no es reconocido, por favor:%n%n");
				//Limpiamos el buffer
				scan.nextLine();
				//Forza la repetición del bucle
				num=-1;
			}
		} while (num<1);
		
		return num;
	}

}
