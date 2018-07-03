
public class Encargado extends Empleado {

	Encargado (String nombre, float sueldo) {
		super(nombre,sueldo);
	}
	
	public float calcularSueldo (float sueldo){
		return sueldo*1.10f;
	}
}
