package Apartado01;

public class Main {
	public static void main(String[] args) {
	/**PRUEBA PERSONA**/
	Persona Laura = new Persona ();
	System.out.printf("DATOS DE UNA PERSONA:%n%n%s%n%n",Laura.toString());
	
	/**ALUMNO**/
	Alumno Julio = new Alumno ();
	System.out.printf("DATOS DE UN ALUMNO:%n%n%s%n%n",Julio.toString());
	
	/**PROFESOR**/
	Profesor Tony = new Profesor ("Antonio", 24, Sexo.HOMBRE, "Español", 2000);
	System.out.printf("DATOS DE UN PROFESOR:%n%n%s%n%n",Tony.toString());
	
	}
}
