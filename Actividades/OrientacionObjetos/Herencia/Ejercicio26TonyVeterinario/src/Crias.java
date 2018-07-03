
public class Crias implements Cloneable{

	String nombre;
	String fnac;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFnac() {
		return fnac;
	}

	public void setFnac(String fnac) {
		this.fnac = fnac;
	}

	Crias(String nombre, String fnac){
		this.nombre=nombre;
		this.fnac=fnac;
	}

	@Override
	public String toString() {
		return String.format("Nombre: %s%n\tFNac: %s", nombre, fnac);
	}
	
	public boolean equals(Object obj) {
		boolean resultado=false;
		if(obj instanceof Crias && nombre.equals(((Crias)obj).nombre) && fnac.equals(((Crias)obj).fnac))
				resultado=true;
		return resultado;		
	}	
	
	public Object clone(){
		Crias clonado;
		try {
			clonado=(Crias) super.clone();//El clone al que se llama es el de Object
		} catch (CloneNotSupportedException e) {
			clonado=null;
		}
		return clonado;		
	}	
}
