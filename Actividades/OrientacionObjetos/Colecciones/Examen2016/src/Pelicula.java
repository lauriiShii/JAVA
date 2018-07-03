
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pelicula implements Cloneable,Comparable <Pelicula> {
	
	/**ATRIBUTOS Y OBJETOS**/
	private Clave clave;
	private String nombre;
	private Date fechaEstreno;
	private Date fechaDVD;
	private static short numeroC=0,numeroF=0,numeroT=0;
	
	/**CONSTRUCTOR**/
	Pelicula(String nombre, Genero genero,Date fechaEstreno,Date fechaDVD){
		this.nombre=nombre;
		this.fechaEstreno=fechaEstreno;
		this.fechaDVD=fechaDVD;
		clave = asignarClave(genero);
	}
	
	/**CLONE**/
	public Object clone(){
		Pelicula clonado;

		try {
			clonado=(Pelicula) super.clone();
			clonado.clave=(Clave)clave.clone();
			clonado.fechaEstreno= (Date) fechaEstreno.clone();
			clonado.fechaDVD= (Date) fechaDVD.clone();
			
		} catch (CloneNotSupportedException e) {
			clonado=null;
		}
	
		return clonado;		
	}
	
	/**ToString**/
	public String toString() {
		DateFormat formato= new  SimpleDateFormat("dd/MM/yyyy");
		
		return String.format("%n %-10s Nombre: %-40s Clave: %-5s Fecha Estreno: %-15s Fecha DVD: %-15s",clave.getGenero(),nombre,clave.toString(),formato.format(fechaEstreno),fechaDVD==null?"no tiene":formato.format(fechaDVD));
	}
	
	/**METODOS**/
	//ASIGNAR CLAVE
	public Clave asignarClave(Genero genero){
		int num=0;
		
		switch(genero){
		case COMEDIA:
			num=++numeroC;
			break;
		case FICCION:
			num=++numeroF;
			break;
		case TERROR:
			num=++numeroT;
			break;
		}
		
		return new Clave(genero,num);
	}
	
	//COMPARE TO
	public int compareTo(Pelicula o) {
		int comp;
	
		comp=o.cantidadDias()-cantidadDias();
		
		if(comp==0)
			comp=nombre.compareTo(o.nombre);
			
		return comp;
	}

	//CANTIDAD DE DIAS
	public int cantidadDias() {
		final int MILI=86400000;
		Date fecha;
		
		if(fechaDVD==null)
			fecha= new Date();
		else
			fecha=fechaDVD;
	
		return (int) (((fecha.getTime()-fechaEstreno.getTime())/MILI));
	}
	
	/**GETTERS**/
	public Date getFechaEstreno() {
		return fechaEstreno;
	}
	
	public Clave getClave() {
		return clave;
	}

}

