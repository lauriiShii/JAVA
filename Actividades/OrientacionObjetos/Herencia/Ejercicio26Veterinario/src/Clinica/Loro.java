package Clinica;

public class Loro extends Ave {

	/**ATRIBUTOS**/
	final static char LETRA='L';
	final static String VOZ1="RUAK!";
	final static String VOZ2="BARCOS Y PUTAS PARA TODOS!";
	static short numero;
	private boolean hablaH;
	
	
	/**CONSTRUCTORES**/
	Loro(){

		this("Sin nombre",0,false,"Sin raza",Alimentacion.CARNIVORA,false);
	}
	
	Loro(String nombre,float cuotaMensual, boolean enfadado, String raza, Alimentacion alimentacion, boolean hablaH){
		
		super(nombre,cuotaMensual,enfadado,raza,alimentacion);
		this.hablaH=hablaH;
		numero++;
		codigo=String.format("%c%03d",LETRA, numero);
		
	}
	
	/**METODOS**/
	// EQUAL
	public boolean equals(Object o){
		boolean igual=false;
		
		if(o instanceof Loro)
			if(super.equals(o)&&hablaH==(((Loro) o).hablaH))
				igual=true;

		return igual;
		
	}
	
	//METODO INTERFAZ
	public String hablar() {
		return hablaH?VOZ2:VOZ1;
	}
	
	//GET Y SET
	public boolean isHablaH() {
		return hablaH;
	}

	public void setHablaH(boolean hablaH) {
		this.hablaH = hablaH;
	}
	
	//TOSTRING
	public String toString(){
		return super.toString()+"\n[Habla: "+hablaH+"]";
	}
 
}
