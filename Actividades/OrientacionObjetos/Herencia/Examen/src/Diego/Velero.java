package barco_J16;

public class Velero extends Barco implements Cloneable,AccionVelero{
	private int numVela;
	
	Velero(String nombre, int eslora, int numVela) {
		super(nombre, eslora);
		this.numVela=numVela;
	}
	
	public boolean equals(Object obj){
		boolean resultado=false;
		
		if(obj instanceof Velero && numVela==((Velero)obj).numVela)
			resultado=true;
		
		return resultado;				
	}
	
	public Object clone(){
		Velero clonado;
		
		clonado=(Velero) super.clone();
		
		return clonado;		
	}
	
	public String toString(){
		
		return  String.format("%n %s %n Numero de velas: %d",super.toString(),numVela);
	}

	public int numVelas(Velero velero) {
		
		return numVela;
	}
}
