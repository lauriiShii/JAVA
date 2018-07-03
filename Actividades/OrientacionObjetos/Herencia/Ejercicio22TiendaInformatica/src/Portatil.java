
public class Portatil extends Ordenador {

	/**ATRIBUTOS**/
	protected float peso;
	
	/**CONSTRUCTOR**/
	public Portatil() {
		super("Desconocido", "Desconocido", 0, 0.0f, 0.0f);
		peso = 0.0f;
	}
	
	public Portatil(String marca, String modelo, int stock, float velocidad, float capcacidad, float peso){
		super(marca, modelo, stock, velocidad, capcacidad);
		this.peso = peso;
		
	}
	
	/**EQUALS**/
	public boolean equals(Object obj) {
		boolean resultado=false;
		if(obj instanceof Portatil && super.equals(obj) && peso == (((Portatil)obj).peso))
				resultado=true;
		return resultado;		
	}
	
	/**CLON**/
	protected Object clone(){
		Portatil clonado;
		clonado=(Portatil) super.clone();
		return clonado;		
	}

	/**toString**/
	public String toString() {
		return "Portatil [peso=" + peso + ", toString()=" + super.toString() + "]";
	}
	
	
}
