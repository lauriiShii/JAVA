import java.util.Comparator;

public class Comparador implements Comparator<Clave>{
	
	public int compare(Clave c1, Clave c2) {
		int comp;
		
		comp=c1.getGenero().compareTo(c2.getGenero());//descendente por genero

		if(comp==0)
			comp=c1.getNumero()-c2.getNumero();//ascendente por numero
		
		return comp;
	}

}
