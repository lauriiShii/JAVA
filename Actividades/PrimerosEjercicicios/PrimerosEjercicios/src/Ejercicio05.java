public class Ejercicio05 {
	/**
	 * Dados los siguientes valores de las variables x, y, j y k, a�adir los
	 * par�ntesis que sean necesarios para que las expresiones que las siguen
	 * eval�en a verdadero: x = 10; y = 19; j = true; k = false
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean a,b,c,d,j=true,k=false;
		int x=10, y=19;
		
		a = (x ==y) || j;
		System.out.println("a) x ==y || j = "+a+"\nLa expresion queda: (x ==y) || j\n");
		
		b = (x >= y || x <= y) && j;
		System.out.println("b) x >= y || x <= y && j = "+b+"\nLa expresion queda: (x >= y || x <= y) && j\n");
		
		c = !j || j;
		System.out.println("c) ! j || j = "+c+"\nLa expresion queda: !j || j\n");
		
		d = !(k && k);
		System.out.println("d) ! k && k = "+d+"\nLa expresion queda: !(k && k)\n");
		
	}
}
