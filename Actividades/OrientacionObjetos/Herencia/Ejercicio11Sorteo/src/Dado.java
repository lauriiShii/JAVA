import java.util.Random;

public class Dado extends Sorteo{

    public Dado() {
        posibilidades = 6;
    }

    public int lanzar() {
    	
        Random rnd = new Random();
        
        return rnd.nextInt(posibilidades) + 1;
    }
}
