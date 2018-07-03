package Apartado2;

public abstract class Forma {

	public abstract String toString();
	
	public String identidad(){
		String a="";
		
		if(this instanceof Cuadrado){
			a="Cuadrado";
		}else if(this instanceof Rombo){
			a="Rombo";
		}else if(this instanceof Circulo){	
			a="Circulo";
		}else if(this instanceof Triangulo){	
			a="Triangulo";
		}
		
		return a;
	}
}
