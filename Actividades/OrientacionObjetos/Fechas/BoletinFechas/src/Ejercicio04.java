
import java.text.SimpleDateFormat;
import java.util.Date;


public class Ejercicio04 {
    public static void main(String[] args) {
        System.out.println(fechaActual());
    }
    public static String fechaActual(){
        Date date = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("'Hoy es' EEEE dd-MM-yyyy 'a las'HH:mm:ss");
        return formato.format(date);
    }
}
