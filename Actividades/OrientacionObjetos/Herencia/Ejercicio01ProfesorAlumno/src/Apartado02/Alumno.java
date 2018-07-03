package Apartado02;

public class Alumno extends Persona {
	
	/**ATRIBUTOS**/
	private boolean repetidor;
	
	/**CONSTRUCTOR**/
	public Alumno(boolean repetidor){
		this.repetidor = repetidor;
	}

	public Alumno(String nombre, int edad, Sexo sexo, String nacionalidad,boolean repetidor){
		super(nombre,edad,sexo,nacionalidad);
		this.repetidor = repetidor;
	}
	
	public Alumno(){
		this("SinNombre",0,Sexo.HOMBRE,"SinNacionalidad", false); // Version 1.2.2
	}
	
	/**METODOS**/
	public String toString(){
		return String.format("%s \n-Repetidor: %b", super.toString(), repetidor);
	}
}
