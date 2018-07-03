package Clinica;

public class Periquito extends Ave {

	/**ATRIBUTOS**/
	final static char LETRA='R';
	final static String VOZ="PIRIRI!";
	static short numero;
	
	/**CONSTRUCTORES**/
	Periquito(){
		this("Sin nombre",0,false,"Sin raza",Alimentacion.HERBIVORA);
	}
	
	Periquito(String nombre,float cuotaMensual, boolean enfadado, String raza, Alimentacion alimentacion){
		super(nombre,cuotaMensual,enfadado,raza,alimentacion);
		numero++;
		codigo=String.format("%c%03d",LETRA, numero);
	}
	
	/**METODOS**/
	// EQUALS
	public boolean equals(Object o){
		boolean igual=false;
		if(o instanceof Periquito && super.equals(o))
			igual=true;
		
		return igual;
	}
	
	//METODO DE LA INTERFAZ
	 public String hablar(){
			return VOZ;
		}
	
}
