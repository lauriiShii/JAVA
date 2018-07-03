package Othello;

import java.util.ArrayList;

/**
 * @author Laura Calvente
 * Clase que hereda de la clase jugador, ya que tiene sus mismos atributos 
 * y el mismo metodo, solo que se implementa de forma diferente
 */
public class IADificil extends Jugador{
	
	/**
	 * @param tablero
	 * Busca un movimiento posible escogiendo la que más voltea.
	 */
	public void jugar(Tablero tablero) {
		
		int i, cantVolteada = 0;
		Casilla ficha = null;
		Tablero t = new Tablero();
		ArrayList <Casilla> volteables = new ArrayList <Casilla>();

		// GUARDAMOS EN UNA LISTA TODAS LAS POSICIONES EN LAS QUE LA IA PUEDE PONER UNA FICHA
		volteables.addAll(tablero.comprobarVolteable(color));
		

		// MIRAMOS TODAS LAS POSIBLES POSICIONES
		for(i=0; i < volteables.size(); i++){
			
			// PARA HACER LAS COMPROBACIONES USAMOS UN CLON DEL TABLERO ORIGINAL
			t = (Tablero) tablero.clone();
			ficha = new Casilla();
			ficha.colorFicha=color;
			
			// CLONAMOS LA PSOSIBLE POSICION PARA LA JUGADA EN CUESTION
			ficha.posicion = (Posicion)volteables.get(i).posicion.clone();
			
			// REALIZAMOS LA JUGADA EN EL TABLERO CLONADO
			t.posicionValida(ficha);
		}
		
		// SI LA JUGADA RESULTA SER LA MEJOR AL FINALIZAR EL FOR SERA LA JUGADA QUE SE EJECUTE
		if (t.contadorFicha(color) > cantVolteada )  {
			cantVolteada = t.contadorFicha(color);
			tablero.posicionValida(ficha);
			}
	}
}
