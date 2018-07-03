import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.ListIterator;


public class Videoclub {

	public static void main(String[] args) {
		
		/**COLECCIONES**/
		LinkedHashSet<Pelicula> Coleccion1 = new LinkedHashSet<Pelicula>();
		TreeSet<Pelicula> Coleccion2 = new TreeSet<Pelicula>();
		TreeSet<Pelicula> Coleccion3 = new TreeSet<Pelicula>(new Comparator<Pelicula>() {
			public int compare(Pelicula o1, Pelicula o2) {

				return o1.getFechaEstreno().compareTo(o2.getFechaEstreno());
			}
		});
		TreeMap<Clave, Pelicula> Coleccion4 = new TreeMap<Clave, Pelicula>(new Comparador());
		
		
		/** PELICULAS DEL VIDEOCLUB **/
		Pelicula Peli1, Peli2, Peli3, Peli4, Peli5, Peli6, Clon1, Clon2;

		Peli1 = new Pelicula("Poltergeist, juegos diabólicos", Genero.TERROR, dameFecha("22/05/2015"),
				dameFecha("22/09/2015"));
		Peli2 = new Pelicula("La cumbre escarlata", Genero.TERROR, dameFecha("09/10/2015"), dameFecha("12/02/2016"));
		Peli3 = new Pelicula("Ocho apellidos catalanes", Genero.COMEDIA, dameFecha("20/11/2015"),
				dameFecha("18/03/2016"));
		Peli4 = new Pelicula("Padres por desigual", Genero.COMEDIA, dameFecha("01/01/2016"), dameFecha("11/05/2016"));
		Peli5 = new Pelicula("Star Wars: El despertar de la fuerza", Genero.FICCION, dameFecha("18/12/2015"),
				dameFecha("20/04/2016"));
		Peli6 = new Pelicula("Mad Max: Furia en la carretera", Genero.FICCION, dameFecha("15/05/2015"),
				dameFecha("01/09/2015"));
		Clon1 = (Pelicula) Peli1.clone();
		Clon2 = (Pelicula) Peli5.clone();

		/**
		 * LISTA SIN DUPLICADOS QUE CONSIGUE MANTENER EL ORDEN EN EL QUE LOS
		 * DATOS FUERON INSERTADOS
		 **/

		Coleccion1.add(Peli1);
		Coleccion1.add(Peli2);
		Coleccion1.add(Peli3);
		Coleccion1.add(Peli4);
		Coleccion1.add(Peli5);
		Coleccion1.add(Peli6);
		Coleccion1.add(Clon1);
		Coleccion1.add(Clon2);

		System.out.printf("%n%n%n ***-- Lista sin duplicado con orden de insercción --***.%n%n%n");

		for (Pelicula pelicula : Coleccion1)
			System.out.println(pelicula);

		/**
		 * ARBOL ORDENADO DESCENDENTEMENTE POR DIAS QUE HA TARDADO EN SALIR
		 * DESDE QUE SE ESTRENO
		 **/

		Coleccion2.add(Peli1);
		Coleccion2.add(Peli2);
		Coleccion2.add(Peli3);
		Coleccion2.add(Peli4);
		Coleccion2.add(Peli5);
		Coleccion2.add(Peli6);
		Coleccion2.add(Clon1);
		Coleccion2.add(Clon2);

		System.out.printf(
				"%n%n%n ***-- Arbol ordenado descendientemente por dias que ha taardado en salir desde que se estreno --***.%n%n%n");

		for (Pelicula pelicula : Coleccion2)
			System.out.printf("%s Días: %-5s%n", pelicula, pelicula.cantidadDias());

		/** ARBOL ORDENADO DESCENTENTEMENTE POR FECHA DE ESTRENO **/

		Coleccion3.add(Peli1);
		Coleccion3.add(Peli2);
		Coleccion3.add(Peli3);
		Coleccion3.add(Peli4);
		Coleccion3.add(Peli5);
		Coleccion3.add(Peli6);
		Coleccion3.add(Clon1);
		Coleccion3.add(Clon2);

		System.out.printf("%n%n%n ***--Arbol ordenado descententemente por fecha de estreno --***.%n%n%n");

		for (Pelicula pelicula : Coleccion3)
			System.out.println(pelicula);

		/** MAPA ORDENADO POR CLAVE **/
		
		Coleccion4.put(Peli1.getClave(),Peli1);
		Coleccion4.put(Peli2.getClave(),Peli2);
		Coleccion4.put(Peli3.getClave(),Peli3);
		Coleccion4.put(Peli4.getClave(),Peli4);
		Coleccion4.put(Peli5.getClave(),Peli5);
		Coleccion4.put(Peli6.getClave(),Peli6);
		Coleccion4.put(Clon1.getClave(),Clon1);
		Coleccion4.put(Clon2.getClave(),Clon2);
		
		System.out.printf("%n%n%n ***--Mapa ordenado por clave --***.%n%n%n");

		for (Pelicula pelicula : Coleccion4.values())
			System.out.println(pelicula);
		
		/**MAPA ANTERIOR AL REVES**/
		
		ArrayList<Pelicula> Coleccion5 = new ArrayList<Pelicula>(Coleccion4.values());
		ListIterator<Pelicula> it = Coleccion5.listIterator(Coleccion5.size());
		
		System.out.printf("%n%n%n ***--Mapa anterior mostrado alreves --***.%n%n%n");
		
		while(it.hasPrevious())
			System.out.println(it.previous());

	}

	/** DAME FECHA **/
	// Lo usaremos para dar formato a fechas
	public static Date dameFecha(String fecha) {
		SimpleDateFormat patron = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaA = null;

		try {
			fechaA = patron.parse(fecha);
		} catch (ParseException ex) {
		}

		return fechaA;
	}

}
