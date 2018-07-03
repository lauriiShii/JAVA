
public class Dispositivo extends Producto {

	/**ATRIBUTOS**/
	protected float capacidadSD;
	
	/**CCONSTRUCTORES**/
	Dispositivo(){
		super("Desconocido", "Desconocido", 0);
		capacidadSD = 0f;
	}
	
	Dispositivo(String marca, String modelo, int stock, float capacidadSD){
		super(marca, modelo, stock);
		this.capacidadSD = capacidadSD;
	}
	
	/**EQUALS**/
	public boolean equals(Object obj) {
		boolean resultado=false;
		if(obj instanceof Dispositivo && super.equals(obj) && capacidadSD == (((Dispositivo)obj).capacidadSD))
				resultado=true;
		return resultado;		
	}	
	
	/**CLON**/
	protected Object clone(){
		Dispositivo clonado;
		clonado=(Dispositivo) super.clone();
		return clonado;		
	}

	/**toString**/
	public String toString() {
		return "Dispositivo [capacidadSD=" + capacidadSD + ", " + super.toString() + "]";
	}
	
	
	
}
