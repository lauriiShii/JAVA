import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ejercicio02 {

	/**
	 * Realiza un método que reciba una fecha de nacimiento y devuelva la edad.
	 **/

	public long darEdad(Date fNac) {

		final long AAOMILI = 31540000000L;
		Date fechaActual = new Date();

		return (fechaActual.getTime() - fNac.getTime()) / AAOMILI;
	}
	
	public static void main(String[] args) {
		
		long edad; 
		Date miNac;
		Ejercicio02 miPersona = new Ejercicio02();
		GregorianCalendar nac = new GregorianCalendar(1976, 9, 21);
		
		miNac = new Date(nac.getTimeInMillis());
		
		edad = miPersona.darEdad(miNac);
		System.out.println("Mi persona tiene "+ edad+" aÃ±os");

	}


}
