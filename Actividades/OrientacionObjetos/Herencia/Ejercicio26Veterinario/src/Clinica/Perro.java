package Clinica;

public class Perro extends Mamifero{

	/**ATRIBUTOS**/
	final static char LETRA='P';
	final static String VOZ="GUAU!";
	static short numero=0;
	protected GradoAgresividad gradoAgresividad;
	
	
	/**CONSTRUCTORES**/
	Perro(){
		this("Sin nombre",0,false,"Sin raza","Sin champu", GradoAgresividad.BAJA);
	}
	
	Perro(String nombre, float cuotaMensual, boolean enfadado, String raza, String champuPelo,
			GradoAgresividad gradoAgresividad){
		
		super(nombre, cuotaMensual, enfadado, raza, champuPelo);
		this.gradoAgresividad=gradoAgresividad;
		numero++;
		codigo=String.format("%c%03d",LETRA, numero);
		
	}
	
	/**METODOS**/
	// EQUALS
	public boolean equals(Object o){
		boolean igual=false;
		
		if(o instanceof Perro)
			if(super.equals(o)&&gradoAgresividad==(((Perro) o).gradoAgresividad))
				igual=true;

		return igual;
		
	}
	
	//METODO DE LA INTERFAZ
	public String hablar() {
		
		return VOZ;
		
	}
	
	//TOSTRING
	public String toString(){
		return super.toString()+"\n[Grado de agresividad: "+gradoAgresividad+"]";

	}
}
