package Othello;


/**
 * @author Laura Calvente
 * La posicion indicara columna y fila.
 *
 */
public class Posicion implements Cloneable{

	int fila, columna;

	/**
	 * Constructor
	 * */
	public Posicion(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
	}

	/**
	 * Constructor
	 * */
	public Posicion() {		
	}
	
	/**
	 * Clon, usado por la IA y la Casilla.
	 * */
	public Object clone(){
		Posicion clonado;
		
		try
		{
			clonado=(Posicion) super.clone();
		} 
		catch (CloneNotSupportedException e) {
			clonado=null;
		}
		return clonado;		
	}
	
}
