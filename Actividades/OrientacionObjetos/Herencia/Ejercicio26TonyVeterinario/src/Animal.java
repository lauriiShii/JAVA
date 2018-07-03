
import java.util.Arrays;

public abstract class Animal implements Comunicarse, Cloneable{

	String nombre;
	double cuotaMensual;
	String raza;
	Crias crias[]=new Crias[5];
	String codigo;

	
	Animal(String nombre, double cuotaMensual, String raza){
		this.nombre=nombre;
		this.cuotaMensual=cuotaMensual;
		this.raza=raza;
	}
	
	 @Override
	public String toString() {
		 
		 int i;
		 
		 String cadena=String.format("%nNombre: %s%nCuotaMensual: %.2f Euros%nRaza: %s%nCrias: ", nombre, cuotaMensual, raza);
		 for(i=0; i<crias.length; i++)
			 if(crias[i]!=null)
				 cadena+="\n\t" + crias[i].toString();
		return cadena + String.format("%nCodigo: %s%nHablar: %s%nEnfadarse: %s", codigo, hablar(), enfadarse());
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCuotaMensual() {
		return cuotaMensual;
	}

	public void setCuotaMensual(double cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Crias[] getCrias() {
		return crias;
	}

	public void setCrias(Crias[] crias) {
		this.crias = crias;
	}

	@Override
	public abstract String hablar();

	@Override
	public abstract boolean enfadarse();
	
	public void criar(String nombre, String fnac){
		int i;
		boolean criado=false;
		
		for(i=0; i<crias.length && !criado; i++)
			if(crias[i]==null){
				criado=true;
				crias[i]=new Crias(nombre, fnac);
			}
		
		
	}
	
	public boolean equals(Object obj) {
		boolean resultado=false;
		if(obj instanceof Animal && nombre.equals(((Animal)obj).nombre) 
				&& cuotaMensual==((Animal)obj).cuotaMensual && raza.equals(((Animal)obj).raza) && Arrays.equals(((Animal)obj).crias,crias) && codigo.equals(((Animal)obj).codigo))
				resultado=true;
		return resultado;		
	}	
	
	public Object clone(){
		Animal clonado;
		int i;
		try {
			clonado=(Animal) super.clone();//El clone al que se llama es el de Object
			clonado.crias= crias.clone();
			for (i = 0; i < crias.length; i++) {
				if(crias[i]!=null)
					clonado.crias[i]=(Crias) crias[i].clone();
			}
		} catch (CloneNotSupportedException e) {
			clonado=null;
		}
		return clonado;		
	}	
	
}
