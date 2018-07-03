
public abstract class Mamiferos extends Animal {

	String champu;
	boolean enfadado;
	
	Mamiferos(String nombre, double cuotaMensual, String raza, String champu, boolean enfadado){
		super(nombre, cuotaMensual, raza);
		this.champu=champu;
		this.enfadado=enfadado;
	}
	
	public boolean equals(Object obj) {
		boolean resultado=false;
		if(obj instanceof Mamiferos && super.equals(obj) && champu.equals(((Mamiferos)obj).champu) 
				&& enfadado==((Mamiferos)obj).enfadado)
				resultado=true;
		return resultado;		
	}	
	
	public boolean enfadarse() {
		return enfadado;
		
	}


	
}
