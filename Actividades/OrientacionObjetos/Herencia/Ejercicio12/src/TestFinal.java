
public class TestFinal {

	public static void main(String[] args) {
		//final String s1 = new String("Hola"); --> No puede ser una variable final si va a ser modificada
		String s1 = new String("Hola");
		String s2 = new String(" Mundo");
		s1 = s1 + s2;
		
		System.out.println(s1);
	}
}