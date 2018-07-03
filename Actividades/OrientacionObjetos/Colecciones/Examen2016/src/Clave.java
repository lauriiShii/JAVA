
public class Clave implements Cloneable {
	
	/**ATRIBUTOS Y OBJETOS**/
	private int numero;
	private Genero genero;
	
	/**CONSTRUCTOR**/
	Clave( Genero genero,int numero){
		this.genero=genero;
		this.numero=numero;
	}
	/**EQUALS**/
	public boolean equals(Object obj) {
		boolean resultado=false;
		
		if(obj instanceof Clave && numero==(((Clave)obj).numero) && genero==(((Clave)obj).genero))
				resultado=true;
		return resultado;		
	}
	
	/**CLON**/
	public Object clone(){
		Clave clonado;
		
		try {
			clonado=(Clave)super.clone();
		} catch (CloneNotSupportedException e) {
			clonado=null;
		}
		
		return clonado;
	}
	
	/**ToString**/
	public String toString() {
		return String.format("%c%d",genero.getCodigo(),numero);
	}
	
	/**HASHCODE**/
	public int hashCode(){
		
		return genero.hashCode()+numero;
	}
	
	/**GETTERS**/
	
	public Genero getGenero() {
		return genero;
	}
	
	public int getNumero() {
		return numero;
	}
	
}