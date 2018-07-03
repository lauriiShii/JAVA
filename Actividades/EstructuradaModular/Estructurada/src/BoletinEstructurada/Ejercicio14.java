package BoletinEstructurada;
import java.util.Scanner;

enum sexo{
	MUJER,HOMBRE
}

public class Ejercicio14 {
	/**
	 * Hacer un programa que le pida al usuario los siguientes datos. Si algún
	 * dato no es válido, pedir el dato repetidas veces hasta que sea válido. •
	 * La edad: controlar que sea mayor de edad y menor de 40. • El sexo:
	 * controlar que sea hombre ó mujer (utilizar enum) • Número de hijos:
	 * controlar que no sea negativo.
	 */
	public static void main(String[] args) {

		/**OBJETOS Y VARIABLES*/
		Scanner teclado = new Scanner(System.in);
		int edad;
		sexo sexo= null;
		int numHijos, sex=0;
		
		/**PEDIMOS DATOS AL USUARIO*/
		do {
			System.out.println("Indica tu edad: ");
			edad=teclado.nextInt();
		} while (edad<=18 || edad>40);
		
		do {
			System.out.println("Indica tu sexo: (1.MUJER,2.HOMBRE)");
			sex=teclado.nextInt();
			if(sex==1)
				sexo=sexo.MUJER;
			else if (sex==2)
				sexo=sexo.HOMBRE;
		} while (sex<1 || sex>2);

		do {
			System.out.println("Indica numero de hijos: ");
			numHijos=teclado.nextInt();
		} while (numHijos<=0);
		
		teclado.close();
		
		System.out.printf("%nSu edad es de %d, su numero de hijos es %d y su sexo es "+sexo,edad,numHijos);

	}

}
