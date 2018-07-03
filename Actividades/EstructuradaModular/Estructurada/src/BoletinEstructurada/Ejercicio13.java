package BoletinEstructurada;
import java.util.Random;
import java.util.Scanner;


public class Ejercicio13 {
	
	/**Generar 15 números aleatorios entre el rango de dos números solicitados al usuario.*/
	public static void main(String[] args) {
		
		/**VARIABLE Y OBJETOS*/
		Scanner teclado = new Scanner(System.in);
		Random rnd = new Random();
		int rango1=0, rango2=0,i;
		
		/**PEDIMOS DOS RANGOS*/
		do {
			System.out.println("Introduce el rango numero 1: ");
			rango1 = teclado.nextInt();
			
			System.out.println("Introduce el rango numero 2: ");
			rango2 = teclado.nextInt();
			
			if(rango1>=rango2)
				System.out.println("El numero 1 no puede ser mayor o igual al 2");
		} while (rango1>=rango2);
		
		teclado.close();
		
		/**MOSTRAMOS ALEATORIOS*/
		for (i = 0; i <=15; i++) {
			int dado=rnd.nextInt((rango2-rango1)+1)+rango1; // Se pone dentro del for para que el resultado del random sea diferente siempre
			System.out.println("Tirada "+(i+1)+": "+dado);
		}


	}

}
