
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Ejercicio03 {

	public static void Main(String[] args) {
		// TODO Auto-generated method stub

		String cadena1, cadena2;
		
		cadena1=normalToAmericano("07/12/1991");
		cadena2=americanoToNormal("12/9/2012");
		
	System.out.println(cadena1);
	System.out.println(cadena2);
	}




		
		static String normalToAmericano(String cadena){
			String cadenaVuelta=" ";
			SimpleDateFormat formatoAmericano = new SimpleDateFormat("MM/dd/yyyy"), formatoEuropeo =new SimpleDateFormat("dd/MM/yyyy");
			try { 
				Date fecha = formatoEuropeo.parse(cadena); // Pasar la cadena con una fecha a tipo Date.
				cadenaVuelta=formatoAmericano.format(fecha);
			} catch (ParseException ex) {
				System.out.printf("ERROR");
			} 
				
			
			
			return  cadenaVuelta;
		}
		
		static String americanoToNormal(String cadena){
			String cadenaVuelta=" ";
			SimpleDateFormat formatoAmericano = new SimpleDateFormat("MM/dd/yyyy"), formatoEuropeo =new SimpleDateFormat("dd/MM/yyyy");
			try { 
				Date fecha = formatoAmericano.parse(cadena); // Pasar la cadena con una fecha a tipo Date.
				cadenaVuelta=formatoEuropeo.format(fecha);
			} catch (ParseException ex) {
				System.out.printf("ERROR");
			}
			return cadenaVuelta;
		}


}

