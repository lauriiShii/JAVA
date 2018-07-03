package BoletinFunciones;

import Teclado.Teclado;


public class Ejercicio02 {
	/**Sobrecarga la funci�n del ejercicio anterior para que se pueda operar con enteros y con
decimales. Haz un programa que utilice las dos funciones, con enteros y con decimales.*/
	public static void main(String[] args) {

		/** VARIABLES Y OBJETOS */
		int num1, num2, result;
		double numD1,numD2,resultD;;
		char opcion;
		String operacion;

		/** PEDIMOS DATOS */
		operacion = Teclado.cadena("�Su operaci�n sera decimal o con simples n�meros enteros?\n(Su respuesta solo puede ser Decimal o Entera)");
		
		do {
			opcion = Teclado.caracter("Introduce una opcion");
		} while (opcion!='+' && opcion!='-' && opcion!='/' && opcion!='*');
		
		switch (operacion) {
		case "Entera":
			num1 = Teclado.numeroInt("Introduce un n�mero entero: ");
			num2 = Teclado.numeroInt("Introduce un n�mero entero: ");
			
			/**MOSTRAMOS RESULTADO**/
			result = calculadora(num1, num2, opcion);
			System.out.print("El resultado de " + num1 + " " + opcion + " "
					+ num2 + " = " + result);
			
			break;
		case "Decimal":
			numD1  = Teclado.numeroDouble("Introduce un n�mero decimal: ");
			numD2 = Teclado.numeroDouble("Introduce un n�mero decimal: ");
			
			/**MOSTRAMOS RESULTADO**/
			resultD = calculadora(numD1, numD2, opcion);
			System.out.print("El resultado de " + numD1 + " " + opcion + " "
					+ numD2 + " = " + resultD);
			
			break;
		}
		
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


	public static double calculadora (double numD1, double numD2, char opcion) {
	
		double resultado=0;
		
		switch (opcion) {
	
		case '+':// SUMA
			resultado = numD1 + numD2;
			break;
		case '-':// RESTA
			resultado = numD1 - numD2;
			break;
		case '*':// MULTIPLICACION
			resultado = numD1 * numD2;
			break;
		case '/':// DIVISION
			resultado = numD1 / numD2;
			break;
		}
		
		return resultado;
	
	}
}