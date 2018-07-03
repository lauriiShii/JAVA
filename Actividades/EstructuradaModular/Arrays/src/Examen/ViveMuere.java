package Examen;

import java.util.Arrays;

//1. IMPRIMO ARRAY INICIAL DE VIVOS Y MUERTOS
//2. ¿QUIEN VIVE Y QUIEN MUERE?
	//2.1 UNA CELULA VIVA (Sobre el array inicial todos los casos no el que va siendo resultante)
		//2.1.1 MUERE SI EN SUS CELULAS CONTINGENTES HAY UNA CANTIDAD MENOR DEL MIN DE CELULAS VIVAS
		//2.1.2 VIVE SI EN SUS CELULAS CONTINGENTES HAY UNA CANTIDAD  MIN Y UN MAX DE CELULAS VIVAS
		//2.1.3 RESUCITA SI EN SUS CELULAS CONTINGENTES HAY UNA CANTIDAD MIN Y UN MAX  DE CELULAS VIVAS
//3. IMPRIMIMOS EL ARRAY RESULTANTE DE LAS PRUEBAS
	//3.1 SI EL ARRAY RESULTANTE ES IGUAL AL ANTERIOR O HA ALCANZADO LOS CICLOS MAX, EL PROGRAMA FINALIZA
	//3.2 SINO SE IMPRIME

public class ViveMuere {

	/** VARIABLES ESTATICAS */
	static final String ESPACIO = " ";
	static final String RESET = "\u001B[0m";
	static final String FONDO_NEGRO = "\u001B[40m";
	static final String FONDO_CELESTE = "\u001B[46m";
	static final String CV = ESPACIO + RESET + FONDO_CELESTE + ESPACIO + ESPACIO + RESET;
	static final String CM = ESPACIO + RESET + FONDO_NEGRO + ESPACIO + ESPACIO + RESET;

	/** MAIN */
	public static void main(String[] args) {

		//DECLARAMOS VARIABLES Y OBJETOS
		boolean celulas1[][] = { { true, false, false, false, true }, { false, false, false, true, false },
				{ true, false, true, true, false }, { false, true, false, false, false },
				{ true, true, false, false, false } };
		boolean celulas2[][] = { { false, true, false, false, true }, { true, true, false, false, true },
				{ false, false, false, true, true }, { true, true, false, false, false },
				{ true, true, false, false, false } };

		// LLAMADA A LA FUNCION vivirMorir
		vivirMorir(celulas1, 2, 5, 3, 6, 9);
		vivirMorir(celulas2, 2, 5, 2, 6, 9);

	}

	/** FUNCION MOSTRAR */
	public static void mostrar(boolean[][] celulas) {
		int i, j;

		for (i = 0; i < celulas.length; i++) {
			for (j = 0; j < celulas[i].length; j++) {
				if (celulas[i][j] == true)
					System.out.print(CV + ESPACIO + ESPACIO);
				else
					System.out.print(CM + ESPACIO + ESPACIO);
			}
			System.out.println(ESPACIO);
			System.out.println(ESPACIO);
		}
		System.out.println(ESPACIO);
	}
	/**FUNCION QUE DETERMINA EL ESTADO AL QUE PASA UNA CELULA*/
	public static void estado(boolean celulas[][], boolean aux[][], int j, int i, int min, int max) {
		int vivasMuertas = 0;
		
		//ESQUINA SUPERIOR IZQUIERDA
		if(i==0&&j==0){
			if(celulas[j+1][i]==true)
				vivasMuertas++;
			if(celulas[j+1][i+1]==true)
				vivasMuertas++;
			if(celulas[j][i+1]==true)
				vivasMuertas++;
		}
		//ESQUINA SUPERIOR DERECHA
		else if(i==celulas.length-1&&j==0){
			if(celulas[j][i-1]==true)
				vivasMuertas++;
			if(celulas[j+1][i]==true)
				vivasMuertas++;
			if(celulas[j+1][i-1]==true)
				vivasMuertas++;
		}
		//ESQUINA INFERIOR IZQUIERDA
		else if(j==celulas.length-1&&i==0){
			if(celulas[j-1][i]==true)
				vivasMuertas++;
			if(celulas[j][i+1]==true)
				vivasMuertas++;
			if(celulas[j-1][i+1]==true)
				vivasMuertas++;
		}
		//ESQUINA INFERIOR DERECHA
		else if(j==celulas.length-1&&i==celulas.length-1){
			if(celulas[j-1][i]==true)
				vivasMuertas++;
			if(celulas[j-1][i-1]==true)
				vivasMuertas++;
			if(celulas[j][i-1]==true)
				vivasMuertas++;
		}
		//BORDE SUPERIOR
		else if(j==0&&(i!=0&&i!=celulas.length-1)){
			if(celulas[j][i-1]==true)
				vivasMuertas++;
			if(celulas[j][i+1]==true)
				vivasMuertas++;
			if(celulas[j+1][i]==true)
				vivasMuertas++;
			if(celulas[j+1][i-1]==true)
				vivasMuertas++;
			if(celulas[j+1][i+1]==true)
				vivasMuertas++;
			
		}
		//BORDE IZQUIERDO
		else if(i==0&&(j!=0&&j!=celulas.length-1)){
			if(celulas[j-1][i+1]==true)
				vivasMuertas++;
			if(celulas[j][i+1]==true)
				vivasMuertas++;
			if(celulas[j+1][i+1]==true)
				vivasMuertas++;
			if(celulas[j+1][i]==true)
				vivasMuertas++;
			if(celulas[j-1][i]==true)
				vivasMuertas++;
			
		}
		//BORDE INFERIOR
		else if(j==celulas.length-1&&(i!=0&&i!=celulas.length-1)){
			if(celulas[j][i-1]==true)
				vivasMuertas++;
			if(celulas[j][i+1]==true)
				vivasMuertas++;
			if(celulas[j-1][i-1]==true)
				vivasMuertas++;
			if(celulas[j-1][i]==true)
				vivasMuertas++;
			if(celulas[j-1][i+1]==true)
				vivasMuertas++;
		}
		//BORDE DERECHO
		else if(i==celulas.length-1&&(j!=0&&j!=celulas.length-1)){
			if(celulas[j-1][i]==true)
				vivasMuertas++;
			if(celulas[j+1][i]==true)
				vivasMuertas++;
			if(celulas[j][i-1]==true)
				vivasMuertas++;
			if(celulas[j-1][i-1]==true)
				vivasMuertas++;
			if(celulas[j+1][i-1]==true)
				vivasMuertas++;
		}
		//ZONA CENTRICA
		else{
			if(celulas[j][i+1]==true)
				vivasMuertas++;
			if(celulas[j][i-1]==true)
				vivasMuertas++;
			if(celulas[j+1][i]==true)
				vivasMuertas++;
			if(celulas[j-1][i]==true)
				vivasMuertas++;
			if(celulas[j+1][i+1]==true)
				vivasMuertas++;
			if(celulas[j-1][i+1]==true)
				vivasMuertas++;
			if(celulas[j-1][i-1]==true)
				vivasMuertas++;
			if(celulas[j+1][i-1]==true)
				vivasMuertas++;
		}
		// SI ESTAN VIVAS SON TRUE, SI ESTAN MUERTAS FALSE
		if (min < vivasMuertas && vivasMuertas < max)
			aux[j][i] = true;
		else
			aux[j][i] = false;

	}
	
	/***FUNCION DIOS --> HACE VIVIR Y MORIR LAS CELULAS*/
	public static boolean[][] vivirMorir(boolean celulas[][], int minv, int maxv, int minm, int maxm, int ciclos) {

		boolean aux[][] = new boolean[celulas.length][celulas.length];
		boolean nuevasCelulas[][] = new boolean[aux.length][aux.length];
		boolean salir = false;
		int j, k, h, i, filasIguales;
		
		//COPIAMNOS CELULAS EN UN ARRAY AUXILIAR
		for (j = 0; j < celulas.length; j++) {// La copia del array
			for (k = 0; k < celulas[j].length; k++)
				aux[j][k] = celulas[j][k];
		}
		
		//EJECUTAMOS 9 VECES 
		for (h = 1; h <= ciclos && salir == false; h++) {
			
			//MOSTRAMOS INSTANTE EN EL QUE NOS ENCONTRAMOS
			System.out.println("Instante " + h);
			
			//MOSTRAMOS CELULAS
			mostrar(aux);
			
			//RECORREMOS EL ARRAY ANALIZANDO CADA POSICION
			for (j = 0; j < aux.length; j++)
				for (i = 0; i < aux[j].length; i++) {

					//SI ES UNA CELULA VIVA
					if (aux[j][i] == true)
						//¿¿VIVIRA??
						estado(aux, nuevasCelulas, j, i, minv, maxv);
					// SI ES UNA CELULA MUERTA
					 else 
						 //¿¿RESUCITARA O SEGUIRA MUERTA??
						estado(aux, nuevasCelulas, j, i, minm, maxm);
				}
			
			//COMPARAMOS eL ARRAY AUXILIAR CON NUEVAS CELULAS OPTENIDAS CON EL ESTADO
			filasIguales = 0;
			for (j = 0; j < aux.length - 1; j++)
				if (Arrays.equals(aux[j], nuevasCelulas[j]))
					filasIguales++;
			
			//SI SON IGUALES SE ACABA LA EJECUCION
			if (filasIguales == aux.length - 1)
				salir = true;
			
			//SINO COPIAMOS LAS NUEVAS CELULAS EN AUX
			else 
				for (j = 0; j < nuevasCelulas.length; j++)
					for (k = 0; k < nuevasCelulas[j].length; k++)
						aux[j][k] = nuevasCelulas[j][k];


		}
		return aux;
	}

}
