
public class Ejercicio04 {
	/**
	 * De las siguientes asignaciones ¿cuáles son válidas? ¿Cuál es el efecto de su ejecución? ¿De
	 * qué tipo deben ser las variables?*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean z;
		int a=0, b=3, precio=0;
		String x;
		
		//Apartado a)
		z = 2 < 1;
		System.out.println("a) z = 2 < 1 \nEs una asignación valida."
				+ "\nSu efecto sera devolver verdadero o falso, en este caso: "+z
				+", por tanto su tipo de variable es un boolean.");
		
		//Apartado b)
		a = a + 1;
		System.out.println("b) a = a + 1 \nEs una signacion valida."
			+ "\nSu efecto es hacer una cuenta con el mismo valor de a,"
			+ "el unico requesito que tenemos es que a este inicializada."
			+ "\nPor tanto el resultado suponiendo que a sea 0 es:  "+a
			+".\nLa variable sera de tipo int");
				
		//Apartado c)
		// sqrt(3) = 32717;
		System.out.println("c) sqrt(3) = 32717 \nNo es una expresion valida ya que el resultado"
				+ "se tiene que guardar en alguna variable, "
				+ "luego: int a = sqrt(3) (raiz cuadrada de 3) si seria valido."
				+ "\nLa variable seria double por los posibles decimales");
		
		//Apartado d)
		//‘x’ = ‘y’;
		System.out.println("d) ‘x’ = ‘y’ \nNo es valido ya que la variable no se puede asignar así y"
				+ "ademas el argumento debe ir entre comillado y no con comas simpres."
				+ "\nEl tipo de variable seria STring");
		
		//Apartado e)
		//x = ‘y’;
		System.out.println("e) x = ‘y’ \nEs una expresion no valida."
				+ "\nPara que la expresion fuera valida deberia tener el argumento de la variable entre "
				+ "dobles comillas."
				+ "\nLa variable seria de tipo Sting.");
		
		//Apartado f)
		a = b;
		System.out.println("f) a = b\nEs una expresion valida simepre y cuando b este inicialidad "
				+ "con algun valor. El resultado");
		
		//Apartado g)
		precio = precio-precio*(30/100);
		System.out.println("g) precio = precio – precio*(30/100)\nEs una expresion correcta. precio debe de estar inicializado.\nEl resultado seria: "+precio
				+". El tipo de variable es double.");
				
	}

}
