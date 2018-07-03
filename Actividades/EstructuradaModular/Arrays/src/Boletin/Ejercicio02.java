package Boletin;
import Teclado.Teclado;


public class Ejercicio02 {
	/**Crea un array, rellénalo con valores desde el teclado. Muestra sus elementos indicando para
	cada uno si es par o impar.*/
	public static void main(String[] args) {
		
		/**DECLARACION VARIABLES Y OBJETOS*/
		int datos [] = new int [5];
		int i, j;
		
		/**PEDIMOS DATOS*/
		for(i=0; i<datos.length; i++)
			datos [i]= Teclado.numeroInt("Dato "+i+" :");
		
		//MOSTRAMOS DATOS
		for (j=0; j<datos.length; j++) {
			
			/*SI EL DATO ALMACENADO ES PAR SE INDICA**/
			if(datos [j] % 2 == 0)
				System.out.printf("El número \"%d\" introducido en la posicion \"%d\" es par.%n", datos [j], j);
			/**SINO SE INDICA COMO IMPAR*/
			else
				System.out.printf("El número \"%d\" introducido en la posicion \"%d\" es impar.%n", datos [j], j);
		}

	}

}
