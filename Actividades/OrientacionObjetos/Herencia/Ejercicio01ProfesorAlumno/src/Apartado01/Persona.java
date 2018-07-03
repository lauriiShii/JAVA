package Apartado01;

public class Persona  {

	/**ATRIBUTOS**/
	protected String nombre;
	protected int edad;
	protected Sexo sexo;
	protected String nacionalidad;
	
	/**CONSTRUCTOR**/
	public Persona(){
		nombre = "SinNombre";
	}

	public Persona(String nombre, int edad, Sexo sexo, String nacionalidad){
		this.nacionalidad = nacionalidad;
		this.sexo = sexo;
		this.edad = edad;
		this.nombre = nombre;
	}
	
	/**METODOS**/
	public String toString(){
		return String.format("-Nombre: %s\n-Edad: %d\n-Sexo: %s\n-Nacionalidad: %s", nombre, edad, sexo, nacionalidad);
	}
	
}
