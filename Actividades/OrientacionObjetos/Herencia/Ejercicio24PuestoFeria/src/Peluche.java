
public class Peluche extends Juguete {

	boolean habla;
	Tamanio tam;
	
	public Peluche(String nombre, String color, boolean habla, Tamanio tam) throws NombreIncorrectoException {
		super(nombre, color);
		this.habla = habla;
		this.tam = tam;
	}

	int calcularValor() {
		return tam.getPrecio();
	}
	
	public boolean equals(Object obj) {
		boolean resultado=false;
		if(obj instanceof Peluche && super.equals(obj) && habla==((Peluche)obj).habla && tam==((Peluche)obj).tam)
				resultado=true;
		return resultado;				
	}	

	public String toString() {
		return String.format("%sHabla: %s%nTamaño: %s%n",super.toString(), habla?"Si":"no", tam);
	}
	
}
