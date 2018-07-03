package Boletin;

import java.util.Arrays;

public class Ejercicio25 {

	static int prob=0;
	
	/**OCHO REINAS*/
	
	public static void main(String[] args) {
		int posicionreina[][]=new int[8][2];
		boolean tablero[][]=new boolean[8][8];
		int i;
		
		//Saco todas las piezas del tablero
		for(i=0;i<posicionreina.length;i++){
			Arrays.fill(posicionreina[i], 9);
		}
		
		//LLamo a la funcion recursiva
		tablero(posicionreina,0,tablero);
	}
	
	public static void tablero(int[][] reina,int npiezas,boolean tablero[][]){
		int i;
		//Caso base : Si se han colocado 8 reinas, mostramos el resultado
		if(npiezas==8){
			prob++;
			System.out.println("------------------------------");
			System.out.println("Solucion "+prob+": ");
			mostrartablero(reina,tablero);
		}else{
			//Caso recursivo
			//Buscamos en la fila correspondiente si hay un posible lugar donde colocar una reina
			for(i=0;i<tablero.length;i++){
				if(!tablero[npiezas][i]){
					//Si encuentra una casilla libre la colocamos y actualizamos el tablero
					reina[npiezas][0]=npiezas;
					reina[npiezas][1]=i;
					actualizartablero(reina,tablero,npiezas);
					//Buscamos una posicion libre en la siguiente fila
					tablero(reina,npiezas+1,tablero);
					//Y quitamos la reina para comprobar la siguiente posibilidad
					reina[npiezas][0]=9;
					reina[npiezas][1]=9;
					actualizartablero(reina,tablero,npiezas);
				}
			}
		}
	}
	
	public static void actualizartablero(int[][] reina,boolean tablero[][],int nreinas){
		inicializar(tablero);
		int i,j,k;
		for (i = 0; i < reina.length; i++) {
			for (j = 0; j < reina.length; j++) {
				for (k = 0; k < nreinas+1; k++) {
					if (reina[k][0]!=9) {
						if (Math.abs(i - reina[k][0]) == Math.abs(j- reina[k][1])|| (reina[k][0] == i || reina[k][1] == j)) {
							tablero[i][j]=true;
						}
					} 
				}
			}
		}
	}
	
	public static void inicializar(boolean[][] tablero){
		int i,j;
		for(i=0;i<tablero.length;i++){
			for(j=0;j<tablero.length;j++){
				tablero[i][j]=false;
			}
		}
	}
	
	public static void mostrartablero(int[][] reina,boolean tablero[][]){
		String tablerom[][]=new String[8][8];
		int i,j,k;
		for(i=0;i<tablerom.length;i++){
			for(j=0;j<tablerom.length;j++){
				tablerom[i][j]="* ";
			}
		}
		
		for(k=0;k<reina.length;k++){
			for(i=0;i<tablerom.length;i++){
				for(j=0;j<tablerom.length;j++){
				  if(reina[k][0]==i && reina[k][1]==j && reina[k][0]!=9){
					  tablerom[i][j]="R ";
				  }
				}
			}
		}
		
		for(i=0;i<tablerom.length;i++){
			for(j=0;j<tablerom.length;j++){
				System.out.print(tablerom[i][j]);
			}
			System.out.println();
		}
	}
}