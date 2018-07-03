
public class ProductoAlfareria extends Producto implements MercanciaFragil{

	/**ATRIBUTOS**/
	boolean fragil;
	String embalaje;
	double peso;
	
	/**CONSTRUCTORES**/
	ProductoAlfareria (double precio, String descripcion, boolean fragil, String embalaje, double peso){
		super(precio, descripcion);
		this.fragil = fragil;
		this.embalaje= embalaje;
		this.peso = peso;
	}
	
	ProductoAlfareria (){
		super(0.0, "Sin descripcion disponible");
		fragil = false;
		embalaje="Sin predeterminar";
		peso= 0.0;
	}
	
	/**METODOS**/
	//Implementados de MercanciaFragil
	public String dameEmbalaje(){
		return embalaje;
	}
	
	public double damePeso(){
		return peso;
	}

	/**toString**/
	public String toString() {
		return String.format("Precio: %.2f ------ Descripcion: %s ------ Embalaje: %s ------ Peso: %.2f.%n", damePrecio(), dameDescripcion(), dameEmbalaje(), damePeso());
	}
}
