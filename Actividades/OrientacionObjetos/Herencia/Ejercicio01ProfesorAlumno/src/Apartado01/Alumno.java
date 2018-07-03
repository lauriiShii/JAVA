package Apartado01;

public class Alumno extends Persona{

	/**ATRIBUTOS**/
	private boolean repetidor;
	
	/**CONSTRUCTOR**/
	public Alumno(){
		repetidor = false;
	}

	public Alumno(String nombre, int edad, Sexo sexo, String nacionalidad, boolean repetidor){
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.nacionalidad = nacionalidad;
		this.repetidor = repetidor;
	}
	
	/**METODOS**/
	public String toString(){
		return String.format("%s \n-Repetidor: %b", super.toString(), repetidor);
	}
}