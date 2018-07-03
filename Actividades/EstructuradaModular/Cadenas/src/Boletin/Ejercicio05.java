package Boletin;
import Teclado.Teclado;

public class Ejercicio05 {
	/**Contar el número de apariciones de una cadena en otra cadena.*/
	public static void main(String[] args) {
		
		/**VARIABLES Y OBJETOS*/
		String cadena1, cadena2,resultado, caracter;
		int cont=0, i, j;
		
		/**PEDIMOS DATOS*/
		cadena1=Teclado.cadena("Introduce una cadena: ");
		cadena2=Teclado.cadena("Qué contamos?: ");
		
		/**CONTAMOS LAS RAPETICIONES DE cadena2*/
		//PASAMOS A MINUSCULA
		cadena1 = cadena1.toLowerCase();
		cadena2 =cadena2.toLowerCase();
		
		//RECORREMOS LA CADENA EN BUSCA DEL TEXTO DE LA cadena2
		for(i=0; i < cadena1.length(); i++) {
			
			//SI ENCONTRAMOS LA PRIMERA LETRA DE cadena2 EN LA cadena1
			if (cadena2.charAt(0)==cadena1.charAt(i)) {

				//EXTRAEMOS LOS CARACTERES ENTRE i e i MAS EL TAMAÑO DE cadena2	
				resultado = "";//Cuando se monte la cadena a comparar debe estar vacia
				
				for(j=0; j < cadena2.length(); j++){
					caracter = String.valueOf(cadena1.charAt(i+j));
					resultado += caracter;
				}
				
				//COMPARAMOS
				if(resultado.equals(cadena2)){
					// EL CONTADOR DE APARICIONES SE INCREMENTA
					cont++;
				}
			}
		}

		//MOSTRAMOS RESULTADO
		System.out.print("La cadena \""+cadena2+"\" se repide dentro de \""+cadena1+"\" "+cont+"  veces");

	}

}
