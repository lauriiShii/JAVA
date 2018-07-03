
import java.util.Date;

public class Coche extends Vehiculo_motor {

	/* No implementamos el metodo equals porque tiene los mismo atributos que su padre. */
	public Coche(String matricula, Marcas marca,Date fecha, double cilindrada, double caballos) {
		super(matricula, marca, fecha, caballos,cilindrada);
	}
	public Object clone(){
		Coche m;
		m =(Coche)super.clone();
		return m;
	}

}
