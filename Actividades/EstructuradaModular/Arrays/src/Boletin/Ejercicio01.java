package Boletin;
import Teclado.Teclado;
public class Ejercicio01 {
	/**Diseñar un programa que lea datos del teclado, los almacene en un array y, a continuación,
visualice los elementos que ocupan las posiciones pares.*/
	public static void main(String[] args) {
		
		/**DECLARACION VARIABLES Y OBJETOS*/
		String datos [] = new String [5];
		int i, j;
		
		/**PEDIMOS DATOS*/
		for(i=0; i<datos.length; i++){
			datos [i]= Teclado.cadena("Dato :");
		}
		
		/**MOSTRAMOS PARES*/
		System.out.println("\n\nDatos en posiciones impares:");
		for(j=0; j<datos.length; j++){
			if (j % 2 == 0)
				System.out.println("Dato :"+datos [j]);
		}

	}

}
