
public class SobreMesa extends Ordenador {

	/** ATRIBUTO **/
	private Monitor monitor;

	/** CONSTRUCTORES **/
	public SobreMesa() {
		super("Desconcocido", "Desconocido", 0, 0.0f, 0.0f);
		monitor = dameMonitor();
	}
	
	SobreMesa(String marca, String modelo, int stock, float velocidad, float capcacidad, Monitor monitor){
		super(marca, modelo, stock, velocidad, capcacidad);
		this.monitor = monitor;
	}
	
	/** METODOS **/
	Monitor dameMonitor() {
		return monitor = new Monitor();
	}
	
	/**EQUALS**/
	public boolean equals(Object obj) {
		boolean resultado=false;
		if(obj instanceof SobreMesa && super.equals(obj) && monitor.equals(((SobreMesa)obj).monitor))
				resultado=true;
		return resultado;		
	}	
	
	/**CLON**/
	protected Object clone(){
		SobreMesa clonado;
		clonado=(SobreMesa) super.clone();
		clonado.monitor=(Monitor)monitor.clone();
		return clonado;		
	}

	/**toString**/
	public String toString() {
		return "SobreMesa [monitor=" + monitor + ", " + super.toString() + "]";
	}
	
	
	
	

}
