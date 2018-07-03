
public class Huevo {

	/**ATRUBUTO**/
	private String nombre;
	private Yema yema;
	private Clara clara;
	
	/**CONSTRUCTOR**/
	public Huevo(){
		nombre = "Soy un huevo";
		clara = hazClara();
		yema = hazYema();

	}
	/**METODOS**/
	public Yema hazYema(){
		return yema = new Yema();
	}
	
	public Clara hazClara(){
		return clara = new Clara();
	}

	/**ToString**/
	public String toString() {
		return "Huevo [nombre=" + nombre + ", yema=" + yema + ", clara="
				+ clara + "]";
	}
}
