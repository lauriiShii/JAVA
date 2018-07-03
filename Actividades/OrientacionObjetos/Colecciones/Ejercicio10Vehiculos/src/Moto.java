
import java.util.Date;

public class Moto extends Vehiculo_motor{

	// PASA LO MISMO QUE EN COCHE. 
	public Moto(String matricula, Marcas marca,Date fecha, double cilindrada, double caballos) {
		super(matricula, marca,fecha, cilindrada, caballos);
	}
	public Object clone(){
		Moto m;
		m =(Moto)super.clone();
		return m;
	}
}
