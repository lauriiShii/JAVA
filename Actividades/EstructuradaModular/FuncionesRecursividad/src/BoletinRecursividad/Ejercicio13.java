package BoletinRecursividad;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio13 {
	
	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
		/*
		 * Realizar un programa para resolver el juego de las Torres de Hanoi. El juego consiste en tres 
		 * varillas verticales. En una de las varillas se apila un número indeterminado de discos. Los discos 
		 * se apilan sobre una varilla en tamaño decreciente. No hay dos discos iguales, y todos ellos están
		 * apilados de mayor a menor radio en una de las varillas, quedando las otras dos varillas vacantes.
		 * El juego consiste en pasar todos los discos de la varilla ocupada a una de las otras varillas
		 * vacantes. Para realizar este objetivo, es necesario seguir estas simples reglas:
		 * 		• Sólo se puede mover un disco cada vez.
		 * 		• Un disco de mayor tamaño no puede descansar sobre uno más pequeño que él mismo.
		 * 		• Sólo puedes desplazar el disco que se encuentre arriba en cada varilla.
		 * El movimiento de n discos se puede visualizar en términos de mover sólo n-1 discos (y de ahí la recursión) como sigue:
		 * 		a) Pasar n-1 discos de la varilla 1 a la 2, usando la varilla 3 como área de retención temporal.
		 * 		b) Pasar el último disco (el más grande) de la varilla 1 a la 3.
		 * 		c) Pasar los n-1 discos de la varilla 2 a la 3, empleando la varilla 1 como área de retención temporal.
		 * El proceso termina cuando la última tarea implica pasar n=1 disco, esto es, el caso base. Esto
		 * se logra transfiriendo el disco sin necesidad de un área de retención temporal.
		 * Escribe una función recursiva con cuatro parámetros:
		 * 		a) El número de discos por transferir.
		 * 		b) La varilla en la que están colocados inicialmente esos discos.
		 * 		c) La varilla a la que debe pasarse esa pila de discos.
		 * 		d) La varilla que se usará como área de retención temporal.
		 * El programa deberá imprimir las instrucciones precisas requeridas para pasar los discos de la
		 * varilla inicial a la varilla de destino. Por ejemplo, para pasar una pila de tres discos de la
		 * varilla 1 a la varilla 3, el programa deberá imprimir la siguiente serie de movimientos:
		 * 		1 → 3
		 * 		1 → 2
		 * 		3 → 2
		 * 		1 → 3
		 * 		2 → 1
		 * 		2 → 3
		 * 		1 → 3
		 */
		
		/** VARIABLES **/
		
		int discos;
		
		/** C�DIGO **/

		discos=introInt("Introduce el n�mero de disco que desee (entero positivo mayor de cero)");
		hanoi('A','B','C', discos);
		
		scan.close();
	}
	
	public static void hanoi (char varillaInicial, char varillaAux, char varillaFinal, int disco){
		
		//Caso base: si es el caso base 
		if (disco == 1) System.out.printf("%nMover disco%d desde varilla %c hasta varilla %c%n", disco, varillaInicial, varillaFinal);
		else{
			//Llamar a hanoi A C B, de disco-1
			hanoi(varillaInicial, varillaFinal, varillaAux, disco-1);
			//Imprimir la varilla inicial y varilla final de un determinado disco
			System.out.printf("%nMover disco%d desde varilla %c hasta varilla %c%n", disco, varillaInicial, varillaFinal);
			//Llamar B A C de disco-1
			hanoi(varillaAux, varillaInicial, varillaFinal, disco-1);
		}
	}
	
	public static int introInt(String mensaje){
		int num=0;
		
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
