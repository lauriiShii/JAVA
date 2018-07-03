
public abstract class Juguete extends Sorpresa {
	
	protected String color;
	
	public Juguete(String nombre, String color) throws NombreIncorrectoException {
		super(nombre);
		this.color = color;
	}

	abstract int calcularValor();
	
	public boolean equals(Object obj) {
		boolean resultado=false;
		if(obj instanceof Juguete && super.equals(obj) && color.equals(((Juguete)obj).color) )
				resultado=true;
		return resultado;				
	}	
	
	public String toString() {
		return String.format("%sColor: %s%n",super.toString(), color);
	}

}
