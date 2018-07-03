
public class Profesor extends Persona implements Sueldo {

	/** ATRIBUTOS **/
	private float sueldo;
	private static int numProfesor = 0;
	private int numeroProfesor;

	/** CONSTRUCTOR **/
	Profesor(String nombre, float sueldo) throws NombreIncorrectoException {
		super(nombre);
		this.sueldo = sueldo;
		numProfesor += 1;
		numeroProfesor = numProfesor;
	}

	/** EQUALS **/
	public boolean equals(Object o) {
		boolean igual = false;
		if (o instanceof Profesor && super.equals(o) && sueldo == ((Profesor) o).sueldo
				&& numeroProfesor == ((Profesor) o).numeroProfesor)
			igual = true;
		return igual;
	}

	// El clon lo hereda del padre

	/** toString **/
	public String toString() {
		return String.format("%s%nSueldo: %.2f%n%n", super.toString(), sueldo);
	}

	/** METODOS **/
	// Implementados de la interdaz sueldo
	public String tipo_numero() {
		return "Profesor numero " + numeroProfesor + "\n";
	}

	public void aumentarSueldo(int num) {
		sueldo += sueldo * num / 100;
	}

	/** GET **/
	public float getSueldo() {
		return sueldo;
	}

}
