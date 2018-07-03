import java.util.ArrayList;

public class Main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		long acu = 0;
		ArrayList<Caja<String>> lista = new ArrayList<Caja<String>>();
		ArrayList<Caja<Long>> lista2 = new ArrayList<Caja<Long>>();

		for (x = 0; x < 10; x++)
			lista.add(new Caja<String>(String.format("Esta caja es la numero %d", x)));

		for (x = 0; x < 10; x++)
			lista2.add(new Caja<Long>(new Long((long) 383 * x)));

		/*
		 * Iterator<Caja> it = lista.iterator(); while(it.hasNext()){
		 * s=it.next(); System.out.println(s.contenido); }
		 */
		for (x = 0; x < 10; x++)
			System.out.println(lista.get(x).contenido);

		for (x = 0; x < 10; x++) {
			System.out.println(lista2.get(x).contenido);
			acu += lista2.get(x).contenido;
		}

		System.out.println(acu);
	}

}
