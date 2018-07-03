
public enum Categoria {
	JEFE('J'), ENCARGADO('E'), EMPLEADO('D');


	private char codigo;

	Categoria(char codigo) {
		this.codigo = codigo;
	}

	public char getCodigo() {
		return codigo;
	}
}
