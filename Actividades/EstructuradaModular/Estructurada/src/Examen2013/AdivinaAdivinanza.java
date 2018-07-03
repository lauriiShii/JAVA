package Examen2013;

import java.util.Random;
import java.util.Scanner;

public class AdivinaAdivinanza {

	public static void main(String[] args) {
		// Declaración de variables
		char caracter = ' ';
		Scanner teclado = new Scanner(System.in);
		Random juego = new Random();
		int tipo, acertar,orden,num_intentos = 0, aleatorio;
		int menor=98; //Unicode de 'b' 
		int mayor=122; //Unicode de 'z'
		boolean ganado = false;

		// Msg informativo al usuario sobre el juego
		System.out.println("Adivina adivinanza !!!! Juego para adivinar una letra o número ");
		System.out.println("Piense un número o letra entre los siguientes:  ");
		System.out.println("1.Número entre 0 y 9");
		System.out.println("2.Vocal minúscula");
		System.out.println("3.Consonante minúscula");
		System.out.println("Pulse una tecla para continuar...");
		teclado.nextLine();
		// Intentar averiguar el tipo. Máximo 2 intentos

		do {
			num_intentos++;
			tipo = juego.nextInt(3);
			switch (tipo) {
			case 0: // Número
				System.out.println("¿Es un número entre 0 y 9?");
				break;
			case 1: // Vocal
				System.out.println("¿Es una vocal?");
				break;
			case 2: // Consonante
				System.out.println("¿Es una consonante?");
				break;
			}
			do { // Repetir hasta que el usuario introduzca un 1 o un 2
				System.out.print(" 1.Sí 2.No");
				acertar = teclado.nextInt();
			} while (acertar != 1 && acertar != 2);
			if (acertar == 1)
				ganado = true;
		} while (!ganado && num_intentos < 2);
		if (!ganado)
			System.out.println("Fin del juego. He perdido...");
		else {
			System.out.println("Continuamos jugando...");
			num_intentos = 0;
			ganado = false;
			switch (tipo) {
			case 0: // Número del 0 al 9: máximo 3 intentos
				do {
					num_intentos++;
					aleatorio = juego.nextInt(10);
					System.out.printf("%n¿Es el número %d?", aleatorio);
					do { // Repetir hasta que el usuario introduzca un 1 o un 2
						System.out.print(" 1.Sí 2.No");
						acertar = teclado.nextInt();
					} while (acertar != 1 && acertar != 2);
					if (acertar == 1)
						ganado = true;
				} while (!ganado && num_intentos < 3);
				break;
			case 1: // Vocal: máximo 2 intentos
				do {
					num_intentos++;
					aleatorio = juego.nextInt(5);
					switch (aleatorio) {
					case 0: // 'a'
						caracter = 'a';
						break;
					case 1: // 'e'
						caracter = 'e';
						break;
					case 2: // 'i'
						caracter = 'i';
						break;
					case 3: // 'o'
						caracter = 'o';
						break;
					case 4: // 'u'
						caracter = 'u';
						break;
					}
					System.out.printf("%n¿Es la vocal %c?", caracter);
					do { // Repetir hasta que el usuario introduzca un 1 o un 2
						System.out.print(" 1.Sí 2.No");
						acertar = teclado.nextInt();
					} while (acertar != 1 && acertar != 2);
					if (acertar == 1)
						ganado = true;
				} while (!ganado && num_intentos < 2);
				break;
			case 2: /* Consonante: máximo 5 intentos. El usuario ayuda al
					 * programa diciendo si la consonante es mayor o menor según
					 * el orden alfabético
					 */
				do {
					num_intentos++;
					do { //Repetir el aleatorio si sale una vocal
						aleatorio = juego.nextInt(mayor - menor + 1) + menor;
						caracter=(char)aleatorio;
					} while (caracter=='e' || caracter=='i' || caracter=='o' || caracter=='u');
					System.out.printf("%n¿Es la consonante %c?", caracter);
					do { // Repetir hasta que el usuario introduzca un 1 o un 2
						System.out.print(" 1.Sí 2.No");
						acertar = teclado.nextInt();
					} while (acertar != 1 && acertar != 2);
					if (acertar == 1)
						ganado = true;
					else{//Se le pregunta al usuario si es mayor o menor alfabéticamente
						do { // Repetir hasta que el usuario introduzca un 1 o un 2
							System.out.println("La consonante que has pensado es en orden alfabético: 1.Mayor 2.Menor");
							orden = teclado.nextInt();
						} while (orden!=1 && orden!=2);
						if(orden==1)//Mayor: se cambia el límite inferior del rango del código Unicode para que busque en la parte superior
							menor=aleatorio+1;
						else //Menor: cambio el límite superior del rango del código Unicode para que busque en la mitad inferior
							mayor=aleatorio-1;
					}
				} while (!ganado && num_intentos < 5);
				break;
			}
			if (ganado)
				System.out.println("¡¡¡Acerté!!! He ganado el juego!!");
			else
				System.out.println("Fin del juego. He perdido...");
		}

		teclado.close();
	}
}