package Parte1;

public class Plantas implements Cloneable{
	
	/**ATRIBUTOS**/
	static int ordenPlanta=0;
	
	private double altura;
	private boolean tieneFlores;

	/**CONSTRUCTOR**/
	Plantas(double altura, boolean tieneFlores){
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
		return String.format("Planta Altura: %.2f \nTiene flores: %s", altura, tieneFlores?"Si":"No");
	}

	/**GET**/
	public int getOrden(){
		return ordenPlanta;
	}
	
	
	
	






}


