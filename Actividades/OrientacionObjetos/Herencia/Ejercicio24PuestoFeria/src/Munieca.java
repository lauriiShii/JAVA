
public class Munieca extends Juguete {
	
	Bebe bebe;
	
	public Munieca(String nombre, String color, Bebe bebe) throws NombreIncorrectoException {
		super(nombre, color);		
		this.bebe=bebe;
	}

	int calcularValor() {
		return 10;
	}
	
	public boolean equals(Object obj) {
		boolean resultado=false;
		if(obj instanceof Munieca && super.equals(obj) && bebe.equals(((Munieca)obj).bebe))
			resultado=true;
		return resultado;				
	}	

	public Object clone(){
		
		Munieca clonado;
		clonado=(Munieca) super.clone();
		clonado.bebe=(Bebe)bebe.clone();
		
		return clonado;		
	}

}

