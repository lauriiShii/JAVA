package Boletin;

public class Ejercicio13 {
	/**Copia un array tridimensional de enteros a otro de mayor tamaño.*/
	public static void main(String[] args) {
		
		/**DECLARACION VARIABLES Y OBJETOS*/
		int datos [][][] = {{{1,2,3},{1,2,3}},{{1,2,3},{1,2,3}},{{1,2,3},{1,2,3}}}, copiaDatos [][][], x, y, z;
		
		/**MOSTRAMOS ARRAY ORIGINAL*/
		System.out.println("ARRAY ORIGINAL:");
		for( x = 0; x < datos.length; x++) 
			for( y = 0; y < datos [x].length; y++) 
				for( z = 0; z < datos[x][y].length; z++)
					System.out.printf("En %d, %d, %d se encuenta el elemento : %d%n ", x, y, z, datos [x][y][z]); 
		
		/**DAMOS UN TAMAÑO MAYOR QUE datos A copiaDatos*/
		copiaDatos = new int [datos.length+1][datos[0].length+1][datos[0][0].length+1];
		
		/**COPIAMOS ARRAY*/
		//RECORREMOS datos Y COPIAMOS CADA DATO EN copiaDatos
		for( x = 0; x < datos.length; x++) 
			for( y = 0; y < datos [x].length; y++) 
				for( z = 0; z < datos[x][y].length; z++)
					copiaDatos [x][y][z] = datos [x][y][z];
		
		/**MOSTRAMOS datosCopiados*/
		System.out.println("\nCOPIA ARRAY");
		for( x = 0; x < copiaDatos.length; x++) 
			for( y = 0; y < copiaDatos [x].length; y++) 
				for( z = 0; z < copiaDatos[x][y].length; z++)
					System.out.printf("En %d, %d, %d se encuenta el elemento : %d%n ", x, y, z, copiaDatos [x][y][z]);
		
		

	}

}
