
public class Main {

	public static void main(String[] args) {
		
		/**RECTANGULO**/
		Rectangulo r1 = new Rectangulo (4.3f,5.7f,3f,10f);
		System.out.printf("El area de nuestro rectangulo es: %.2f.%n", r1.calcularArea());
		
		/**CIRCULO**/
		Circulo c1 = new Circulo (5f,5f,8f);
		System.out.printf("El area de nuestro circulo es: %.2f.%n", c1.calcularArea());
		
		/**TRIANGULO**/
		Triangulo t1 = new Triangulo (6f,7.1f,5.9f,8f);
		System.out.printf("El area de nuestro triangulo es: %.2f.%n", t1.calcularArea());

	}

}
