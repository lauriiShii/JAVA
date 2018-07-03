package BoletinRecursividad;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio10 {
	
	static Scanner scan= new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * El máximo común divisor de los enteros x y y es el entero más grande que es divisor exacto de
		 * x y de y. Escribe una función recursiva gcd que devuelva el máximo común divisor de x y y. El 
		 * máximo común divisor de x y y se define recursivamente como sigue: si y es igual a 0, 
		 * entonces gcd(x,y) es x; en caso contrario, gcd(x,y) es gcd(y,x%y).
		 */
		
		/** VARIABLES **/
		int x, y, resu;
		
		/** CÓDIGO **/
		x=introInt("Introduce un número entero: ");
		y=introInt("Introduce otro número entero:");
		
		resu=gcd(x,y);
		
		System.out.printf("El máximo común divisor de %d y %d es: %d%n", x, y, resu);
		
		scan.close();
		
	}
	
	public static int gcd(int x, int y){
		int resultado=0;
		
		if (y==0) resultado=x;
		else resultado = gcd(y, x%y);
		return resultado;
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