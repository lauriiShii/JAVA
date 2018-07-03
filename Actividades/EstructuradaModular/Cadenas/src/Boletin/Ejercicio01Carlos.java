package Boletin;
import java.util.Random;

import Teclado.Teclado;

public class Ejercicio01Carlos {

	/*
	 * a) que la cadena sea exactamente “True”.
	 * b) que la cadena contenga tres letras, mayúsculas o minúsculas.
	 * c) que la cadena contenga 5 o más caracteres que no sean la ñ, la z ni la x.
	 * d) que la cadena no empiece con un número.
	 * e) que la cadena tenga un número arbitrario de caracteres excepto la b.
	 * f) que la cadena tenga un número más pequeño que 300.
	 * g) que la cadena sea un número de teléfono.
	 * h) que la cadena sea un DNI.
	 * i) que la cadena sea un nombre, es decir, que no tenga espacios, que no sea una cadena vacía y que empiece por mayúsculas.
	 * j) que la cadena empiece con vocal y luego tenga varias consonantes o ninguna.
	 * k) que la cadena sea un correo electrónico acabado en .com o en .es.
	 */
	
	public static void main(String[] args) {
		@SuppressWarnings("unused") // Para que no salte el warning de que la variable cadena no se usa nunca
		String cadena;
		Random random=new Random();
		int longitud;

		 // a) que la cadena sea exactamente “True”.
		cadena=Teclado.cadena("Introduzca la palabra True: ", "True");

		 // b) que la cadena contenga tres letras, mayúsculas o minúsculas.
		cadena=Teclado.cadena("Introduzca 3 letras: ", "[A-ZÑa-zñ]{3}");
		cadena=Teclado.cadena("Introduzca 3 letras: ", "[\\wÑñ]{3}");

		 // c) que la cadena contenga 5 o más caracteres que no sean la ñ, la z ni la x.
		cadena=Teclado.cadena("Introduzca 5 caracteres o mas que no sean ni la \"ñ\", ni la \"z\" ni la \"x\": ", "[^ñzx]{5,}");

		 // d) que la cadena no empiece con un número.
		cadena=Teclado.cadena("Introduzca una cadena que no empiece por un numero: ", "[^0-9].*");
		cadena=Teclado.cadena("Introduzca una cadena que no empiece por un numero: ", "[\\D].*");

		 // e) que la cadena tenga un número arbitrario de caracteres excepto la b.
		longitud=random.nextInt(25);
		cadena=Teclado.cadena("Introduzca una cadena de "+longitud+" caracteres de longitud que no contenga la \"b\": ", "[^b]{"+longitud+"}");
		
		 // f) que la cadena tenga un número más pequeño que 300.
		cadena=Teclado.cadena("Introduzca un numero mas pequeño que 300: ", "[1-2]?[0-9]?[0-9]");
		cadena=Teclado.cadena("Introduzca un numero mas pequeño que 300: ", "[12]?[0-9]{1,2}");
		
		// g) que la cadena sea un número de teléfono.
		cadena=Teclado.cadena("Introduzca un numero de telefono: ", "[9876][0-9]{8}");
		
		// h) que la cadena sea un DNI.
		cadena=Teclado.cadena("Introduzca un NIF o DNI: ", "[0-9]{8}[A-Z&&[^IOU]]");
		
		// i) que la cadena sea un nombre, es decir, que no tenga espacios, que no sea una cadena vacía y que empiece por mayúsculas.
		cadena=Teclado.cadena("Introduzca su nombre (solo el primero): ", "[A-ZÑ][a-zñ]+");
		
		// j) que la cadena empiece con vocal y luego tenga varias consonantes o ninguna.
		cadena=Teclado.cadena("Introduzca una cadena que empiece por vocal y siga con alguna o ninguna consonante: ", "[AaEeIiOoUu][A-ZÑa-zñ&&[^AaEeIiOoUu]]*");
		
		// k) que la cadena sea un correo electrónico acabado en .com o en .es.
		cadena=Teclado.cadena("Introduzca su correo electronico: ", ".*@[a-zA-Z]*(.com||.es)");
		cadena=Teclado.cadena("Introduzca su correo electronico: ", "[a-z][0-9a-z-_\\.]+@[a-z]+\\.(es||com)");
	}
}