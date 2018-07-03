
public class Ordenador extends Producto{
	
	/**ATRIBUTOS**/
	protected float velocidad;
	protected float capacidad;
	
	/**CONSTRUCTORES**/
	Ordenador (){
		super("Desconocido", "Desconocido", 0);
		velocidad = 0.0f;
		capacidad = 0.0f;
	}
	
	Ordenador(String marca, String modelo, int stock, float velocidad, float capcacidad){
		super(marca, modelo, stock);
		this.velocidad = velocidad;
		this.capacidad = capcacidad;
	}
	
	/**EQUALS**/
	public boolean equals(Object obj) {
		boolean resultado=false;
		if(obj instanceof Ordenador && super.equals(obj) && velocidad == (((Ordenador)obj).velocidad)
				&& capacidad == ((Ordenador)obj).capacidad)
				resultado=true;
		return resultado;		
	}	
	
	/**CLON**/
	protected Object clone(){
		Ordenador clonado;
		clonado=(Ordenador) super.clone();
		return clonado;		
	}

	/**toString**/
	public String toString() {
		return "Ordenador [velocidad=" + velocidad + ", capacidad=" + capacidad + ", " + super.toString()
				+ "]";
	}
	
	
}
