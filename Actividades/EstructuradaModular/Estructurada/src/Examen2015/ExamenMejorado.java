package Examen2015;

import java.util.Random;
import java.util.Scanner;

public class ExamenMejorado {
	
	enum opcion{
		OPCION1, OPCION2, OPCION3
	}
	
	public static void main(String[] args) {
		
		/**VARIABLES Y OBJETOS*/
		Scanner teclado = new Scanner(System.in);
		Random rnd = new Random();
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
		String cadena,aleatorio1="",aleatorio2="";
		
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
		
		switch (aleatorio) {
		case 1:
			opcion=opcion.OPCION1;
			break;
		case 2:
			opcion=opcion.OPCION2;
			aleatorio1=ROJO;
			aleatorio2=VERDE;
			break;
		case 3:
			opcion=opcion.OPCION3;
			aleatorio1=AMARILLO+FONDO_CELESTE;
			aleatorio2=CELESTE+FONDO_AMARILLO;
			break;

		}	
		
		/**CREAMOS ESTRUCTURA*/
		
		System.out.println(aleatorio);
			
			//FILA 1 PALABRA COMPLETA
			System.out.printf("%s%s%s",aleatorio1, cadena, RESET);
			
			for(fila=cadena.length()-1; fila>1; fila--){
				
				//SALTO DE LINEA
				System.out.println();
				
				//CARACTER IZQUIERDA
				caracter=cadena.charAt(cadena.length()-fila);
				System.out.printf("%s%s%s",aleatorio2, caracter, RESET);
				
				//ESPACIOS
				for(j=cadena.length()-1; j>1; j--){
					System.out.print(ESPACIO);
				}
				
				//CARACTER DERECHA
				k++;
				caracter=cadena.charAt(cadena.length()-k);
				System.out.printf("%s%s%s",aleatorio2, caracter, RESET);

			}
			//ULTIMA FILA
			if(cadena.length()>1)
				System.out.println();
				for(fila=1; fila<=cadena.length(); fila++){
					caracter=cadena.charAt(cadena.length()-fila);
					System.out.printf("%s%s%s",aleatorio1, caracter, RESET);
				}

	}

}