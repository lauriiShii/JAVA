package Junio;

public class Comportamiento {

	public static void main(String[] args) {
		
		Portaaviones Portaavion1 = new Portaaviones("Poortavion1", 39);
		Velero Velero1 = new Velero("Velero1", 30, 3);
		Velero Velero2 = new Velero("Velero2", 25, 3);
		Velero Velero3 = new Velero("Velero3", 18, 2);
		Velero Velero4 = new Velero("Velero4", 5, 1);
		Velero Velero5 = new Velero("Velero5", 3, 1);

		Tamanio datos[] = new Tamanio[] { Portaavion1, Velero1, Velero2, Velero3, Velero4, Velero5 };

		metodoInterfaz(datos);
	}

	public static void metodoInterfaz(Tamanio datos[]) {
		int i;
		for (i = 0; i < datos.length; i++) {
				datos[i].numCasillas();
			if (datos[i] instanceof Portador)
				((Portador) datos[i]).aniadirAvion("Elisa");
			if (datos[i] instanceof Velas)
				((Velas) datos[i]).numVelas();
		}
	}

}
