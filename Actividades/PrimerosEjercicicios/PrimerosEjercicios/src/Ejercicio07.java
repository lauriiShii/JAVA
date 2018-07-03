import java.math.*;

public class Ejercicio07 {
	
	/**
	 * Suponiendo realizadas las siguientes sentencias de asignaci�n: lado1 = 3;
	 * precio = 325.6; lado2 = 4; comprar = false; hipotenusa = 5; ch = �7�.
	 * Determinar cu�les de las expresiones siguientes dan un resultado booleano
	 * y cu�les no. Para aquellas que produzcan un resultado booleano determinar
	 * si el resultado es verdadero o falso. Para las que no lo sean, explicar
	 * la raz�n. Indicar tambi�n si existe alguna expresi�n err�nea.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lado1 =3, lado2 =4, hipotenusa =5;
		double precio = 325.6; 
		boolean comprar = false;
		char ch = '7';
		
		System.out.println("a) 5 * precio � 1.50"
				+ "\nEl resultado no es booleano"
				+ "\nLa expresion no es correcta, deberia ser 5 * (int)precio � 1.50"
				+ "\nEl resultado es "+(5 * (int)precio-1.50));
		
		System.out.println("b) (precio < 300 + 0.1 * precio) || comprar\n"
				+ "El resultado sera booleano\n"
				+ "La expresion es precio < (((300 + 0.1) * precio)) || comprar "
				+ "\nEl resultado es "+(precio < (((300 + 0.1) * precio)) || comprar));

		System.out.println("c) sqrt(lado1) + sqrt(lado2) = sqrt(hipotenusa)\n"
				+ "La expresion correcta es (sqrt(lado1) + sqrt(lado2)) == sqrt(hipotenusa)\n"
				+ "El resultado booleano es "+(Math.sqrt(hipotenusa) == (Math.sqrt(lado1)+ Math.sqrt(lado2))));
		
		System.out.println("d) (! comprar) && (precio + 125.3)\n"
				+ "La expresion no es correcta, ya que no se puede hacer una operacion boolean entre un boolear y un double.\n"
				+ "El resultado de la expresion es ");
		
		System.out.println("e) (ch <= �A�) && comprar\n"
				+ "La expresion es correcta\n"
				+ "El resultado es "+((ch <= 'A') && comprar));
		
		System.out.println("f) ch = �7� || ! comprar\n"
				+ "La expresion no es correcta, deberia ser (ch == '7') || ! comprar) \n"
				+ "El resultado es "+((ch == '7') || ! comprar));
		
	}

}
