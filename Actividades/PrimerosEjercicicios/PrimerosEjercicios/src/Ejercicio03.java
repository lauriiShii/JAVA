
public class Ejercicio03 {

	/**
	 * Dados los siguientes valores para las variables booleanas a, b y c ( a = true,
	 * b = false y c = true), evaluar las expresiones que aparecen a continuación
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean a=true, b= false, c=true, A,B,C,D;
		
		// falso o verdadero = verdadero
		A = (a && b ) || (a && c);
		System.out.println("a) (a && b ) || (a && c) = "+A);
		
		// verdadero y verdadero = verdadero
		B = (a || ! b) && (! a || c);
		System.out.println("b) (a || ! b) && (! a || c) = "+B);
		
		// verdadeero o falso = verdadero
		// verdadero y verdadero = verdadero
		C= a || b && c;
		System.out.println("c) a || b && c = "+C);
		
		// falso y verdadero = falso
		D= ! (a || b) && c;
		System.out.println("d) ! (a || b) && c = "+D);
	}

}
