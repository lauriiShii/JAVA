package Diego;

import java.util.Arrays;

public class Portaavion extends Barco implements Cloneable, AccionPortaavion{
	private Avion aviones[]= new Avion[Constante.CAPACIDAD];
	
	Portaavion(String nombre, int eslora,Avion[] aviones) {
		super(nombre, eslora);
		this.aviones=aviones;
	}
	
	public boolean equals(Object obj){
		boolean result=false;
		
		if(obj instanceof Portaavion && super.equals(obj) && Arrays.equals(aviones, ((Portaavion) obj).aviones))
			result=true;
		
		return result;
	}
	
	public Object clone(){
		byte i;
		Portaavion clonado;
		
		clonado=(Portaavion)super.clone();
		clonado.aviones=aviones.clone();
		
		for(i=0; i<aviones.length; i++)	
			if(aviones[i]!=null)
				clonado.aviones[i]=(Avion)aviones[i].clone();
		
		
		return clonado;
	}
	
	public String toString(){
		String refeAviones="";
		byte numAviones=0,i;
		
		for(i=0;i<aviones.length;i++)
			if(aviones[i]!=null){
				refeAviones+=aviones[i].toString();
				numAviones++;
			}
		
		return  String.format("%n %s %n %s",super.toString(),numAviones>0? "Aviones: \n"+refeAviones:"");
	}
	
	public void anadirAvion(Avion avion) {
		byte i;
		boolean exit=false;
		
		for(i=0;i<aviones.length&&!exit;i++)
			if(aviones[i]==null){
				aviones[i]=avion;
				exit=true;
			}
	}

	public class Avion implements Cloneable{//CLASE INTERNA
		private String nombre;
		
		Avion(String nombre){
			this.nombre=nombre;
		}
		
		public boolean equals(Object obj){
			boolean result=false;
			
			if(obj instanceof Avion && nombre.equals(((Avion)obj).nombre))
				result=true;
			
			return result;
		}
		
		public Object clone(){
			Avion clonado;
			try {
				clonado=(Avion) super.clone();
			} catch (CloneNotSupportedException e) {
				clonado=null;
			}
			return clonado;		
		}
		
		public String toString(){
			
			return String.format("%n Avion: %s",nombre);
		}
		
	}/////Fin de la clase interna
	
}
