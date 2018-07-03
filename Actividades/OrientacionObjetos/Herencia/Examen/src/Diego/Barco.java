package barco_J16;

public class  Barco implements Cloneable,AccionGeneral {
	protected String nombre;
	protected int eslora;
	
	Barco(String nombre, int eslora){
		this.nombre=nombre;
		this.eslora=eslora;
	}
	
	public boolean equals(Object obj){
		boolean resultado=false;
		
		if(obj instanceof Barco && nombre.equals(((Barco)obj).nombre) && eslora==((Barco)obj).eslora)
			resultado=true;
		return resultado;				
	}
	
	public Object clone(){
		Barco clonado;
		try {
			clonado=(Barco) super.clone();
		} catch (CloneNotSupportedException e) {
			clonado=null;
		}
		return clonado;		
	}
	
	public String toString(){
		
		return  String.format("%n Nombre: %s %n Eslora: %d",nombre,eslora);
	}

	public int numCasillas() {//Metodo de la interfaz
		
		return eslora;
	}
	
}
