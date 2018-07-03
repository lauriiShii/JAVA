package Othello;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Laura Calvente
 * Clase que hereda de la clase jugador, ya que tiene sus mismos atributos 
 * y el mismo metodo, solo que se implementa de forma diferente
 */

public class IAFacil extends Jugador{
	
	/**
	 * @param tablero
	 * Busca un movimiento posible al azar.
	 */
	public void jugar(Tablero tablero) {
		
		Random r = new Random();
		Casilla ficha = null;
		ArrayList <Casilla> volteables = new ArrayList <Casilla>();

		// GUARDAMOS EN UNA LISTA TODAS LAS POSICIONES EN LAS QUE LA IA PUEDE PONER UNA FICHA
		volteables.addAll(tablero.comprobarVolteable(color));
		
		// ESCOGEMOS UNA POSICION AL AZAR
		ficha = new Casilla();
		ficha.colorFicha=color;
		ficha.posicion = (Posicion)volteables.get(r.nextInt(volteables.size())).posicion;
		tablero.posicionValida(ficha);
		
		
	}
}
