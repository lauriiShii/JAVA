package Examen2015;
import java.util.Random;

/**
 * PLANTEAMIENTO 
 * 1)Creamos la sopa de letras 
 * 1.1)Creamos matriz 16x16
 * 1.2)Creamos los datos de la sopa de letra con la funcion 
 * 1.1.1)Comprobamoslas palabras que contendra la sopa de letras 
 * 1.1.2)Rellenamos los huecos restantes con letras aleatorias 
 * 1.3)Mostramos la sopa de letras
 **/

public class SopaLetras {
	/** MAIN **/
	public static void main(String[] args) {

		// DECLARAMOS VARIABLES
		int N = 16;
		int i = 0, j = 0;
		String sopa[][];
		sopa = new String[N][N];// Inicializamos el objeto sopa (Array)
		String[] palabras = { "Programacion ", "BaseDeDatos ",
				"DesarrolloInterfaces ", "Marcas ", "Acceso A Datos ", "Fol",
				"Entornos", "Hlc", "Android", "Sistrmas", "Multihilo" };
		int posicion[][];
		posicion= new int[i][j]; //Inicialiamos posicion (Array donde i es fila y j columna)

		// MOSTRAMOS SOPA DE LETRAS (llamamos a la funcion crearSopaLetras)
		crearSopaLetras(N, sopa, i, j, palabras,posicion);

	}

	/** FUNCIONES **/
	// FUNCION QUE CREA UNA MATRIZ 17X17
	//Todos los parametros son de entrada
	private static void crearSopaLetras(int N, String sopa[][], int i,
			int j, String palabras[], int posicion[][]){
		
		//MOSTRAMOS SOPA DE LETRAS
		System.out.println(mostrarSopaLetras(N, sopa, i, j, palabras));
		
		//INTRODUCIMOS LAS PALABRAS QUE DEBEN CUMPLIR UN PATRON
		
	}
	
	
	// FUNCION QUE MUESTRA LA SOPA DE LETRAS
	// Todos los parametros que se pasan en esta funcion son de entrada
	private static String mostrarSopaLetras(int N, String sopa[][], int i,
			int j, String palabras[]) {

		// DECLARAMOS VARIABLES
		String valores = "";
                  
		// RELLENAMOS LA MATRIZ ()
		for (i = 0; i < N; i++) {
			for (j = 0; j < N; j++) {
				sopa[i][j] = rellenarSopaLetras(i,j, N);
			}
		}

		// CREAMOS MATRIZ PARA VISUALIZARLA
		for (i = 0; i < N; i++) {
			for (j = 0; j < N; j++) {
				valores += sopa[i][j];
			}
			valores += "\n";
		}
		
		return valores;
	}

	// FUNCION QUE RELLENA LA MATRIZ SOPA
	//Todos los parametros son de entrada
	private static String rellenarSopaLetras(int i, int j,int N) {

		// DECLARAMOS VARIABLES Y OBJETO RANDOM
		String caracter = "", cad="",letra;
		Random aleatorio = new Random();
		letra = aleatorio.next(cad.matches("[a-zA-ZñÑ]{1}"));
		
		//NUMEROS DE FILAS Y COLUMNAS
		if (j==0&& i>=0)//Columna
			caracter=i+" ";
		else if (i==1 && j==N)//fila
			caracter=j+" ";
		//else
			//caracter=letra;
	
		return caracter;
	}
}
