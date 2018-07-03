
public class Test {
	
	public int dato = 0;
	public static int datostatico = 0;

	public void metodo() {
		this.dato++;
	}

	public static void metodostatico() {
		//this.datostatico++; --> si el metodo es estatico no se puede usar el this.
		datostatico++;
	}

	public static void main(String[] args) {
		datostatico++;
		metodostatico();
		//dato++;
		//metodo();
	}
}