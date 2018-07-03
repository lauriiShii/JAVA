package Apartado02;

public class Profesor extends Persona{

	/**ATRIBUTOS**/
	private double sueldo;
	
	/**CONSTRUCTOR**/
	public Profesor(int sueldo){
		sueldo = 0;
	}

	public Profesor (String nombre, int edad, Sexo sexo, String nacionalidad, double sueldo){
		super(nombre,edad,sexo,nacionalidad);
		this.sueldo = sueldo;
	}

	/**METODOS**/
	public String toString(){
		return String.format("%s\n-Sueldo: %.2f", super.toString(), sueldo);
	}
	
}
