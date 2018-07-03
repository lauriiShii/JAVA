package Junio;

import java.util.ArrayList;

public class Portaaviones extends Barco implements Portador, Cloneable {
	
	/**ATRIBUTOS**/
	private ArrayList<String> nomAviones;
	
	/**CONSTRUCTOR**/
	Portaaviones(String nombre, double escola){
		super(nombre, escola);
	}
	
	/**EQUALS**/
	public boolean equals(Object o){
		boolean result=false;
		
		if(o instanceof Portaaviones && super.equals(o) && nomAviones.equals(((Portaaviones)o).nomAviones))
			result=true;
		
		return result;
	}
	
	/**CLON**/
	public Object clone(){
		Portaaviones clonado;
		
			clonado=(Portaaviones)super.clone();
			clonado.nomAviones = (ArrayList<String>) nomAviones.clone();
		
		return clonado;
	}

	/**ToString**/
	public String toString() {
		return String.format("%s, aviones: [%s] ",super.toString(), nomAviones);
	}
	
	/**METODOS DE LA INTERFAZ PORTADOR**/
	public int numCasillas() {
		
		double numCasilla = 0;
		
		if ((escola/10)%10 == 0)
			numCasilla = escola/10;
		else
			numCasilla = (escola/10)+1;
		
		return (int) numCasilla;
	}
	
	public void aniadirAvion(String avion) {
		if (nomAviones.size() < Constantes.MAXAVIONES)
			nomAviones.add(avion);
		else 
			System.out.println("Este portaaviones esta lleno, no cabe ningun avión más.");
	}
}
