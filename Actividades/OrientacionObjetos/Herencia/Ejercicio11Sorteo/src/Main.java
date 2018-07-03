
public class Main {

	public static void main(String[] args) {
		
		/**DADO**/
		Dado d = new Dado ();
		System.out.println(d.lanzar());
		
		/**MONEDA**/
		Moneda m = new Moneda ();
		System.out.println(m.lanzar(m.lanzar()));

	}

}
