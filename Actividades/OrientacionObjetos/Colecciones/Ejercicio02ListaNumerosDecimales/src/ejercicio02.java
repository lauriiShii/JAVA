import java.util.ArrayList;
import java.util.Iterator;

public class ejercicio02 {
	public static void main(String[] args) {
		boolean seguir = true, opcion3 = false;
		int opcion;
		Iterator<Float> it;
		ArrayList<Float> decimales = new ArrayList<Float>();

		decimales.add((float) 1.17);
		decimales.add((float) 2.17);
		decimales.add((float) 3.17);
		it = decimales.iterator();

		while (seguir) {
			System.out.println("\tMenu:");
			System.out.println("\t1.Mostrar Lista");
			System.out.println("\t2.Mostrar Siguiente");
			System.out.println("\t3.Eliminar Ultimo Mostrado");
			System.out.println("\t4.Salir");

			opcion = Teclado.nextInt("Introduzca una opcion");

			switch (opcion) {
			case 1:
				if (!decimales.isEmpty())
					for (Float f : decimales)
						System.out.println(f);

				else
					System.out.println("La lista esta vacia");
				break;
			case 2:
				if (!decimales.isEmpty()){
					if (!it.hasNext()) 	
						it = decimales.iterator();
					System.out.println(it.next());
					opcion3 = true;
				}else
					System.out.println("La lista esta vacia");
				break;
			case 3:
				if (!decimales.isEmpty()) {
					if (opcion3) {
						it.remove();
						opcion3 = false;
					} else
						System.out.println("Primero tienes que mostrar alguno");
				} else
					System.out.println("La lista esta vacia");
				break;
			case 4:
				seguir = false;
				break;
			}
			System.out.println();
		}
	}
}