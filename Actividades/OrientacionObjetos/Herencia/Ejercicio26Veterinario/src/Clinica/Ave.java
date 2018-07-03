package Clinica;

public abstract class Ave extends Mascota {
 
	/**ATRIBUTOS**/
	public Alimentacion alimentacion;
	
	/**CONSTRUCTORES**/
	Ave(){
		super();
		alimentacion=Alimentacion.INSECTIVORA;
	}
	
	Ave(String nombre,float cuotaMensual, boolean enfadado, String raza, Alimentacion alimentacion){
		super(nombre, cuotaMensual, enfadado, raza);
		this.alimentacion=alimentacion;
	}

	/**METODOS**/
	// EQUALS
	public boolean equals(Object o){
		boolean igual=false;
	
		if(o instanceof Ave)
			if(super.equals(o)&&alimentacion==(((Ave) o).alimentacion))
				igual=true;
		return igual;
	}
	
	// GET Y SET
	public Alimentacion getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(Alimentacion alimentacion) {
		this.alimentacion = alimentacion;
	}
	
	//TOSTRING
	public String toString(){
		return super.toString()+"[Alimentacion: "+alimentacion+"]";
	}
	
}
