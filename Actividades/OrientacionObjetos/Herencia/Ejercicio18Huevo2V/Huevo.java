package Huevo;

public class Huevo {

	private String nombre;
	private Yema yema;
	private Clara clara;
	
	public Huevo(){
		nombre = "Soy un huevo";
		clara = hazClara();
		yema = hazYema();

	}
	
		private class Yema{
			String nombre;
			
			public Yema(){
				nombre = "Soy una yema";
			}

			@Override
			public String toString() {
				return "Yema [nombre=" + nombre + "]";
			}
			
		}
		
		private class Clara{
			String nombre;
			
			public Clara(){
				nombre = "Soy una clara";
				
			}

			@Override
			public String toString() {
				return "Clara [nombre=" + nombre + "]";
			}
		}
	
	public Yema hazYema(){
		return yema = new Yema();
	}
	
	public Clara hazClara(){
		return clara = new Clara();
	}

	@Override
	public String toString() {
		return "Huevo [nombre=" + nombre + ", yema=" + yema + ", clara="
				+ clara + "]";
	}
}
