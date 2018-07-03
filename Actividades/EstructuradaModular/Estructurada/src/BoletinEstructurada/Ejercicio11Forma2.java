package BoletinEstructurada;
import java.util.Scanner;


public class Ejercicio11Forma2 {

	/**
	 * Realizar un programa en el cual se introduzcan diez notas numéricas
	 * correspondientes a las calificaciones de un grupo de alumnos y se
	 * presenten en pantalla el número de muy deficientes, insuficientes,
	 * aprobados, notables y sobresalientes del mismo.
	 */
	
	public static void main(String[] args) {
		
	//Peticion 10 notas (bucle)
		//Comprobar nota c incrementar el contador correspondiente e 
		//incrementar el contador correspondiente (muydef,insuf,aprob...)
	//Mostrar contadores
	
		/** VARIABLES Y OBJETOS */
		Scanner teclado = new Scanner(System.in);
		int num;
		int i, insuficiente=0, suficiente=0, deficiente=0, aprobado=0, notable=0, sobresaliente=0;

		/** PEDIMOS NUMEROS */
		System.out
		.println("Introduce 10 notas para saber cuantas hay de cada:");
		for (i = 0; i < 10; i++)
			do {
				
				System.out.println("numero " + (i+1) + ":");
				num = teclado.nextInt();

				if (num < 0)
					System.out.println("El dato no es valido, repitelo.");
				if(num<4)
					deficiente++;
				if(num>=4 && num<5)
					insuficiente++;
				if(num>=5 && num<6)
					 suficiente++;
				if(num>=6 && num<7)
					 aprobado++;
				if(num>=7 && num<9)
					notable++;
				if(num>=9 && num<=10)
					sobresaliente++;
			} while (num < 0 || num > 10);

		teclado.close();

		/** CONTAMOS QUE TIPO DE NOTAS HAY */
		
		System.out.printf("Tras hacer el recuento queda:"
				+ "%nDeficiente: %d"
				+ "%nInsuficiente: %d"
				+ "%nSuficiente: %d"
				+ "%nAprobado: %d"
				+ "%nNotable: %d"
				+ "%nSobresaliente: %d",deficiente,insuficiente,suficiente,aprobado,notable,sobresaliente);
		
	}

}
