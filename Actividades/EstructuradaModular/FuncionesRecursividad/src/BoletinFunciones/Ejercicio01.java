package BoletinFunciones;
import Teclado.Teclado;

public class Ejercicio01 {
	/**
	 * Escribe una funci�n que tome 3 par�metros: dos de tipo entero y uno de
	 * tipo car�cter. La funci�n deber� sumar, restar, multiplicar o dividir los
	 * valores de los dos primeros par�metros dependiendo de la operaci�n
	 * indicada en el tercer par�metro, y devolver el resultado.
	 */
	public static void main(String[] args) {

		/** VARIABLES Y OBJETOS */
		int num1, num2, result;
		char opcion;

		/** PEDIMOS DATOS */
		num1 = Teclado.numeroInt("Introduce un n�mero entero: ");
		num2 = Teclado.numeroInt("Introduce un n�mero entero: ");
		do {
			opcion = Teclado.caracter("Introduce una opcion");
		} while (opcion!='+' && opcion!='-' && opcion!='/' && opcion!='*');
		
		/**MOSTRAMOS RESULTADO**/
		result = calculadora(num1, num2, opcion);
		System.out.print("El resultado de " + num1 + " " + opcion + " "
				+ num2 + " = " + result);
		
	}

	public static int calculadora (int num1, int num2, char opcion) {

		int resultado=0;
		
		switch (opcion) {

		case '+':// SUMA
			resultado = num1 + num2;
			break;
		case '-':// RESTA
			resultado = num1 - num2;
			break;
		case '*':// MULTIPLICACION
			resultado = num1 * num2;
			break;
		case '/':// DIVISION
			resultado = num1 / num2;
			break;
		}
		
		return resultado;

	}
}
