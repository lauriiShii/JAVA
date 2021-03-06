package Boletin;

import Teclado.Rango;
import Teclado.Teclado;

public class Ejercicio20 {
	/**CONSTRUCTOR DE FRASES*/
	public static void main(String[] args) {
		
		/**DECLARACION DE VARIABLES*/
		byte opcionMenu, opcionSubmenu;
		boolean salir = true;
		//String palabras [][] = {{"Papa", "Mama", "Abuelo"},{"si","no","te"},{"odia","ama","rega�a"}};
		String  palabra [], palabras [][], cadena = "Mama,Papa,Abuelo,si,no,te,odia,ama,rega�a";
		int i, j, k, numPalabra = 0;
		
		/**METEMOS DATOS EN palabras CON SPLIT*/
		palabra = cadena.split(",");
		palabras = new String [3][3];
		
		for (i = 0; i < palabras.length; i++)
			for (j = 0; j < palabras[i].length; j++){ 
				palabras [i][j] = palabra [numPalabra];
				numPalabra++;
			}
		
		/**MOSTRAR ARRAY*/
		for (j = 0; j < palabras.length; j++) {
			for (k = 0; k < palabras[j].length; k++) 
				System.out.print(palabras [j][k]+" ");
			System.out.println("");
		}
		
		/**MENU*/
		do {
			opcionMenu = Teclado.numeroByte("Introduce una de las siguientes opciones:\n1- Impares o pares\n2- Busqueda\n3- Salir", 1, 3, Rango.INCLUIDO_MIN_MAX);
			
			switch (opcionMenu) {
			/**IMPARES O PARES --> SUBMENU*/
			case 1:
				opcionSubmenu = Teclado.numeroByte("Introduce una de las siguientes opciones:\n1- Impares\n2- Pares\n3- Salir", 1, 3, Rango.INCLUIDO_MIN_MAX);
				
				switch (opcionSubmenu) {
				
				/**IMPAR*/
				case 1:
					parImpar(palabras,opcionSubmenu); 
					break;
				
				/**PAR*/
				case 2:
					parImpar(palabras,opcionSubmenu);
					break;
					
				case 3:
					System.out.println("Ha escojido volver al men� principal");
					break;
				}
				
				break;
			/**BUSQUEDA*/
			case 2:
				busqueda(palabras);
				break;
			/**SALIR*/
			case 3:
				System.out.println("Ha escojido salir del programa. Le esperamos pronto :)");
				salir = false;
				break;
			}
			
		} while (salir == true);
	}

	public static void parImpar (String palabras [][], int opcion){
		int i, j;
		String frase="";
		
		if(opcion == 1){
			//Recorrer matr�z 
			for (i=0; i<palabras.length; i++)
				for (j=0; j<palabras.length; j++)
					//Si la suma de la fila y columna es impar, guardar palabra en cadena
					if ((i+j)%2!=0)
						frase+=palabras[i][j]+" ";

			//Imprimir cadena resultante
			System.out.printf("%nRESULTADO: La cadena resultante de las posiciones impares es: %s %n%n", frase);
		}
		
		else if (opcion == 2){ 
			//Recorrer matr�z
			for (i=0; i<palabras.length; i++)
				for (j=0; j<palabras.length; j++)
					//Si la suma de la fila y columna es mpar, guardar palabra en cadena
					if ((i+j)%2==0)
						frase+=" "+palabras[i][j];
			//Imprimir cadena resultante
			System.out.printf("%nRESULTADO: La cadena resultante de las posiciones pares es: %s %n%n", frase);
		}
	}
	
	public static void busqueda (String palabras [][]){
		int i, j, k;
		String cad="";
		String letra;
		
		letra = Teclado.cadena("Introduce una letra: (Recuerda que una vocal acentuada no es lo mismo que no acentuada)", "[a-zA-Z������������]{1}").toLowerCase();
		
		//Recorre la matriz
		for (i=0; i<palabras.length; i++){
			k=0;
			//Recorre filas
			for (j=0; j<palabras.length; j++){
				//Si contiene el car�cter a buscar
				if (palabras[i][j].toLowerCase().trim().contains(letra)) {
					k++; //Aumentar contador.
					cad+=palabras[i][j]+" "; //Guarda en una cadena la palabra.
				}
			}
			
			//Imprimir las palabras que contiene el car�cter en la fila I.
			if (k > 0)
			System.out.printf("RESULTADO: En la FILA %d hay %d palabras con la letras %s %n%n", i, k, letra);
			
			k=0;
			//Recorrer columnas
			for (j=0; j<palabras.length; j++){
				//Si contiene el car�cter a buscar
				if (palabras[j][i].toLowerCase().trim().contains(letra)) {
					k++; //Aumentar contador.
				}
			}
			//Imprimir las palabras que contiene el car�cter en la columna I.
			if(k > 0)
			System.out.printf("RESULTADO: En la COLUMNA %d hay %d palabras con la letra %s%n%n", i, k, letra);
		}
		
		//Imprimir la cadena resultate, con el car�cter indicado cambiado a *
		System.out.printf("RESULTADO: La cadena resultante de las palabras con la letra %s es: %s%n%n", letra, cad.toLowerCase().replaceAll(letra, "*"));

	}

}
