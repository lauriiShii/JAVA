import java.util.ArrayList;
import Teclado.Teclado;
import Teclado.Rango;

public class Menu {
	
	public static void main(String[] args) {
		
		/**OBJETOS Y ATRIBUTOS**/
		final byte EMPY=3,EXIT=7;
		byte numMenu;
		boolean exit=false;
		String value;
		ArrayList<String> text = new ArrayList<String>();
		
		do{
			System.out.printf("%n%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s",
					" Menu de lista simple de texto:"," 1. Nueva lista",
					" 2. Numero de cadenas",
					" 3. Añadir cadena",
					" 4. Eliminar cadena",
					" 5. Contiene cadena",
					" 6. Mostrar lista entera",
					" 7. Salir" );
			numMenu=Teclado.numeroByte("¿Cual opcion deseas? ", 1, 7, Rango.INCLUIDO_MIN_MAX);
		
			if(text.isEmpty()&&numMenu!=EMPY&&numMenu!=EXIT)//Comprobar si esta vacia
				System.out.printf("%n La lista esta vacia");
			else
				switch(numMenu){
				case 1://1. Nueva lista
					text.clear();
					System.out.printf("%n Se reanudado una nueva lista.");
					break;
			
				case 2://2. NÃºmero de cadenas
					System.out.printf("%n El numero total de cadenas es %d.",text.size());
					break;
				
				case 3://3. AÃ±adir cadena
					System.out.printf("%n Se va añadir una nueva cadena:%n");
					text.add(Teclado.cadena("Introduzca el valor: "));
					
					System.out.printf("%n Se añadio a la lista.");
					break;
				
				case 4://4. Eliminar cadena
					delete(text);
					break;
				
				case 5://5. Contiene cadena
					System.out.printf("%n Comprobando si esta la cadena en la lista:%n");
					value=Teclado.cadena("Introduzca el valor: ");
				
					System.out.printf(text.contains(value)?"%n Existe esta cadena":"%n No existe esta cadena");
					break;
				
				case 6://6. Mostrar lista entera
					System.out.printf("%n Lista entera:");
					
					for(Object o:text)
							System.out.printf("%n %s",o);
					break;
				
				case 7://7. Salir
					exit=true;
					break;
				}
		}while(!exit);

		System.out.printf("%n Fin del menu.");
	}
	
	public static void delete(ArrayList<String> text){
		final byte MINMENU=1,MAXMENU2=2;
		byte selectDelete;
		
		System.out.printf("%n Se va eliminar la cadena elegida: 1.Por indice 2.Por valor de texto");//Dos formas de eliminar
		selectDelete=Teclado.numeroByte(" Opcion elegida: ", MINMENU, MAXMENU2, Rango.INCLUIDO_MIN_MAX);
		
		if(selectDelete==MINMENU)
			indice(text);//Por posicion del indice	
		else
			comand(text);//Por formato
	}
	
	public static void indice(ArrayList<String> text){
		final int INICIO=1,FINAL=text.size();
		int indice;
		
		indice=Teclado.numeroByte("Introduzca la posicion: ", INICIO, FINAL, Rango.INCLUIDO_MIN_MAX);
	
		text.remove(indice-1);
		System.out.printf("%n Ya ha sido Eliminado.");
	}
	
	public static void comand(ArrayList<String> text){
		String valueText;
		
		valueText=Teclado.cadena("Introduzca el valor: ");
		
		if(text.contains(valueText)){
			text.remove(valueText);
			System.out.printf("%n Ya ha sido Eliminado.");
		}else
			System.out.printf("%n No existe tal valor para eliminar.");
	}
	
}
