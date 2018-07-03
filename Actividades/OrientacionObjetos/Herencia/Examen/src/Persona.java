
public abstract class Persona implements Cloneable {
	
	//La clase es abstracta por que no tiene sentido crear una persona que no sea ni alumno ni profesor
	//ya que en el enunciado se espeficifa que son estos dos ultimos tipos los que se van a clasificar.

	/** ATRIBUTOS **/
	protected String nombre;
	boolean validado;

	/** CONSTRUCTOR **/
	Persona(String nombre) throws NombreIncorrectoException {
		setNombre(nombre);
	}
	
	/** EQUALS **/
	public boolean equals(Object o) {
		boolean igual = false;
		if (o instanceof Persona && ((Persona) o).nombre.equals(nombre) && validado==((Persona) o).validado)
			igual = true;
		return igual;
	}

	/** CLON **/
	public Object clone() {
		Persona clonado;
		try {
			clonado = (Persona) super.clone();
		} catch (CloneNotSupportedException e) {
			clonado = null;
		}
		return clonado;
	}

	/**toString**/
	public String toString() {
		return String.format("Nombre: %s",nombre);
	}
    
	/**GET Y SET**/
	public String getNombre() {
		return nombre;
	}
	
	public void setValidado(boolean validado) {
		this.validado = validado;
	}

	public void setNombre(String nombre) throws NombreIncorrectoException {
		
		if (nombre.matches("[A-Za-zñÑ ]*"))
			this.nombre = nombre;				
		else
			throw new NombreIncorrectoException("Las iniciales deben ser mayusculas, debe indicar nombre y apellidos, y solo se permite usar letras.");
		
	}
}
