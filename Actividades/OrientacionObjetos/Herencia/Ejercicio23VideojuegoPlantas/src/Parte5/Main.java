package Parte5;

public class Main {

	public static void main(String[] args) {
		//Apartado 2. COMPARACIONES.
		Plantas miPlanta, miPlanta2, miPlanta3, miPlanta4;
		Insectos miInsecto, miInsecto2, miInsecto3, miInsecto4;
		//Creamos un array seres vivos con la interfaz Reproducible.
		//Creamos un array hijos con interfaz Reproducible para almacenar los hijos resultantes del metodo reproducir.. 
		Reproducible hijos[];
		int i;
		
		miPlanta = new Plantas(2, false);
		miInsecto = new Insectos("Verde", 6, 2);
		miPlanta2 = new Plantas(1, true);
		miInsecto2 = new Insectos("Rojo", 6, 4);
		miPlanta3 = new Plantas(3, false);
		miInsecto3 = new Insectos("Azul", 8, 3);
		miInsecto4 = (Insectos) miInsecto2.clone();
		miPlanta4 = (Plantas) miPlanta2.clone();
		
		//Para meter objetos directamente en Array --> Object array[] = new Object[]{planta 1, insecto1, planta2, inseco2, planta3, insecto3...}
		//Introducimos las diferentes plantas e insecto en el array seresvivos.
		Reproducible seresvivos[] = new Reproducible[]{miPlanta,miInsecto,miPlanta2,miInsecto2,miPlanta3,miInsecto3,miPlanta4,miInsecto4};
		
		hijos = reproducirse(seresvivos);
		
		for (i = 0; i<hijos.length; i++){
			System.out.printf("El hijo: %s \nHa nacido de: %s\n", hijos[i].toString(), seresvivos[i].toString());
		}
		
		
		
	}
	
	public static void alimentar(Reproducible seresvivos[]){
		int i;
		/*Mediante este bucle, vamos comprobando mediante el else if si el ser vivo situado en la posicion i del array
		 * es un Insecto o Planta, si es Insecto se le da de comer una cantidad equivalente a i, y si es planta se le riega
		 * esa cantidad.*/
		for (i = 0; i<seresvivos.length; i++)
			if (seresvivos[i] instanceof Digiere)
				((Digiere)seresvivos[i]).comer(i);
				
			else if (seresvivos[i] instanceof Regable)
				((Regable)seresvivos[i]).regar(i);
	}			
	
	public static Reproducible[] reproducirse(Reproducible seresvivos[]){
		Reproducible hijos[] = new Reproducible[seresvivos.length];
		int i;
		
		/*Llamamos al metodo alimentar, para cambiar las caracteristicas de nuestros Insectos y Plantas que se vayan a reproducir*/
		alimentar(seresvivos);
		
		//Guardamos los Insectos y Plantas resultantes de la reproduccion en un nuevo array.
		for (i = 0; i<seresvivos.length; i++)
			hijos[i] = seresvivos[i].reproducirse();
			
		return hijos;
	}
}