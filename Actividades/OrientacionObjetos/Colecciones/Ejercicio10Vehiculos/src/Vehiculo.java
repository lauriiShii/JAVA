
import java.util.Date;

public class Vehiculo implements Cloneable{
	
	protected String matricula;
	protected Marcas marca;
	protected Date fecha;
	public Vehiculo(String matricula, Marcas marca, Date fecha) {
		this.matricula = matricula;
		this.marca = marca;
		this.fecha = fecha;
		
	}

	// Como todos los datos a clonar son primitivos solo implemento el Clone en el PADRE TODO PODEROSO
	public Object clone(){
		Vehiculo miVehiculo;
		
		try{
			miVehiculo =(Vehiculo)super.clone();
			miVehiculo.fecha = (Date) fecha.clone();
		} catch(CloneNotSupportedException e){
			miVehiculo = null;
		}
		return miVehiculo;
	}
	// Implementamos equals en todas las clases, menos en aquellas que no implementan nuevos atributos respecto a su
	// herencia.
	public boolean equals(Object obj){
		//boolean resultado = false; 
		
		if(obj instanceof Vehiculo){
			Vehiculo v = (Vehiculo) obj;
			return v.matricula.equals(((Vehiculo_motor)obj).matricula) &&
			v.marca.equals(((Vehiculo_motor)obj).marca) &&
			v.fecha.equals(((Vehiculo_motor)obj).fecha); 
			
		}
		else return false;
	}
	// HAS CODE
	public int hasCode(){
		return matricula.hashCode()+marca.hashCode()+fecha.hashCode();
	}
	public int caluculaNumRuedas(Vehiculo obj){
		int ruedas = 0;
		if (obj instanceof Triciclo)
			ruedas = 3;
		else if (obj instanceof Coche)
			ruedas = 4;
		else if (obj instanceof Moto)
			ruedas = 2;
		
		return ruedas;
	}
	public String toString(){
		return String.format("Matricula: %s\nMarca: %s\nFecha: %s", matricula,marca,fecha);
	}
}
