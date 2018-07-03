
public class Producto implements Mercancia{

	/**ATRIBUTOS**/
	protected double precio;
	protected String descripcion;
	
	/**CONSTRUCTOR**/
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
