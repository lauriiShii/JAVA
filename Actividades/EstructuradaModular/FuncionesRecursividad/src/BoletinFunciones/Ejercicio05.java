package BoletinFunciones;

public class Ejercicio05 {
	
	/**Se dice que un n�mero entero es un n�mero perfecto si la suma de sus divisores propios
(incluyendo el 1 y sin incluirse �l mismo) da como resultado el mismo n�mero. As�, 6 es un
n�mero perfecto, porque sus divisores propios son 1, 2 y 3; y 6 = 1 + 2 + 3. Los siguientes
n�meros perfectos son 28, 496 y 8128.
a) Escribe una funci�n llamada perfecto que determine si el par�metro es perfecto o no.
b) Realiza otra funci�n que dado un n�mero perfecto, imprima los factores para
confirmar que el n�mero es perfecto. Si no lo es, que no haga nada.
c) Utiliza estas funciones en un programa que muestre todos los n�meros perfectos
entre 1 y 10.000 con sus correspondientes factores.*/
	
	public static void main(String[] args) {
		
		/**DECLARAMOS VARIABLES*/
		int num=10000,i;
		
		/** BUCLE ENTRE 1 Y 10000*/
		for (i = 1; i <= num; i++) {

			//Comprobamos si es perfecto e imprimimos
			if (perfecto(i))
				imprimePerfecto(i);
		}

	}
	
	public static boolean perfecto(int num) {

		boolean perfecto = false;
		int resultado = 0, i;

		/** COMPROBAMOS SI EL NUMERO ES PERFECTO O NO */
		// Bucle desde 1 hasta la mitad de n�mero
		for (i = 1; i <= num / 2; i++) {
			// Si numero es divisible entre contador de bucle. Sumar a resultado i
			if (num % i == 0)
				resultado += i;
		}

		// Si la suma de todos los divisores es igual al numero es perfecto
		if (resultado == num)
			perfecto = true;

		/**DEVOLVEMOS SI ES PERFECTO O NO*/
		return perfecto;

	}
	
	public static void imprimePerfecto(int num) {
		// VARIABLES
		int i;

		// MOATRAMOS NUMERO A DESCOMPONER
		System.out.printf("%d = ", num);

		/** MOSTRAMOS DESCOMPOSICION DEL NUMERO*/
		// Bucle desde 1 a la mitad del n�mero
		for (i = 1; i <= num / 2; i++) {

			// Si el n�mero es divisible entre contador de bucle
			if (num % i == 0) {

				// Si el contador es igual a la mitad del n�mero. Imprimir
				// contador de bucle
				if (i == num / 2)
					System.out.printf("%d %n", i);

				// Si es distinto a la mitad del n�mero. Imprimir contador del
				// bucle +
				else
					System.out.printf("%d + ", i);
			}
		}
	}
	
	

}
