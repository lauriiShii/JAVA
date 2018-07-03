import java.util.Random;

public class Moneda extends Sorteo{
	
    public Moneda() {
        posibilidades = 2;
    }

    public int lanzar() {
        Random rnd = new Random();
        return rnd.nextInt(posibilidades) + 1;
    }
    
    public String lanzar(int n) {
        return n == 1?"Cara":"Cruz";
    }
}
