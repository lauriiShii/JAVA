package Apartado01;

public class Profesor extends Persona {

	/**ATRIBUTOS**/
	private double sueldo;
	
	/**CONSTRUCTOR**/
	public Profesor(double sueldo){
		sueldo = 0;
	}

	public Profesor (String nombre, int edad, Sexo sexo, String nacionalidad, double sueldo){
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.nacionalidad = nacionalidad;
		this.sueldo = sueldo;
	}

	/**METODOS**/
	public String toString(){
		return String.format("%s\n-Sueldo: %.2f", super.toString(), sueldo);
	}
}
