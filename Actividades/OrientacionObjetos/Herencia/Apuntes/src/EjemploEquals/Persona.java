package EjemploEquals;

public class Persona {
	String nombre;
	int numHijos;
	Persona(String nombre,int numHijos){
		this.nombre=nombre;
		this.numHijos=numHijos;
	}
	public boolean equals(Object obj) {
		boolean resultado=false;
		if(obj instanceof Persona && nombre.equals(((Persona)obj).nombre) 
				&& numHijos==((Persona)obj).numHijos)
				resultado=true;
		return resultado;		
	}
	public static void main(String[] args) {
		Persona p=new Persona("ana",2);
		Persona b=new Persona("Ana",2);
		System.out.println(p.equals(b));
	}
}
