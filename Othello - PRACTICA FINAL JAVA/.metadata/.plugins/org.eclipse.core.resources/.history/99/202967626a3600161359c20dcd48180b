package Othello;

import Teclado.Rango;
import Teclado.Teclado;

/**
 * @author Laura Calvente
 * Es el main en si, donde se hace la llmada a la clase principal.
 *
 */

public class Ejecucion {

	public static void main(String[] args) {
		
		//VARIABLES
		int i, opcion, dificultad;
		String a="\n\t     Bienvenidos a...";
		
		//INTRODUCCION
		for(i=0;i<a.length();i++){
			try{
				Thread.sleep(250);
			}catch (Exception e){
			}
			System.out.print(Constantes.MORADO+a.charAt(i)+Constantes.RESET);
		}
		System.out.println(Constantes.ROJO+"\n\t ¡¡¡¡ O T H E L L O !!!!"+Constantes.RESET);
		try{
			Thread.sleep(500);
		}catch (Exception e){
		}
		
		//SELECCION DE MODO DE JUEGO
		opcion = Teclado.numeroInt("\nElige un modo de juego: \n\n\t1.Tú VS IA\n\t2.Tú VS amigo", 1, 2,
				Rango.INCLUIDO_MIN_MAX);
		
		//EJECUCION PARTIDA IA
		if (opcion == 1){ 
			dificultad = Teclado.numeroInt("\n¿Con qué nivel de dificultad quieres jugar? \n\n\t1.Dificil\n\t2.Facil", 1, 2,
					Rango.INCLUIDO_MIN_MAX);
			//SELECCIONAMOS DIFICULTAD
			if (dificultad == 1){
				IADificil oponente = new IADificil ();
				Partida pIADificil = new Partida();
				pIADificil.empezarPartida(oponente);
			}else{
				IAFacil oponente = new IAFacil ();
				Partida pIAFacil = new Partida();
				pIAFacil.empezarPartida(oponente);
			}
		}
		//EJECUCION PARTIDA AMIGO
		else{ 
			Jugador oponente = new Jugador ();
			Partida pJugador = new Partida();
			pJugador.empezarPartida(oponente);
		}
	}

}
