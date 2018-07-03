package Boletin;

public class Ejercicio07 {
	/**
	 * Realiza dos m�todos: el primero recibe como par�metro un array (por
	 * referencia) y el segundo un elemento del array (por valor). Los
	 * par�metros por referencia se ven afectados por el c�digo mientras que los
	 * recibidos por valor no, porque reciben una copia, no una referencia.
	 * Demuestra que con el primer m�todo el array queda modificado en el
	 * programa y que con el segundo m�todo, el elemento del array no queda
	 * modificado ya que recibe una copia del elemento.
	 */
	public static void main(String[] args) {

		// DECLRAMOS VARIABLES
		int array[] = { 1, 2 };

		// LLAMAMOS A LOS M�TODOS
		porreferencia(array);
		System.out.println("Valor del array despues de modificarlo en el main: " + array[1]);

		porvalor(array[0]);
		System.out.println("Valor del array despues de modificarlo en el main: " + array[0]);
	}

	/** FUNCIONES **/
	// Metodo por referencia, se modifica el array si lo modificamos en el
	// metodo
	public static void porreferencia(int array[]) {
		System.out.println("Valor del array antes de modificarlo: " + array[1]);
		array[1] = 30;
		System.out.println("Valor del array despues de modificarlo: " + array[1]);
	}

	// Metodo por valor, recibe no una referencia si no un valor, y no se
	// modifica en el main
	public static void porvalor(int arry) {
		System.out.println("Valor del array antes de modificarlo: " + arry);
		arry = 4;
		System.out.println("Valor del array despues de modificarlo: " + arry);

	}
}
