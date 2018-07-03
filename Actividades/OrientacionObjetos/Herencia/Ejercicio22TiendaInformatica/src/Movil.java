
public class Movil extends Dispositivo {
	
	/**ATRIBUTOS**/
	protected boolean banda4G;

	/**CONSTRUCTORES**/
	Movil(){
		super("Desconocido", "Desconocido", 0,0f);
		banda4G = false;
	}
	
	Movil(String marca, String modelo, int stock, float capacidadSD, boolean banda4G){
		super(marca, modelo, stock,capacidadSD);
		this.banda4G = banda4G;
	}
	
	/**EQUALS**/
	public boolean equals(Object obj) {
		boolean resultado=false;
		if(obj instanceof Movil && super.equals(obj) && banda4G== (((Movil)obj).banda4G))
				resultado=true;
		return resultado;		
	}
	/**CLON**/
	protected Object clone(){
		Movil clonado;
		clonado=(Movil) super.clone();
		return clonado;		
	}

	@Override
	public String toString() {
		return "Movil [banda4G=" + banda4G + ", " + super.toString() + "]";
	}
	
	
	
}
