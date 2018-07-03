
public class Alumno extends Persona implements Notas {

	/** ATRIBUTO **/
	private final int TAMANIO = 3;
	private double notas[] = new double[TAMANIO];
	private int numNotas;
	private static int numAlumno = 0;
	int numeroAlumno;

	/** CONSTRUCTOR **/
	Alumno(String nombre) throws NombreIncorrectoException {
		super(nombre);
		numAlumno += 1;
		numeroAlumno = numAlumno;
	}

	/** EQUALS **/
	public boolean equals(Object o) {
		boolean igual = false;
		if (o instanceof Alumno && super.equals(o) && ((Alumno) o).notas.equals(notas)
				&& numeroAlumno == ((Alumno) o).numeroAlumno && numNotas == ((Alumno) o).numNotas)
			igual = true;
		return igual;
	}

	// El Clon lo hereda del padre.

	/** toString **/
	public String toString() {
		int i;
		String cadena = "";
		for (i = 0; i < notas.length; i++)
			cadena += notas[i] + " ";

		return String.format("%s%nNotas: %s%n%n", super.toString(), (numNotas > 0) ? cadena : "No hay datos");
	}

	/** METODOS **/
	// Implementados de la interdaz sueldo
	public String tipo_numero() {
		return "Alumno numero " + numeroAlumno + "\n";
	}

	public void ponerNota(double num) {
		if (numNotas < notas.length) {
			notas[numNotas] = num;
			numNotas++;
		}
	}

}
