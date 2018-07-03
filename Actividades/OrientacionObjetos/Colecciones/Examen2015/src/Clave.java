
public class Clave implements Cloneable {
	private int numero;
	private Categoria categoria;
	
	Clave( Categoria categoria,int numero){
		this.categoria=categoria;
		this.numero=numero;
	}
	
	public boolean equals(Object obj) {
		boolean resultado=false;
		
		if(obj instanceof Clave && numero==(((Clave)obj).numero) && categoria==(((Clave)obj).categoria))
				resultado=true;
		return resultado;		
	}
	
	public Object clone(){
		Clave clonado;
		
		try {
			clonado=(Clave)super.clone();
		} catch (CloneNotSupportedException e) {
			clonado=null;
		}
		
		return clonado;
	}
	
	public String toString() {
		return String.format("%c%d",categoria.getCodigo(),numero);
	}
	
	public int getNumero() {
		return numero;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	
	public int hashCode(){
		
		return categoria.hashCode()+numero;
	}
	
}
