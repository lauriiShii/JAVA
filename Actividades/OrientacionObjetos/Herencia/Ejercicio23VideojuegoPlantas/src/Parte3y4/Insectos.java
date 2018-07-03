package Parte3y4;

public class Insectos implements Cloneable {
	
	/**ATRIBUTOS**/
	static int ordenInsecto;
	private String color;
	private int numpatas;
	private double peso;

	/**CONSTRUCTOR**/
	public Insectos(String color, int numpatas, double peso){
		this.color = color;
		this.numpatas = numpatas;
		this.peso=peso;
		ordenInsecto++;
	}

	/**CLON**/
	protected Object clone(){
		Insectos clonado;
		try {
			clonado=(Insectos)super.clone();
		} catch (CloneNotSupportedException e) {
			clonado=null;
		}
		return clonado;		
	}
	
	/**AQUALS**/
	public boolean equals(Object obj) {
		boolean resultado=false;
		if(obj instanceof Insectos && color.equals(((Insectos)obj).color)&& numpatas==(((Insectos)obj).numpatas)
				&& peso==(((Insectos)obj).peso))
				resultado=true;
		
		return resultado;		
			
		}	
	
	/**toString**/
	public String toString(){
		return String.format("\nInsecto \nColor de insecto: %s \nNumero de patas: %d \nPeso.  %.2f", color, numpatas, peso);
	}

	/**GET**/
	public static int getOrden(){
		return ordenInsecto;
	}
}
