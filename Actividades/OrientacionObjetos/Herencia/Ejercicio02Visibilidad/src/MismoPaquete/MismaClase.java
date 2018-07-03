package MismoPaquete;

public class MismaClase {
	
	/**ATRIBUTOS**/
	String friend;
	public String publico;
	private String privado;
	protected String protegido;
	
	/**GETS**/
	String getFriend() {
		return friend;
	}
	public String getPublico() {
		return publico;
	}
	protected String damePrivado() {
		return privado;
	}
	private String getPrivado() {
		return privado;
	}
	protected String getProtegido() {
		return protegido;
	}
	
	/**MAIN**/
	public static void main (String args []){
		
		/**VISIBILIDAD**/
		MismaClase Clase=new MismaClase();
		Clase.friend="friend";
		Clase.privado="privado";
		Clase.protegido="protegido";
		Clase.publico="publico";
		
		System.out.printf("Soy una clase que contiene atributos, de los cuales puedo conocer los que tienen visivilidad %s,%s,%s y %s con ayuda de sus gets."
				,Clase.getPrivado(), Clase.getFriend(), Clase.getProtegido(), Clase.getPublico());
		
	}

}
