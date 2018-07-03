package BoletinRecursividad;
import Teclado.Limite;
import Teclado.Teclado;

public class Ejercicio07 {
	/**Escribe un programa que calcule el factorial de un n�mero entero positivo que se introduce por
teclado.*/
	public static void main(String[] args) {

		/**DECLARACION VARIABLES Y OBJETOS*/
		int num;
		
		/**PEDIMOS DATOS*/
		num=Teclado.numeroInt("Introduce un n�mero entero positivo", 0,Limite.MAYOR_IGUAL);
		
		/**MOSTRAMOS FACTORIAL*/
		System.out.printf("El factorial de %d es %d",num,calculaFactorial(num));

	}
	public static int calculaFactorial(int num){
		
		/**CALCULAMOS FACTORIAL*/
		return num*(calculaFactorial(num-1));
	}
	

}
