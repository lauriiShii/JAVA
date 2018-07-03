package barco_J16;

import barco_J16.Portaavion.Avion;

public class JuegoBarcos {

	public static void main(String[] args) {
		Tablero tablero = null,tablero2;
		Portaavion porta1;
		Avion a;
		Velero v1,v2,v3,v4,v5;
	
		
		//porta1 = new Portaavion("Portaavion1", 39,Anew Avion("Avion1"));//Portaaviones
		//porta1.anadirAvion(new Avion("Avion1"));
		
		
		v1 = new Velero("Velero1", 30, 3);//Veleros
		v2 = new Velero("Velero2", 25, 3);
		v3 = new Velero("Velero3", 18, 2);
		v4 = new Velero("Velero4", 5, 1);
		v5 = new Velero("Velero5", 3, 1);
		
		tablero.iniciarTablero();
		
		tablero.mostrarTablero();
		//tablero2=(Tablero) tablero.clone();
		

	}

}
