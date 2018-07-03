
public abstract class TestForma { // La clase es abstracta al tener un metodo como tal
	
	public static void main(String[] args) {
		
		Forma f=new Circulo();
		f.identidad();
		
		Circulo c=new Circulo();
		((Forma)c).identidad();
		((Circulo)f).identidad();
		
		//No se puede crear un objeto de una clase abstrata
		/**Forma f2=new Forma();
		f2.identidad();
		(Forma)f.identidad();**/
		
		f=c;
		c=(Circulo) f; // --> No se cumpliria sin el casting porq un circulo si es una forma pero una forma no siempre es un circulo
		}
}
