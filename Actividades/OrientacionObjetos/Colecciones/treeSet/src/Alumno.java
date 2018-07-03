import java.util.TreeSet;


public class Alumno implements Comparable<Alumno>{

	String nombre;
	double nota;
	Alumno(String nombre,double nota){
		this.nombre=nombre;
		this.nota=nota;
	}
	public int compareTo(Alumno o) {
		int comparacion;
		comparacion=nombre.compareToIgnoreCase(o.nombre);
		if(comparacion==0)
			comparacion=(int)(nota-o.nota);
		return comparacion;
	}
	public String toString() {
		return "Alumno [nombre=" + nombre + ", nota=" + nota + "]";
	}
	public static void main(String[] args) {
		Alumno a1,a2,a3,a4,a5,a6;
		a1=new Alumno("Alberto",7);
		a2=new Alumno("Alberto",6);
		a3=new Alumno("Alberto",7);
		a4=new Alumno("Adrian",7);
		a5=new Alumno("Alberto",7);
		a6=new Alumno("Adrian",8);
		TreeSet<Alumno> arbol=new TreeSet<Alumno>();
		arbol.add(a1);
		arbol.add(a2);
		arbol.add(a3);
		arbol.add(a4);
		arbol.add(a5);
		arbol.add(a6);
		for(Alumno a:arbol)
			System.out.println(a);
	}
}
