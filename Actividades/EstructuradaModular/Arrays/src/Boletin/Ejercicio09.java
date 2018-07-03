package Boletin;

import Teclado.Teclado;

public class Ejercicio09 {
	/**Crea un array, rell�nalo con valores le�dos desde el teclado. Imprime el n�mero de veces que
	aparece un n�mero indicado por el usuario y la posici�n en el array.
	Por ejemplo:
	Si el array tiene 5 elementos con los siguientes valores: 1, 2,4,2,1
	Y el usuario quiere saber cuantas veces aparece el 2, en la pantalla hay que mostrar la
	respuesta en el siguiente formato:
	El numero 2 se repite 2 veces.
	Las posiciones que contienen el valor 2 son: 1,3.*/
	public static void main(String[] args) {
		
		/**DECLARACION VARIABLES Y OBJETOS*/
		int tamanio, datos [], dato;
		int i, j, cont=0, cont2=0, k;
		
		/**PEDIMOS DATOS*/
		//TAMA�O
		tamanio = Teclado.numeroInt("�Qu� cantidad de datos quieres introducir?");
		datos = new int [tamanio];
		
		//DATOS
		for(i=0; i<tamanio; i++)
			datos [i]= Teclado.numeroInt("Dato "+i+" :");
		
		//DATO A BUSCAR
		dato = Teclado.numeroInt("�Qu� dato quiere que busquemos y contemos?");
		
		/**CONTAMOS EL NUMERO DE VECES QUE APARECE dato EN datos*/
		for ( j = 0; j < datos.length; j++) 
			if (datos[j] == dato)
				cont++;
		
		/**MOSTRAMOS CUANTAS VECES SE REPITE EL dato*/
		System.out.printf("%nEl n�mero %d se repite %d veces%n", dato, cont);
		
		/**MOSTRAMOS LAS POSICIONES QUE dato OCUPA*/
		System.out.printf("Las posiciones que contien el valor %d son : ",dato);
		for (k = 0; k < datos.length; k++) {
			if (datos[k] == dato){
				cont2++;
				// SI NO ES EL ULTIMO SE PONE ,
				if(cont2 < cont && datos[k] == dato )
					System.out.printf("%d, ",k);
				//SI ES EL ULTIMO SE PONE .
				else if (cont2 == cont && datos[k] == dato)
					System.out.printf("%d.",k);
			}
		}

	}

}
