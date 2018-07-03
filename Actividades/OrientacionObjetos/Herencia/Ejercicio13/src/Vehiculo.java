
public abstract class Vehiculo {
	
	//Si puede tener descendencia
	//Todos sus metodos se pueden sobre escribir pues son publicos

	private int peso;

	public final void setPeso(int p) {
		peso = p;
	}

	public abstract int getVelocidadActual();
}