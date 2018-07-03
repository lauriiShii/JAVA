package HerenciaClonEquals;

public class Hijo2 extends Padre{
	/* Al hijo no le hace falta implementar Cloneable
	 * Hijo con objetos
	 * Conclusión: utilizo el clone del Padre (super.clone) y después clono la moto 
	 *   ya que es un objeto.
	 */
	Moto miMoto;
	Hijo2(String nombre,int numHijos,Moto miMoto){
		super(nombre,numHijos);
		this.miMoto=miMoto;
	}
	@Override
	public String toString() {
		return "Hijo2 [miMoto=" + miMoto + " " + super.toString()
				+ "]";
	}
	public boolean equals(Object obj) {
		boolean resultado=false;
		if(obj instanceof Hijo2 && super.equals(obj) && miMoto.equals(((Hijo2)obj).miMoto))
				resultado=true;
		return resultado;		
	}	
	protected Object clone(){
		Hijo2 clonado;
		clonado=(Hijo2) super.clone();//No hace falta el try-catch de CloneNotSupportedException porque lo tiene el clone del Padre
		clonado.miMoto=(Moto)miMoto.clone();
		return clonado;		
	}
	public static void main(String[] args) {
		Hijo2 h=new Hijo2("Ana",2,new Moto("1256JPT"));
		Hijo2 clonado;
		clonado=(Hijo2)h.clone();
		clonado.miMoto.matricula="1259JPT";//Cambio el clonado para comprobar que no afecta al original
		System.out.println(h.equals(clonado));
		System.out.println("Variable h: "+h.toString());
		System.out.println("Variable clonada: "+clonado.toString());
	}	
}
