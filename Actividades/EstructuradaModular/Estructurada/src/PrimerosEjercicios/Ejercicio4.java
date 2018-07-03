package PrimerosEjercicios;
import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		/* Dada una nota, que te muestre lo siguiente: (hacerlo con anidación y con switch)
			• 0, 1, 2: Muy deficiente
			• 3, 4: Insuficiente
			• 5: Suficiente
			• 6: Bien
			• 7, 8: Notable
			• 9, 10: Sobresaliente*/
		
		int nota;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime tu nota: ");
		nota = teclado.nextInt();
		
		//Anidacion
		if(nota<=10 && nota>=9)
			System.out.println("Sobresaliente");
		else if(nota<=8 && nota>=7)
			System.out.println("Notable");
		else if(nota==6)
			System.out.println("Bien");
		else if(nota==5)
			System.out.println("Suficiente");
		else if(nota<=4 && nota>=3)
			System.out.println("Insuficiente");
		else if(nota<=2 && nota>=0)
			System.out.println("Muy Insuficiente");
		else //if(nota<0 || nota>10)
			System.out.println("La nota debe estar entre 0 y 10");
		
		
		//Switch 
		switch(nota){
		case 10: 
		case 9:
			System.out.println("Sobresaliente");
			break;
		case 8:
		case 7:
			System.out.println("Notable");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 4:
		case 3:
			System.out.println("Insuficiente");
			break;
		case 2:
		case 1:
		case 0:
			System.out.println("Muy Insuficiente");
			break;
		default:
				System.out.println("La nota debe estar entre 0 y 10");
		}
		
		teclado.close();

	}

}
