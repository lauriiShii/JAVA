
public abstract class Producto implements Mercancia{

	protected double precio;
	protected String descripcion;
	
	Producto (double precio, String descripcion) {
		this.precio=precio;
		this.descripcion= descripcion;
	}
	/**METODOS**/
	//Implementados de Merceria
	public double damePrecio(){
		return precio;
	}
	
	public String dameDescripcion(){
		return descripcion;
	}
	
}
