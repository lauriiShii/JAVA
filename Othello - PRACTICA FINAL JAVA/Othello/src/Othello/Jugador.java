package Othello;

import Teclado.Rango;
import Teclado.Teclado;

/**
 * @author Laura Calvente
 * Clase padre de las IA, no es abstracta pues esta representa el rol de jugador en si.
 * Necesita la ayuda de la clase control.
 */

public class Jugador {

	Ficha color;
	Casilla ficha = new Casilla();

	/**
	 * @param tablero
	 * pide la posicion al usuario donde quiere posicionar la ficha.
	 * Comprueba que la posicion sea valida sino la vuelve a pedir.
	 */
	public void jugar (Tablero tablero){
		
		Control control = new Control();
		ficha.colorFicha=color;
		
		//SI HAY MOVIMIENTOS POSIBLES SE PIDE POSICION
		if(tablero.comprobarVolteable(color).size()!=0){
			char columna;
			
			do{
				//FILA
				ficha.posicion.fila = Teclado.numeroInt("\tIntroduce fila:",1,8,Rango.INCLUIDO_MIN_MAX)-1;
				
				//COLUMNA
				do{
					columna = Teclado.caracter("\tIntroduce columna:");
					control.validarDato(columna);
					
					if(control.validarDato(columna) == false)
						System.out.println("CARACTER NO RECONOCIDO");
					
				}while(control.validarDato(columna) == false);
				
				ficha.posicion.columna = control.numColumna(columna);
				
			}while(!tablero.posicionValida(ficha));
		}
	}

}
