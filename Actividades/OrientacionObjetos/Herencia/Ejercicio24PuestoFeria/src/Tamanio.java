
public enum Tamanio {
	PEQUE(2), MEDIANO(5), GRANDE(7);

	private int precio;

	Tamanio(int precio) {
		this.precio = precio;
	}

	public int getPrecio() {
		return precio;
	}

}
