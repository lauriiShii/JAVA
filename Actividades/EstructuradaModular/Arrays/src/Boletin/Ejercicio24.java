package Boletin;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio24 {
	/**Utilizando recursividad, realizar un programa que busque un número decimal en un array
	ordenado de números decimales. La búsqueda se hará de la siguiente manera: se buscará en
	la mitad del array, si se encuentra, se le da la información al usuario de que se ha encontrado
	y en qué posición del array. Si no se encuentra y el número a buscar es mayor que el
	elemento que se encuentra en la mitad del array, se buscará en la mitad superior del array, y
	si por el contrario es menor, se buscará en la mitad inferior del array. Y así se continuará
	sucesivamente hasta que se termine, en cuyo caso, se pueden dar dos posibilidades: que se
	encuentre o que no se encuentre. En cualquier caso, se informará al usuario del resultado, y
	si se ha encontrado, se le informará de la posición del array donde se encuentre teniendo en
	cuenta que para el usuario, las posiciones del array empiezan por 1.
	El tamaño del array, el contenido y el número a buscar se solicitarán al usuario.*/

	public static void main(String[] args) {
		float datos[];
		float numero = 0;
		int ndatos = 0,i;
		boolean error=false;
		Scanner teclado=new Scanner(System.in);
		
		//Preguntamos al usuario cuantos datos va a introducir y repetimos si es incorrecto
		do {
			try {
				error=false;
				System.out.println("¿Cuantos datos quieres introducir?");
				ndatos = teclado.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error al introducir datos");
				error = true;
				teclado.next();
			}
		} while (error);
		
		//Creamos un array dependiendo del dato introducido por usuario
		datos=new float[ndatos];
		
		//Pedimos al usuario que introduzca los datos y lo guardamos en el array
		for(i=0;i<datos.length;i++){
			do {
				try {
					error=false;
					System.out.println("Introduzca dato " + i + ":");
					datos[i] = teclado.nextFloat();
				} catch (InputMismatchException e) {
					System.out.println("Error al introducir datos");
					error = true;
					teclado.next();
				}
			} while (error);
		}
		
		//Pedimos al usuario que introduzca un numero para buscar.
		do {
			try {
				error=false;
				System.out.println("¿Que numero quieres buscar?");
				numero = teclado.nextFloat();
			} catch (InputMismatchException e) {
				System.out.println("Error al introducir datos");
				error = true;
				teclado.next();
			}
		} while (error);
		
		Arrays.sort(datos);
		//Mostramos el array
		for(i=0;i<datos.length;i++){
			System.out.print("| "+datos[i]+" |");
		}
		System.out.println();;
		
		//Vamos a la funcion que buscara el numero introducido ene el array.
		busqueda(numero,datos,datos.length-1,0);
		teclado.close();

	}
	
	public static void busqueda(float numero,float datos[],int mayor,int menor){
		//Creamos una variable y la igualamos al termino medio del mayor y menor.
		int num=(mayor+menor)/2;
		
		//Si encontramos el numero o el array no puede acotarse mostramos los resultados.
		if(datos[num]==numero || mayor==menor || datos.length==0 || menor==0){
			//Si el dato del array en la posicion es igual al numero introducido por el usuario.
			//Mostramos los datos
			if(datos[num]==numero){
				System.out.println("El numero "+numero+" aparece en la posicion "+(num+1)+" del array");
			}else{
			//Si hemos recorrido todo el array y no encontramos el numero significa que no aparece
				System.out.println("El numero "+numero+" no aparece");
			}
		}else{
		//Comprobamos que el numero sea mayor o menor al dato del array
			if(datos[num]<numero){
				//Si el numero es mayor acotamos por abajo
				busqueda(numero,datos,mayor,num+1);
			}else{
				//Si el numero es menor acotamos por arriba
				busqueda(numero,datos,num-1,menor);
			}
		}
	}

}