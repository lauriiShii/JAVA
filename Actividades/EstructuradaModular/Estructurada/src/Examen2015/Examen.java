package Examen2015;

import java.util.Random;
import java.util.Scanner;

public class Examen {

/**PEDIMOS DATOS*/
	//CONTROLAMOS QUE COMO MAXIMO LA PALABRA TENGA 20 CARACTERES
	
/**SE ELIGE COLORES DE IMPRESION(enum) DE FORMA ALEATRORIA*/
/**DEFINIMOS QUE HACE CADA OPCION*/
	//OPCION 1 -->COLORES NORMALES DE LA CONSOLA
	//OPCION 2 --> VERDES Y ROJOS
	//OPCION 3 --> FONDOS AZUL Y AMARILLOS CON LETRAS AMARILLAS Y AZULES RESPECTIVAMENTE
	
/**CREAMOS ESTRUCTURA POR OPCION*/
	//FILA 1 PALABRA COMPLETA
	//CENTRO
		//CARACTER IZQUIERDO
		//ESPACIOS
		//CARACTER DERECHO
	//FILA ULTIMA PALABRA DE ALREVES
	
	enum opcion{
		OPCION1, OPCION2, OPCION3
	}
	
	public static void main(String[] args) {
		
		/**VARIABLES Y OBJETOS*/
		Scanner teclado = new Scanner(System.in);
		Random rnd = new Random();
		String cadena;
		opcion opcion=null;
		int aleatorio,fila,j,k=1;
		char caracter;
		final String ESPACIO = " ";
		final String VERDE = "\u001B[32m";
		final String AMARILLO = "\u001B[33m";
		final String CELESTE = "\u001B[36m";
		final String ROJO = "\u001B[31m";
		final String FONDO_CELESTE = "\u001B[46m";
		final String FONDO_AMARILLO = "\u001B[43m";
		final String RESET = "\u001B[0m";
		final String BLANCO = "\u001B[37m";
		
		/**PEDIMOS DATOS*/
		//CONTROLAMOS QUE COMO MAXIMO LA PALABRA TENGA 20 CARACTERES
		do{
			System.out.print("Introduce una palabra por teclado.\nPalabra: ");
			cadena=teclado.nextLine();
			
			if(cadena.length() > 20)
				System.out.println("¡ERROR! La palabra no debe tener más de 20 caracteres");
			
		}while(cadena.length()>20);
		
		teclado.close();
		
		/**SE ELIGE COLORES DE IMPRESION(enum) DE FORMA ALEATORIA*/
		aleatorio=rnd.nextInt(3-1);
		
		if (aleatorio==1)
			opcion=opcion.OPCION1;
		else if (aleatorio==2)
			opcion=opcion.OPCION2;
		else
			opcion=opcion.OPCION3;
		
		/**DEFINIMOS QUE HACE CADA OPCION*/
		switch (opcion) {
		case OPCION1 : //OPCION 1 --> COLORES NORMALES DE LA CONSOLA
			
			//FILA 1 PALABRA COMPLETA
			System.out.print(cadena);
			
			for(fila=cadena.length()-1; fila>1; fila--){
				
				//SALTO DE LINEA
				System.out.println();
				
				//CARACTER IZQUIERDA
				caracter=cadena.charAt(cadena.length()-fila);
				System.out.print(caracter);
				
				//ESPACIOS
				for(j=cadena.length()-1; j>1; j--){
					System.out.print(ESPACIO);
				}
				
				//CARACTER DERECHA
				k++;
				caracter=cadena.charAt(cadena.length()-k);
				System.out.print(caracter);

			}
			//ULTIMA FILA
			if(cadena.length()>1)
				System.out.println();
				for(fila=1; fila<=cadena.length(); fila++){
					caracter=cadena.charAt(cadena.length()-fila);
					System.out.print(caracter);
				}

			break;
		case OPCION2 : //OPCION 2 --> VERDE Y ROJO
			
			//FILA 1 PALABRA COMPLETA
			System.out.print(ROJO+cadena+RESET);
			
			for(fila=cadena.length()-1; fila>1; fila--){
				
				//SALTO DE LINEA
				System.out.println();
				
				//CARACTER IZQUIERDA
				caracter=cadena.charAt(cadena.length()-fila);
				System.out.print(VERDE+caracter+RESET);
				
				//ESPACIOS
				for(j=cadena.length()-1; j>1; j--){
					System.out.print(ESPACIO);
				}
				
				//CARACTER DERECHA
				k++;
				caracter=cadena.charAt(cadena.length()-k);
				System.out.print(VERDE+caracter+RESET);

			}
			//ULTIMA FILA
			if(cadena.length()>1)
				System.out.println();
				for(fila=1; fila<=cadena.length(); fila++){
					caracter=cadena.charAt(cadena.length()-fila);
					System.out.print(ROJO+caracter+RESET);
				}
			


			break;
		case OPCION3 : //OPCION 3 --> FONDOS AZUL Y AMARILLOS CON LETRAS AMARILLAS Y AZULES RESPECTIVAMENTE
			
			//FILA 1 PALABRA COMPLETA
			System.out.print(FONDO_CELESTE+BLANCO+cadena+RESET);
			
			for(fila=cadena.length()-1; fila>1; fila--){
				
				//SALTO DE LINEA
				System.out.println();
				
				//CARACTER IZQUIERDA
				caracter=cadena.charAt(cadena.length()-fila);
				System.out.print(FONDO_AMARILLO+BLANCO+caracter+RESET);
				
				//ESPACIOS
				for(j=cadena.length()-1; j>1; j--){
					System.out.print(ESPACIO);
				}
				
				//CARACTER DERECHA
				k++;
				caracter=cadena.charAt(cadena.length()-k);
				System.out.print(FONDO_AMARILLO+BLANCO+caracter+RESET);

			}
			//ULTIMA FILA
			if(cadena.length()>1)
				System.out.println();
				for(fila=1; fila<=cadena.length(); fila++){
					caracter=cadena.charAt(cadena.length()-fila);
					System.out.print(FONDO_CELESTE+BLANCO+caracter+RESET);
				}
			
			break;
		}
		

	}

}
