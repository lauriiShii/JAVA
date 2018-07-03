
public class Producto implements Cloneable{
	
	/**ATRIBUTOS**/
	protected String marca;
	protected String modelo;
	protected int stock;
	
	/**CONSTRUCTORES**/
	Producto(){
		marca = "Desconocido";
		modelo = "Desconocido";
		stock = 0;
	}
	
	Producto(String marca, String modelo, int stock){
		this.marca = marca;
		this.modelo = modelo;
		this.stock = stock;
	}
	/**SET**/
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	/**EQUALS**/
	public boolean equals(Object obj) {
		boolean resultado=false;
		if(obj instanceof Producto && marca.equals(((Producto)obj).marca) 
				&& modelo.equals(((Producto)obj).modelo) && stock == (((Producto)obj).stock)) 
				resultado=true;
		return resultado;		
	}	
	
	/**CLON**/
	protected Object clone(){
		Producto clonado;
		try {
			clonado=(Producto) super.clone();
		} catch (CloneNotSupportedException e) {
			clonado=null;
		}
		return clonado;		
	}

	/**toString**/
	public String toString() {
		return "Producto [marca=" + marca + ", modelo=" + modelo + ", stock=" + stock + "]";
	}
	

}
