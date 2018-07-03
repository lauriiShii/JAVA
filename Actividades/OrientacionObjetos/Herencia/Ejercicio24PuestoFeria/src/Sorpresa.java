
public class Sorpresa implements Cloneable{

	protected String nombre;

	public Sorpresa(String nombre) throws NombreIncorrectoException {
		
		setNombre(nombre);
	}

	public void setNombre(String nombre) throws NombreIncorrectoException {
		
		if (nombre.matches("[a-zA-ZÒ—]+"))
			this.nombre = nombre;				
		else
			throw new NombreIncorrectoException("El nombre solo puede contener letras");
		
	}
	
	public boolean equals(Object obj) {
		boolean resultado=false;
		
		if(obj instanceof Sorpresa && nombre.equals(((Sorpresa)obj).nombre))
				resultado=true;
		return resultado;		
	}	

	public Object clone(){
		Sorpresa clonado;
		try {
			clonado=(Sorpresa) super.clone();//Llama al clone de Object
		} catch (CloneNotSupportedException e) {
			clonado=null;
		}
		return clonado;		
	}

	public String toString() {
		return String.format("Nombre: %s%n" , nombre);
	}
}
