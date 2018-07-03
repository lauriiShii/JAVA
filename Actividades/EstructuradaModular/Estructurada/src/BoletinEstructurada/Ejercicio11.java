package BoletinEstructurada;
import java.util.Scanner;

public class Ejercicio11 {

	/**
	 * Realizar un programa en el cual se introduzcan diez notas numéricas
	 * correspondientes a las calificaciones de un grupo de alumnos y se
	 * presenten en pantalla el número de muy deficientes, insuficientes,
	 * aprobados, notables y sobresalientes del mismo.
	 */
	
	//Peticion 10 notas (bucle)
		//Comprobar nota c incrementar el contador correspondiente e 
		//incrementar el contador correspondiente (muydef,insuf,aprob...)
	//Mostrar contadores
	
	public static void main(String[] args) {

		/** VARIABLES Y OBJETOS */
		Scanner teclado = new Scanner(System.in);
		int[] num;
		num = new int[10];
		int i,j, insuficiente=0, suficiente=0, deficiente=0, aprobado=0, notable=0, sobresaliente=0;

		/** PEDIMOS NUMEROS */

		for (i = 0; i < 10; i++)
			do {
				System.out
						.println("Introduce 10 notas para saber cuantas hay de cada:");
				System.out.println("numero " + (i+1) + ":");
				num[i] = teclado.nextInt();

				if (num[i] < 0)
					System.out.println("El dato no es valido, repitelo.");

			} while (num[i] < 0 || num[i] > 10);

		teclado.close();

		/** CONTAMOS QUE TIPO DE NOTAS HAY */
		for ( j = 0; j <10; j++) {
			if(num[j]<4)
				deficiente=deficiente+1;
			if(num[j]>=4 && num[j]<5)
				insuficiente=insuficiente+1;
			if(num[j]>=5 && num[j]<6)
				 suficiente= suficiente+1;
			if(num[j]>=6 && num[j]<7)
				 aprobado= aprobado+1;
			if(num[j]>=7 && num[j]<9)
				notable=notable+1;
			if(num[j]>=9 && num[j]<=10)
				sobresaliente=sobresaliente+1;
		}
		
		System.out.printf("Tras hacer el recuento queda:"
				+ "%nDeficiente: %d"
				+ "%nInsuficiente: %d"
				+ "%nSuficiente: %d"
				+ "%nAprobado: %d"
				+ "%nNotable: %d"
				+ "%nSobresaliente: %d",deficiente,insuficiente,suficiente,aprobado,notable,sobresaliente);
		
	}
}
