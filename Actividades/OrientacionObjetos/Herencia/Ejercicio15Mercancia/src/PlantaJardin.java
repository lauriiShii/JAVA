
public class PlantaJardin extends Producto implements MercanciaViva{
	
	/**ATRIBUTOS**/
	boolean regada, comida;
	
	/**CONSTRUCTORES**/
	PlantaJardin (double precio, String descripcion, boolean regada, boolean comida){
		super(precio, descripcion);
		this.regada = regada;
		this.comida = comida;
	}
	
	PlantaJardin (){
		super(0.0, "Sin descripcion disponible");
		regada = false;
		comida = false;
	}
	
	/**METODOS**/
	//Implementados de MercanciaViva
	public boolean necesitaComida(){
		return comida;
	}
	
	public boolean necesitaRiego(){
		return regada;
	}
	
	/**toString**/
	public String toString() {
		return String.format("Precio: %.2f ------ Descripcion: ------ Comida: %b ------ Regar: %b.%n", damePrecio(), dameDescripcion(), necesitaComida(), necesitaRiego());
	}
}
