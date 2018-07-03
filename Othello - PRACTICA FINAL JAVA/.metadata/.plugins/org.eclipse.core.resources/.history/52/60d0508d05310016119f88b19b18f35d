package Othello;

/**
 * @author Laura Calvente 
 * La clase casilla tiene una posicion, nunca
 * podra ser crerada sin tener una posicion. Esta clase se compone de un
 * color, con esto sabremos si esta vacia, es una ficha negra o blanca.
 * nuestro programa las fichas no son más que casillas pintadas de
 * colores, no existe el objeto ficha como tal.
 *
 */
public class Casilla implements Cloneable {

	Ficha colorFicha;
	Posicion posicion;

	/**
	 * Constructor
	 */
	public Casilla(Ficha colorFicha, Posicion posicion) {
		this.colorFicha = colorFicha;
		this.posicion = posicion;
		posicion = new Posicion();
	}

	/**
	 * Constructor
	 */
	public Casilla() {
		posicion = new Posicion();
	}

	/**
	 * Constructor
	 */
	public Casilla(Ficha colorFicha) {
		this.colorFicha = colorFicha;
		posicion = new Posicion();
	}

	/**
	 * Clon, usado por el tablero
	 */
	public Object clone() {
		Casilla clonado;

		try {
			clonado = (Casilla) super.clone();
			clonado.posicion = (Posicion) posicion.clone();
		} catch (CloneNotSupportedException e) {
			clonado = null;
		}
		return clonado;
	}

}
