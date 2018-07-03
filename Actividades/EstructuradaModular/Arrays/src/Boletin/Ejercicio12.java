package Boletin;

public class Ejercicio12 {
	/**Dado un array de tres dimensiones de números decimales, mostrar cuál es el elemento mayor y
	su posición.*/
	public static void main(String[] args) {
		
		/**DECLARAMOS VARIABLES Y OBJETOS*/
		int datos [][][] = {{{1,2,3},{4,5,6}},{{5,6,7,8},{2,3}},{{0,0,2,3},{0,0,0,0}}};
		int x,y,z, numeroMayor=0, posX=0, posY=0, posZ=0;
		
		/**BUSCAMOS EL MAYOR DATO*/
		//RECORREMOS EL ARRAY
		for( x = 0; x < datos.length; x++) 
			for( y = 0; y < datos [x].length; y++) 
				for( z = 0; z < datos[x][y].length; z++){
					//ALMACENAMOS CADA NUMERO MAYOR QUE ENCONTRAMOS
					if (datos[x][y][z] > numeroMayor){
						numeroMayor = datos[x][y][z];
						//GUARDAMOS LA POSICION DEL NUMERO
						posX = x;
						posY = y;
						posZ = z;
					} 
				}
		
		//MOSTRAMOS
		System.out.printf("En %d, %d, %d se encuenta el elemento : %d%n ", posX, posY, posZ, numeroMayor); 

	}

}
