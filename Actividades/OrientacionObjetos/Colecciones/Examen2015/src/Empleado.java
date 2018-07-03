
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Empleado implements Cloneable,Comparable<Empleado> {
	private Clave clave;
	private String nombre;
	private Date fechaAlta;
	private Date fechaBaja;
	private static short numeroJ=0,numeroE=0,numeroD=0;
	
	Empleado(String nombre, Categoria categoria,Date fechaAlta,Date fechaBaja){
		this.nombre=nombre;
		this.fechaAlta=fechaAlta;
		this.fechaBaja=fechaBaja;
		clave = asignarClave(categoria);
	}
	
	// NO NECESITA EQUAL POR QUE NO SE COMPARAN SUS CARACTERISTICAS, YA TIENE LA CLAVE DE COMPARAR(!!)
	
	public Object clone(){
		Empleado clonado;

		try {
			clonado=(Empleado) super.clone();
			clonado.clave=(Clave)clave.clone();
			clonado.fechaAlta= (Date) fechaAlta.clone();
			
			if(fechaBaja!=null)//Para evitar un NullPointerException.
				clonado.fechaBaja= (Date) fechaBaja.clone();
			
		} catch (CloneNotSupportedException e) {
			clonado=null;
		}
	
		return clonado;		
	}
	
	public Clave asignarClave(Categoria categoria){
		int num=0;
		
		switch(categoria){
		case JEFE:
			num=++numeroJ;
			break;
		case ENCARGADO:
			num=++numeroE;
			break;
		case EMPLEADO:
			num=++numeroD;
			break;
		}
		
		return new Clave(categoria,num);
	}
	
	public int compareTo(Empleado o) {
		int comp;
	
		comp=o.cantidadDias()-cantidadDias();
		
		if(comp==0)
			comp=clave.toString().compareTo(o.clave.toString());
			
		return comp;
	}
	
	public String toString() {
		DateFormat formato= new  SimpleDateFormat("dd/MM/yyyy");
		
		return String.format("%n %-10s Nombre: %-10s Clave: %-5s Fecha alta: %-15s Fecha baja: %-15s Días Trabajados: %-15d",clave.getCategoria(),nombre,clave.toString(),formato.format(fechaAlta),fechaBaja==null?"no tiene":formato.format(fechaBaja),cantidadDias());
	}

	public int cantidadDias() {
		final int MILI=86400000;// 3600*24*1000 
		Date fecha;
		
		if(fechaBaja==null)
			fecha= new Date();
		else
			fecha=fechaBaja;
	
		return (int) (((fecha.getTime()-fechaAlta.getTime())/MILI));
	}

	public String getNombre() {
		return nombre;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public Date getFechaBaja() {
		return fechaBaja;
	}
	
	public Clave getClave() {
		return clave;
	}
	
}
