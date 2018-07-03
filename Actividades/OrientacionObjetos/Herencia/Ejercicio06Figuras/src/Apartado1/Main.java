package Apartado1;

public class Main {

	public static void main(String[] args) {
		
		int i;
		final int SIZE=4;
		Forma[] misFormas;
		
		
		misFormas = new Forma[SIZE];
		
		misFormas[0] = new Triangulo();
		misFormas[1] = new Rombo();
		misFormas[2] = new Circulo();
		misFormas[3] = new Cuadrado();
		
		
		for(i=0; i<misFormas.length; i++)
			System.out.println(misFormas[i].identidad());
			
		
		
	}
}
