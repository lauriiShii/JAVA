package BoletinEstructurada;
public class Ejercicio25 {

	/**
	 * Realiza un programa que dado un n�mero entero positivo de n cifras,
	 * calcule el n�mero con sus cifras en orden inverso. El resultado debe
	 * quedar en una variable. No utilizar String ni calcular previamente el
	 * n�mero de cifras. Ej: 54.321 debe devolver 12.345
	 */
	public static void main(String[] args) {

		/** VARIABLES */
		int num = 34539, resultado;

		/** ORDEN INVERSO */
		// Contamos el numero de cifras que tiene num
		while (num != 0) {// mientras a n le queden cifras
			resultado = num % 10;
			num /= 10;// le quitamos el �ltimo d�gito
			System.out.print(resultado);
		}
	}
}