package HerenciaClonEquals;

public class Hijo1 extends Padre{
	/* Al hijo no le hace falta implementar Cloneable
	 * Hijo con atributos primitivos o cadenas
	 * Conclusión: usamos el clone heredado del padre
	 */
	double paga;
	boolean hijoUnico;
	Hijo1(String nombre,int numHijos,double paga,boolean hijoUnico){
		super(nombre,numHijos);
		this.paga=paga;
		this.hijoUnico=hijoUnico;
	}
	@Override
	public String toString() {
		return "Hijo1 [paga=" + paga + ", hijoUnico=" + hijoUnico + " "
				+ super.toString() + "]";
	}
	public boolean equals(Object obj) {
		boolean resultado=false;
		if(obj instanceof Hijo1 && super.equals(obj) && paga==((Hijo1)obj).paga
				&& hijoUnico==((Hijo1)obj).hijoUnico)
				resultado=true;
		return resultado;		
	}	
	public static void main(String[] args) {
		Hijo1 h=new Hijo1("Ana",2,50.50,false);
		Hijo1 clonado;
		clonado=(Hijo1)h.clone();
		System.out.println(h.equals(clonado));
		System.out.println("Variable h: "+h.toString());
		System.out.println("Variable clonada: "+clonado.toString());
	}	
}
