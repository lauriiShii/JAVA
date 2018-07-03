
import java.util.Comparator;

public class ComparadorEmpleadoA3 implements Comparator<Clave>{
	
	public int compare(Clave c1, Clave c2) {
		int comp;
		
		comp=c1.getCategoria().compareTo(c2.getCategoria());//descendente por categoria
		
		if(comp==0)
			comp=c1.getNumero()-c2.getNumero();//ascendente por numero
		
		return comp;
	}

}
