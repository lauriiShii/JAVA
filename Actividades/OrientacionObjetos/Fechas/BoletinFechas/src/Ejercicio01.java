import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ejercicio01 {
	
	/**Realiza un m�todo que reciba una hora especificando hora, minutos y segundos y devuelva
los milisegundos. Para el c�lculo de los milisegundos no se pueden usar m�todos de java.
Hacer un programa con este m�todo y probar que da el mismo resultado que con m�todos de
java.**/

	public static void main(String[] args) {
		
		Calendar fecha= Calendar.getInstance();
		
		System.out.println(fecha.getTime());
		
		System.out.println(milisec(fecha));

	}
	public static long milisec (Calendar hora)
	{
		return hora.get(hora.HOUR_OF_DAY)*3600000+ hora.get(hora.MINUTE)*60000+ hora.get(hora.SECOND)*1000;
	}
	
}
