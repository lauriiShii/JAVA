package HerenciaClonEquals;

public class Padre implements Cloneable {
	
	String nombre;
	int numHijos;
	Padre(String nombre,int numHijos){
		this.nombre=nombre;
		this.numHijos=numHijos;
	}
	public boolean equals(Object obj) {
		boolean resultado=false;
		if(obj instanceof Padre && nombre.equals(((Padre)obj).nombre) 
				&& numHijos==((Padre)obj).numHijos)
				resultado=true;
		return resultado;		
	}	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", numHijos=" + numHijos + "]";
	}
	protected Object clone(){
		Padre clonado;
		try {
			clonado=(Padre) super.clone();//El clone al que se llama es el de Object
		} catch (CloneNotSupportedException e) {
			clonado=null;
		}
		return clonado;		
	}	
}
