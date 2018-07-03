package Junio;

public class Barco implements Cloneable{
	
	/**ATRIBUTOS**/
	private String nombre;
	protected double escola;
	
	/**CONSTRUCTOR**/
	Barco (String nombre, double escola) {
		this.nombre = nombre;
		this.escola = escola;
	}
	
	/**EQUALS**/
	public boolean equals(Object o){
		boolean result=false;
		
		if(o instanceof Barco && nombre.equals(((Barco)o).nombre) && escola == (((Barco)o).escola))
			result=true;
		
		return result;
	}
	
	/**CLON**/
	public Object clone(){
		Barco clonado;
		
		try {
			clonado=(Barco)super.clone();
		} catch (CloneNotSupportedException e) {
			clonado=null;
		}
		
		return clonado;
	}
	
	/**ToString**/
	public String toString() {
		return String.format("Nombre: %s, escola: %d", nombre, escola);
	}
	
}
