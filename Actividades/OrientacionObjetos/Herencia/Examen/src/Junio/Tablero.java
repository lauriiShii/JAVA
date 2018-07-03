package Junio;

import java.util.Arrays;
import java.util.Random;

public class Tablero implements Cloneable {
	
	/**ATRIBUTOS**/
	Barco[][] barcos;
	
	
	/**CONSTRUCTOR**/
	Tablero(){
		barcos = new Barco [Constantes.TAMANIOTABLETO][Constantes.TAMANIOTABLETO];
		crear();
	}
	
	/**CLON**/
	public Object clone(){
		int i,j;
		Tablero clonado;

		try {
			clonado=(Tablero)super.clone();
			clonado.barcos=barcos.clone();
			
			for(i = 0; i<Constantes.TAMANIOTABLETO; i++){
				for(j = 0; j<Constantes.TAMANIOTABLETO; j++)
					if(barcos[i][j]!=null)
						clonado.barcos[i][j]=(Barco)barcos[i][j].clone();
			}
		
		} catch (CloneNotSupportedException e) {
			clonado=null;
		}
	
		return clonado;		
	}
	
	/**EQUALS**/
	public boolean equals(Object o) {
		boolean resultado=false;
		
		if(o instanceof Tablero && Arrays.equals(barcos,((Tablero) o).barcos))
			resultado=true;
		
		return resultado;				
	}
	
	/**CREAR**/
	public void crear(){
		int i,j;
		
		for(i=0;i<Constantes.TAMANIOTABLETO;i++)
			for(j=0;j<Constantes.TAMANIOTABLETO;j++)
				barcos[i][j]=null;
	}
	
	/**MOSTRAR**/
	public void mostrar(){
		int i,j;
		
		for(i=0;i<Constantes.TAMANIOTABLETO;i++){
			System.out.println();
			for(j=0;j<Constantes.TAMANIOTABLETO;j++){
				if(barcos[i][j]==null)
					System.out.printf("-");
				else
					System.out.printf("X");
			}
		}
		
	}
	/**ANIADIR UN BARCO AL TABLERO**/
	private void aniadirBarco(Barco barco){
		int x,y;
		boolean correcto = false;
		Random rnd = new Random();
		
		do{
			//COORDENADAS ALEATORIAS
			x= rnd.nextInt(Constantes.TAMANIOTABLETO);
			y= rnd.nextInt(Constantes.TAMANIOTABLETO);
		
			//VERIFICAMOS QUE NO HAY BASCOS A LOS LADOS
			if(barcos[x][y]==null&&verificarPosicion(x,y) == false){
				barcos[x][y]=barco;
				correcto = true;
			}
			
			if(!correcto &&colocar()){
				marcar(barco);
				correcto =true;
			}
			
		}while(!correcto );
		
	}

	/**VERIFICAR POSICION**/
	public boolean verificarPosicion( int i, int j){
		int fila,columna,posX=0,posY=0;
		boolean negativo=false;
		
		//MIRAMOS LOS ALREDEDORES
		for(fila=-1;fila<2&&!negativo;fila++)
			for(columna=-1;columna<2&&!negativo;columna++){	
				posX=i+fila;
				posY= j+columna;
				
				// LIMITES DEL TABLERO
				if(posX >= 0 && posX < Constantes.TAMANIOTABLETO && posY >= 0 
						&& posY < Constantes.TAMANIOTABLETO &&!( posX == i && posY == j))
					if(barcos[posX][posY]!=null)
						negativo=true;
			}
		
		return negativo;
	}
	
	public boolean colocar(){

		return false;
	}
	
	public void marcar(Barco barco){

	}
}