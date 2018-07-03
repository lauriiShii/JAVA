package Junio;

public class Velero extends Barco implements Velas, Cloneable {
	
	/**ATRIBUTOS**/
	int velas;
	
	/**CONSTRUCTOR**/
	Velero (String nombre, double escola, int velas){
		super(nombre, escola);
		this.velas = velas;
	}
	
	/**EQUALS**/
	public boolean equals(Object o){
		boolean result=false;
		
		if(o instanceof Velero && super.equals(o) && velas == (((Velero)o).velas))
			result=true;
		
		return result;
	}
	
	/**CLON**/
	public Object clone(){
		Portaaviones clonado;
		
		clonado=(Portaaviones)super.clone();
		
		return clonado;
	}
	
	/**ToString**/
	public String toString() {
		return String.format("%s, numVelas: %n ",super.toString(), velas);
	}
	
	/**METODOS DE LA INTERFAZ VELAS**/
	public int numCasillas() {
		
		double numCasilla = 0;
		
		if ((escola/10)%10 == 0)
			numCasilla = escola/10;
		else
			numCasilla = (escola/10)+1;
		
		return (int) numCasilla;
	}

	public void numVelas() {
		System.out.printf("Este velero navega correctamente con %d velas",velas);
	}
}
