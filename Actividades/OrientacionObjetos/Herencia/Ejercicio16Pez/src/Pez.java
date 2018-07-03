
public class Pez implements Cloneable{

	/**ATRIBUTOS**/
	public String nombre;
	
	/**CONSTRUCTOR**/
	Pez (String nombre) {
		this.nombre = nombre;
	}
	
	/**CLON**/
	public Object clone(){
		Pez clonado;
		try {
			clonado=(Pez) super.clone();
		} catch (CloneNotSupportedException e) {
			clonado=null;
		}
		return clonado;
	}
	
	/**EQUALS**/
	public boolean equals(Object obj) {
		boolean resultado=false;
		if(obj instanceof Pez && nombre.equals(((Pez)obj).nombre))
				resultado=true;
		return resultado;		
	}
	
	/**SET**/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**ToString**/
	public String toString() {
		return nombre;
	}
	

	
}
