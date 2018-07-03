
public class Bebe {
	Bebe(int i) {
		this("Soy un bebe consentido");
		System.out.println("Hola, tengo " + i + " meses");
	}

	Bebe(String s) {
		System.out.println(s);
	}

	void berrea() {
		System.out.println("Buaaaaaaaaa");
	}

	public static void main(String[] args) {
		new Bebe(8).berrea();
	}
}