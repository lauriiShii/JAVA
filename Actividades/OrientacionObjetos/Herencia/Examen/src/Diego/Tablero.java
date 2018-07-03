package barco_J16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Tablero {
	private Barco[][] barcos = new Barco[Constante.MAXTABLE][Constante.MAXTABLE];
	private ArrayList<Barco> casillaValida = new ArrayList<Barco>(); 
	
	Tablero(){
		iniciarTablero();
	}
	
	public boolean equals(Object obj) {
		boolean resultado=false;
		
		if(obj instanceof Tablero && Arrays.equals(barcos,((Tablero) obj).barcos))
			resultado=true;
		
		return resultado;				
	}
	
	public Object clone(){
		byte i,j;
		Tablero clonado;

		try {
			clonado=(Tablero)super.clone();
			clonado.barcos=barcos.clone();
			
			for(i=0; i<Constante.MAXTABLE; i++){
				clonado.barcos[i]=barcos[i].clone();
				for(j=0; j<Constante.MAXTABLE; j++)
					if(barcos[i][j]!=null)
						clonado.barcos[i][j]=(Barco)barcos[i][j].clone();
			}
		
		} catch (CloneNotSupportedException e) {
			clonado=null;
		}
	
		return clonado;		
	}
	
	//METODOS DE MODULAR
	
	public void mostrarTablero(){
		byte i,j;
		
		for(i=0;i<Constante.MAXTABLE;i++){
			System.out.println();
			for(j=0;j<Constante.MAXTABLE;j++){
				if(barcos[i][j]==null)
					System.out.printf("|   |");
				else
					System.out.printf("| x |");
			}
		}
		
	}
	
	private void anhadirBarco(Barco barco){ //Añadimos el barco en el tablero
		byte x,y;
		boolean ok=false;
		Random rnd = new Random();
		
		do{
			x=(byte) rnd.nextInt(Constante.MAXTABLE);//Creamos las coordenadas al azar.
			y=(byte) rnd.nextInt(Constante.MAXTABLE);
		
			if(barcos[x][y]==null&&certificarZona(x,y)==false){//Saber si esta nulo y mirar su alrededor
				barcos[x][y]=barco;
				ok=true;
			}
			
			if(!ok&&colocar(x,y,(byte) barco.eslora)){//Coloca el barco cuando es seguro ponerlo por su eslora
				marcar(barco);
				ok=true;
			}
			
		}while(!ok);
		
	}
	
	//METODOS DE UTILIDAD
	
	public void iniciarTablero(){
		byte i,j;
		
		for(i=0;i<Constante.MAXTABLE;i++)
			for(j=0;j<Constante.MAXTABLE;j++)
				barcos[i][j]=null;
	}

	public boolean certificarZona( byte i, byte j){//Verificar el vacio del alredeor de la casilla.
		byte fila,columna,posX=0,posY=0;
		boolean negativo=false;
		
		for(fila=-1;fila<2&&!negativo;fila++)//Lectura del alrededor
			for(columna=-1;columna<2&&!negativo;columna++){	
				posX=(byte) (i+fila);//Se le pasa las coordenadas
				posY= (byte) (j+columna);
				
				if(posX>=0&&posX<Constante.MAXTABLE&&posY>=0&&posY<Constante.MAXTABLE&&!(posX==i&&posY==j))//Limite del marco
					if(barcos[posX][posY]!=null)
						negativo=true;
			}
		
		return negativo;
	}
	
	public boolean colocar(byte i, byte j,byte eslora){
		byte fila,columna,posX=0,posY=0;
		boolean exit=false;
		
		for(fila=-1;fila<2&&!exit;fila++)//Lectura del alrededor
			for(columna=-1;columna<2&&!exit;columna++){	
				posX=(byte) (i+fila);//Se le pasa las coordenadas
				posY= (byte) (j+columna);
				
				if(!exit&&posX>=0&&posX<Constante.MAXTABLE&&posY>=0&&posY<Constante.MAXTABLE&&!(posX==i&&posY==j))//Limite del marco
					if(barcos[posX][posY]!=null&&recursi(posX,posY,fila,columna,eslora)){
						exit=true;
					}else
						casillaValida.clear();
			}
		
		return exit;
	}
	
	public boolean recursi(byte fila, byte columna, byte avanceX, byte avanceY,byte eslora){
		boolean result=false;
		
		if(fila>=0&&fila<Constante.MAXTABLE&&columna>=0&columna<Constante.MAXTABLE&&barcos[fila][columna]==null){
			if(eslora==0){//Caso base: eslora cero
				result=true;
			}else{
				if(barcos[fila][columna]==null&&certificarZona(fila,columna)==false){//Si la casilla es nula
					casillaValida.add(barcos[fila][columna]);//Se guarda
					result=recursi((byte)(fila+avanceX),(byte)(columna+avanceY),avanceX,avanceY,(byte)(eslora-1));////Avanzar en la misma direccion de busqueda quitanto una de eslora por el tamnaño del barco
				}else
					result=false;
			}
		}else
			result=false;
		
		return result;
	}
	
	
	public void marcar(Barco barco){
		byte i,j;
		
		for(i=0;i<Constante.MAXTABLE;i++)
			for(j=0;j<Constante.MAXTABLE;j++)
				if(casillaValida.contains(barcos[i][j]))
						barcos[i][j]=barco;
	}
	
}
