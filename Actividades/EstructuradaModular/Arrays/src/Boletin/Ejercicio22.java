package Boletin;

public class Ejercicio22 {
	/**CAPICUA*/
	public static void main(String[] args) {
		
		/**DECLARAMOS VARIABLES Y OBJETOS*/
		int datos[][] = {{2,7,3},{5,1,9},{6,7,2}};
		//int datos [][] = {{5,8},{8,1}};
		//int datos [][] = {{1}};
		int i, j, k, l, aux [];
		boolean capicuo=false;
		
		/**MOSTRAMOS ARRAY*/
		System.out.println("MATRIZ INTRODUCIDA");
		for (i = 0; i < datos.length; i++) {
			for (j = 0; j < datos[i].length; j++) 
				System.out.print(datos [i][j]+"\t");
			System.out.println("");
		}
		
		/**DAMOS TAMAÑO A aux*/
		aux = new int [datos.length];
		
		/**EXTRAEMOS CADA FILA Y COMPROBAMOS*/
		for (k = 0; k < datos.length; k++) {
			for (l = 0; l < datos[k].length; l++) 
				aux [l] = datos [k][l];
			capicuo = capicua(aux, 0);
			if(capicuo == true)
				System.out.printf("La fila con indice %d, es  capicua.%n", k+1);
		}
		/**EXTRAEMOS CADA COLUMNA Y COMPROBAMOS*/
		for (k = 0; k < datos.length; k++) {
			for (l = 0; l < datos[k].length; l++) 
				aux [l] = datos [l][k];
			capicuo = capicua(aux, 0);
			if(capicuo == true)
				System.out.printf("La columna con indice %d, es  capicua.%n", k+1);
		}
		/**EXTRAEMOS DIAGONALES Y COMPROBAMOS*/
		//DIAGONAL PRINCIPAL
		for(k=0; k < datos.length; k++)
			for(l=0; l < datos[k].length; l++)
				if (k == l)
					 aux [l] = datos[l][k];
			capicuo = capicua(aux, 0);
		if(capicuo == true)
			System.out.println("La diagonal principal es  capicua.");
		
		//DIAGONAL DERECHA
		for(k=0; k < datos.length; k++)
			for(l=0; l < datos[k].length; l++)
				if(aux.length-1-k == l )
					aux[l] = datos[l][k];
		capicuo = capicua(aux, 0);
		if(capicuo == true)
			System.out.println("La diagonal secundaria es  capicua.");

	}
	
	public static boolean capicua(int aux[], int pos) {

		//CASO BASE, SI NO ENTRA EN NINGUN IF DA FALSO
		boolean resultado = false;

		/**COMPROBAMOS SI EL ARRARY ES CAPICUO*/
		// LLega a la mitad, entonces es capicUa (para saber cuando parar)
		if (aux.length / 2 == pos)// CASO BASE SI LLEGA A LA MITAD
			resultado = true;

		// COMPROBAMOS SI LA PRIMERA POSICION CORRESPONDE CON LA ÚLTIMA
		else if (aux[pos] == aux[aux.length - pos - 1])
			// Si se corresponden, volvemos a llamar a la función con los
			// siguientes paramétros
			resultado = capicua(aux, pos + 1);

		/**DEVOLVEMOS RESULTADO*/
		return resultado;
	}

}
