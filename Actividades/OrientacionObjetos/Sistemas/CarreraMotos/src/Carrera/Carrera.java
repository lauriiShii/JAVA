package Carrera;

import java.util.concurrent.CyclicBarrier;

public class Carrera {

	public static void main(String[] args) {
		
		/**VARIABES Y OBJETOS**/
		final int NUM_PARTICIPANTES = 15;
		int i, j;
		Thread[] participantes = new Thread[NUM_PARTICIPANTES];
		
		CyclicBarrier semaforo = new CyclicBarrier(NUM_PARTICIPANTES, new Runnable() {
			
			/**CUANDO TODOS LOS ANIMALES ESTEN POSICIONADOS EN LA MARCA DE 
			 * SALIDA DELANTE DEL SEMAFORO EMPEZARA LA CARRERA**/
			public void run() {
				
				System.out.println("\n\t\t COMIENZA LA CARRERA.\n");
			}
		});
		
		/**COMIENZA LA CARRERA**/
		for (i = 0; i < NUM_PARTICIPANTES; i++)
			
			//Todos los animales empiezan a correr cada uno por una calle "hilo"
			(participantes[i] = new Motorista("Motorista "+i, semaforo)).start();
		
		/**LA CARRERA NO ACABA HASTA QUE TODOS LLEGAN A LA META**/
		for (j = 0; j < participantes.length; j++)
			try {
				
				//Retenemos a cada participante hasta que el resto llega a la meta
				//"Se detiene el proceso del hilo hasta que los demas hilos 
				//hayan llegado al fin tambien"
				participantes[j].join();
				
			} catch (InterruptedException e){}
		
		System.out.println("\n\t\tTODOS HAN LLEGADO A LA META.");
	}
}
