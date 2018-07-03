package Boletin;
import Teclado.Teclado;

public class Ejercicio06 {
	/**
	 * Contar el número de caracteres que hay entre la primera y última aparición de
	 * un carácter concreto en una cadena.
	 **/
	public static void main(String[] args) {

		// DECLARAMOS VARIABLES
		String cad="";
		int resultado=0, i, j, k, indexIzq = 0, indexDer = 0, cont;
		char caracter;

		// PEDIMOS CADENA Y CARACTER AL USUARIO
		cad = Teclado.cadena("Introduce una cadena: ");
		caracter = Teclado.caracter("Introduzca el carácter a buscar: ");
		
		
		//BUSCAMOS CARACTER POR LA DERECHA
		cont = 0;
		for (j = 0; j < cad.length() - 1 && cont < 1; j++){
			if (cont < 1 && cad.charAt(j)==caracter){
				cont++;
				indexDer = j-1;
			}
		}
		
		//BUSCAMOS CARACTER POR LA IZQUIERDA
		cont = 0;
		for (k = cad.length(); k >= 0 && cont < 1; k--){
			if (cont < 1 && cad.charAt(j)==caracter){
				cont++;
				indexDer = k-1;
			}
		}
			
		//EXTRAEMOS CADENA CENTRAL
		cad = cad.substring(indexIzq,indexDer);
		
		//MOSTRAMOS
		System.out.print("%nEl número de caracteres entre el primer y el último caracter \""+caracter+"\" es: "+cad.length()+" caracteres.");

	}

}
