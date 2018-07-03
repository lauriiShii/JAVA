
public class Monitor implements Cloneable {

	/**ATRIBUTOS**/
	private String resolucion;
	private String marca;
	
	/**CONSTRUCTORES**/
	Monitor (){
		resolucion = "Desconocido";
		marca = "Desconocido";
	}
	
	Monitor (String resolucion, String marca){
		this.resolucion = resolucion;
		this.marca = marca;
	}
	
	/**EQUALS**/
	public boolean equals(Object obj) {
		boolean resultado=false;
		if(obj instanceof Monitor && resolucion.equals(((Monitor)obj).resolucion)
				&&(marca == ((Monitor)obj).marca))
				resultado=true;
		return resultado;		
	}	
	
	/**CLON**/
	public Object clone(){
		Monitor clonado;
		try {
			clonado=(Monitor) super.clone();
		} catch (CloneNotSupportedException e) {
			clonado=null;
		}
		return clonado;		
	}

	/**toString**/
	public String toString() {
		return "Monitor [resolucion=" + resolucion + ", marca=" + marca + "]";
	}
	
	
}
