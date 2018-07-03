import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ejercicio01 {
	
	/**Realiza un método que reciba una hora especificando hora, minutos y segundos y devuelva
los milisegundos. Para el cálculo de los milisegundos no se pueden usar métodos de java.
Hacer un programa con este método y probar que da el mismo resultado que con métodos de
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
