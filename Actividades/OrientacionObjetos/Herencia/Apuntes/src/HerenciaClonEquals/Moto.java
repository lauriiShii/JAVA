package HerenciaClonEquals;

public class Moto implements Cloneable {
	String matricula;
	Moto(String matricula){
		this.matricula=matricula;
	}
	public boolean equals(Object obj) {
		boolean resultado=false;
		if(obj instanceof Moto && matricula.equals(((Moto)obj).matricula))
				resultado=true;
		return resultado;		
	}	
	public Object clone(){
		Moto clonado;
		try {
			clonado=(Moto) super.clone();//Llama al clone de Object
		} catch (CloneNotSupportedException e) {
			clonado=null;
		}
		return clonado;		
	}
	@Override
	public String toString() {
		return "Moto [matricula=" + matricula + "]";
	}	
}
