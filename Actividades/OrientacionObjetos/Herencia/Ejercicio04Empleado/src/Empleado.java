
public class Empleado {

	protected String nombre;
	protected float sueldo;
	
	Empleado (String nombre, float sueldo){
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	Empleado(){
		nombre = "Sin Nombre";
		sueldo = 0.00f;
	}
	
	public float calcularSueldo (float sueldo){
		return sueldo;
	}
	
	public String toString() {
		return String.format("Nombre: %s%nSueldo %.2f%n%n",nombre, calcularSueldo(sueldo));
	}
}
