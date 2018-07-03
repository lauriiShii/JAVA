
public class Bebe implements InterfazBebe, Cloneable{

	boolean despierto;
	float peso;
		
	public Bebe(boolean despierto, float peso) {

		this.despierto = despierto;
		this.peso = peso;
	}

	public void dormir() {
		if (despierto)
			despierto=false;
	}

	public void despertar() {
		if (!despierto)
			despierto=true;
	}

	public void comer(float litros) {
		if(despierto)
			peso+=litros*0.25;
	}

	public boolean equals(Object obj) {
		boolean resultado=false;
		
		if(obj instanceof Bebe && despierto==((Bebe) obj).despierto && peso == ((Bebe) obj).peso)
				resultado=true;
		
		return resultado;			
	}	

	public Object clone(){
		Bebe clonado;
		try {
			clonado=(Bebe) super.clone();//Llama al clone de Object
		} catch (CloneNotSupportedException e) {
			clonado=null;
		}
		return clonado;		
	}

	public String toString() {
		return String.format("Despierto?: %s%nPeso: %.2f Kg%n", despierto?"Si":"No",peso);
	}

	
}
