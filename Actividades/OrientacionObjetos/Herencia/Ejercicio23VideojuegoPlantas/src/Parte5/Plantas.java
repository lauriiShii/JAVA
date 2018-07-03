package Parte5;

public class Plantas implements Cloneable, Regable{
	
	/**ATRIBUTOS**/
	static int ordenPlanta=0;
	private double altura;
	private boolean tieneFlores;

	/**CONSTRUCTOR**/
	public Plantas(double altura, boolean tieneFlores){
		this.altura = altura;
		this.tieneFlores = tieneFlores;
		ordenPlanta++;
	}
	
	/**CLON**/
	protected Object clone(){
		Plantas clonado;
		try {
			clonado=(Plantas)super.clone();
		} catch (CloneNotSupportedException e) {
			clonado=null;
		}
		return clonado;		
	}
	
	/**EQUALS**/
	public boolean equals(Object obj) {
		boolean resultado=false;
		if(obj instanceof Plantas && tieneFlores==(((Plantas)obj).tieneFlores) && altura==(((Plantas)obj).altura))
				resultado=true;
		return resultado;		
			
		}	
	
	/**toString**/
	public String toString(){
		return String.format("\nPlanta Altura: %.2f \nTiene flores: %s", altura, tieneFlores?"Si":"No");
	}

	/**GET**/
	public static int getOrden(){
		return ordenPlanta;
	}

	/**MATODOS IMPLEMENTADOS**/
	public Reproducible reproducirse(){
		ordenPlanta++;
		return (Reproducible)clone();
		
	}
	public void regar(double cant) {
		altura += cant*2;
	}

}


