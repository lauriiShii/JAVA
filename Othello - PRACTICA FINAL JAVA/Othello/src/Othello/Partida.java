package Othello;

import Teclado.Rango;
import Teclado.Teclado;
import Othello.Control;

/**
 * @author Laura Calvente 
 * Se encarga del transcurso de la partida con ayuda de la clase control.
 *
 */
public class Partida {

	Tablero tablero = new Tablero();
	Jugador jugador = new Jugador();
	

	/**
	 * El metodo empezarPartida crea un tablero, añade las posiciones, las fichas 
	 * iniciales y lleva el control de los turnos.
	 */
	public void empezarPartida(Jugador oponente) {
		int opcion;
		Control control = new Control();
		
		//MOSTRAMOS TABLERO
		tablero.mostrar();

		// EL USUARIO DECIDE CON QUE COLOR JUEGA
		opcion = Teclado.numeroInt("Elige que color deseas ser: \n\n\t1.Blancas \n\t2.Negras", 1, 2,
				Rango.INCLUIDO_MIN_MAX);

		if (opcion == 1) {
			jugador.color = Ficha.BLANCA;
			oponente.color = Ficha.NEGRA;
		} else {
			jugador.color = Ficha.NEGRA;
			oponente.color = Ficha.BLANCA;
		}

		do {
			// SI EL JUGADOR ELIGIO BLANCO, LA IA QUE ES NEGRA JUEGA PRIMERO PRIMERO
			if (jugador.color == Ficha.BLANCA) {
				
				// SI NO SE PUEDE VOLTEAR MAS FICHAS DEL OPONENTE SE DA FIN DE PARTIDA
				if (tablero.comprobarVolteable(oponente.color).size() == 0){
					control.ganador(tablero);
				}
				
				//SINO, SE EJECUTA TURNO DE IA
				else {
					System.out.println(Constantes.MORADO+"Turno de las negras:"+Constantes.RESET);
					oponente.jugar(tablero);
					tablero.mostrar();
				}

				// SI DESPUES DEL TURNO DE LA IA EL JUGADOR NO TIENE FICHAS VOLTEABLES DEL OPONENTE SE DA FIN DE PARTIDA
				if (tablero.comprobarVolteable(jugador.color).size() == 0){
					control.ganador(tablero);
				}
				
				//SINO, SE EJECUTA TURNO DEL JUGADOR
				else {
					System.out.println(Constantes.MORADO+"Turno de las blancas:"+Constantes.RESET);
					jugador.jugar(tablero);
					tablero.mostrar();
				}
			}

			// SI EL JUGADOR ESCOGIO NEGRO, JUEGA EL PRIMERO
			else {
				// SI EL JUGADOR NO TIENE FICHAS VOLTEABLES DEL OPONENTE SE DA FIN DE PARTIDA
				if (tablero.comprobarVolteable(jugador.color).size() == 0){
					control.ganador(tablero);
				}
				//SINO, SE EJECUTA TURNO DEL JUGADOR
				else {
					System.out.println(Constantes.MORADO+"Turno de las negras:"+Constantes.RESET);
					jugador.jugar(tablero);
					tablero.mostrar();
				}
				
				// SI DESPUES DEL TURNO DEL JUGADOR, LA IA NO TIENE FICHAS VOLTEABLES DEL OPONENTE SE DA FIN DE PARTIDA
				if (tablero.comprobarVolteable(oponente.color).size() == 0){
					control.ganador(tablero);
				}
				
				//SINO, SE EJECUTA TURNO DE IA
				else {
					System.out.println(Constantes.MORADO+"Turno de las blancas:"+Constantes.RESET);
					oponente.jugar(tablero);
					tablero.mostrar();
				}
			}
		// MIENTRAS HAYA FICHAS VOLTEABLES LA PARTIDA CONTINUA
		} while ((tablero.comprobarVolteable(oponente.color).size() > 0 || tablero.comprobarVolteable(jugador.color).size() > 0));

	}
}
