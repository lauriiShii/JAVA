import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ejercicio02V2 {

	public static void main(String[] args) {
		
		System.out.println(Ejercicio02V2.calcularEdad("21-09-1976"));

	}
	
	public static int calcularEdad(String fecha){
		Date fechaNac=null;
		SimpleDateFormat fechaN = new SimpleDateFormat("dd-MM-yyyy");
		int anio,mes,dia;
		
		try{
			fechaNac = fechaN.parse(fecha);
		}
		catch(ParseException e){
			System.out.println("ERROR");
		}
		Calendar fechaNacimiento= Calendar.getInstance();
		Calendar fechaActual= Calendar.getInstance();
		fechaNacimiento.setTime(fechaNac);
		
		anio= fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
		mes= fechaActual.get(Calendar.MONTH) - fechaNacimiento.get(Calendar.MONTH);
		dia= fechaActual.get(Calendar.DATE) - fechaNacimiento.get(Calendar.DATE);
		
		if(mes<0 || (mes==0 && dia<0)){
			anio--;
        }
		return anio;
	}
}
