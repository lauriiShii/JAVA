
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.TreeMap;
import java.util.TreeSet;


public class Arboles {

	public static void main(String[] args) {
		TreeSet<Empleado> arbol1 = new TreeSet<Empleado>();
		TreeSet<Empleado> arbol2 = new TreeSet<Empleado>(new Comparator<Empleado>() {
				public int compare(Empleado o1, Empleado o2) {
					
					return o1.getNombre().compareTo(o2.getNombre());
				}
	        });
		
       TreeMap<Clave, Empleado> arbol3 = new TreeMap<Clave, Empleado>(new ComparadorEmpleadoA3());
     
		Empleado pepe,esteban,pedro,maria,laura,yolanda,nuria,antonio,juan,clon1,clon2,clon3;
		
		pepe= new Empleado("Pepe",Categoria.EMPLEADO,dameFecha("21/03/2011"),dameFecha("22/04/2013"));
		juan = new Empleado("Juan",Categoria.ENCARGADO,dameFecha("29/02/2012"),null);
		maria = new Empleado("María",Categoria.JEFE,dameFecha("30/04/2010"),dameFecha("31/05/2014"));
		laura = new Empleado("Laura",Categoria.EMPLEADO,dameFecha("30/12/2010"),null);
		esteban = new Empleado("Esteban",Categoria.ENCARGADO,dameFecha("05/11/2010"),dameFecha("11/02/2015"));
		pedro = new Empleado("Pedro",Categoria.JEFE,dameFecha("16/08/2009"),null);
		yolanda= new Empleado("Yolanda",Categoria.EMPLEADO,dameFecha("27/07/2012"),dameFecha("01/10/2013"));
		nuria = new Empleado("Nuria",Categoria.JEFE,dameFecha("31/08/2009"),null);
		antonio = new Empleado("Antonio",Categoria.ENCARGADO,dameFecha("28/01/2011"),dameFecha("14/05/2014"));
		
		clon1=(Empleado) pepe.clone();
		clon2=(Empleado) esteban.clone();
		clon3=(Empleado)pedro.clone();
	
		arbol1.add(pepe);
		arbol1.add(juan);
		arbol1.add(maria);
		arbol1.add(laura);
		arbol1.add(esteban);
		arbol1.add(pedro);
		arbol1.add(yolanda);
		arbol1.add(nuria);
		arbol1.add(antonio);
		arbol1.add(clon1);
		arbol1.add(clon2);
		arbol1.add(clon3);
		
		arbol2.add(pepe);
		arbol2.add(juan);
		arbol2.add(maria);
		arbol2.add(laura);
		arbol2.add(esteban);
		arbol2.add(pedro);
		arbol2.add(yolanda);
		arbol2.add(nuria);
		arbol2.add(antonio);
		arbol2.add(clon1);
		arbol2.add(clon2);
		arbol2.add(clon3);
		
		arbol3.put(pepe.getClave(), pepe);
		arbol3.put(juan.getClave(),juan);
		arbol3.put(maria.getClave(),maria);
		arbol3.put(laura.getClave(),laura);
		arbol3.put(esteban.getClave(),esteban);
		arbol3.put(pedro.getClave(),pedro);
		arbol3.put(yolanda.getClave(),yolanda);
		arbol3.put(nuria.getClave(),nuria);
		arbol3.put(antonio.getClave(),antonio);
		arbol3.put(clon1.getClave(),clon1);
		arbol3.put(clon2.getClave(),clon2);
		arbol3.put(clon3.getClave(),clon3);
		
		System.out.printf("%n%n%n ARBOL1: ordenado descendentemente por días trabajados.%n%n%n");
		
		for(Empleado e: arbol1)
			System.out.println(e);
		
		System.out.printf("%n%n%n ARBOL2: ordenado ascendentemente por orden alfabético del nombre.%n%n%n");
		
		for(Empleado e: arbol2)
			System.out.println(e);
		
		System.out.printf("%n%n%n TREEMAP: ordenado descendentemente por categoría profesional y a misma categoría, ordenado ascendentemente por número.%n%n%n");
	
		for(Empleado e: arbol3.values())
			System.out.println(e);
		
	}
	
	public static Date dameFecha (String fecha){
		SimpleDateFormat patron = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaA=null;
		
		try{
			fechaA=patron.parse(fecha);
		} catch (ParseException ex) {}
	
		return fechaA;
	}
	
}
