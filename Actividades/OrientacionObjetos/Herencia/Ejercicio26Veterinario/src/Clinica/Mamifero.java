package Clinica;

public abstract class Mamifero extends Mascota {

	/**ATRIBUTOS**/
	protected String champuPelo;
	
	/**CONSTRUCTORES**/
	Mamifero(){
		super();
		champuPelo="Sin marca";
	}
	
	Mamifero(String nombre, float cuotaMensual, boolean enfadado, String raza, String champuPelo){
		super(nombre, cuotaMensual, enfadado, raza);
		this.champuPelo=champuPelo;
	}

	/**METODOS**/
	// EQUALS comprueba cada una de las variables si es el adecuado.
	public boolean equals(Object o){
		boolean igual=false;
		
		if(o instanceof Mamifero)
			if(super.equals(o)&&champuPelo.equals(((Mamifero) o).champuPelo))
				igual=true;
	
		return igual;
	}
	
	//TOSTRING
	public String toString(){
		return super.toString()+"[Marca de Champu: "+champuPelo+"]";
	}
	
	// GET Y SET
	public String getChampuPelo() {
		return champuPelo;
	}

	public void setChampuPelo(String champuPelo) {
		this.champuPelo = champuPelo;
	}
	
	
}
