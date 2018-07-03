
public class Main {

	public static void main(String[] args) {

		Perros p1=new Perros("Kiki", 1500, "Pitbull", "Loreal", false, 10);
		p1.criar("Lancy", "14-Febrero-2016");
		p1.criar("Harte", "21-Junio-2015");
		Perros p2=new Perros("Trosky", 200, "Bull Dog Frances", "HS", true, 4);
		Gatos g1=new Gatos("Dalsy", 450, "Persa", "MiPets", false);
		g1.criar("Galfiel", "5-Enero-2000");
		Gatos g2=new Gatos("Serte", 1502, "Lerar", "Loreal", true);
		g2.criar("Doraemon", "16-Julio-2010");
		Loros l1=new Loros("Rodolfo", 120, "Galeo", Alimentacion.HERBIVORAS, true);
		Loros l2=new Loros("Fernando", 140, "Plumaje", Alimentacion.CARNIVORAS, false);
		Periquitos r1=new Periquitos("Delta", 109, "Agaporni", Alimentacion.INSECTIVORAS);
		Periquitos r2=new Periquitos("Trueno", 541, "Jilguero", Alimentacion.OMNIVORAS);
		
		
		Perros clonado = (Perros)p1.clone();
		
		
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(g1.toString());
		System.out.println(g2.toString());
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.printf("%nEsta clonado? %s",clonado.equals(p1));
		System.out.println(clonado.toString());
		
		
		//al clonado cambiar una cria y comprobar si da falso
		
		clonado.nombre="Pepe"; //Aqui cambio el nombre del perro
		clonado.crias[1].setNombre("Pepe"); //Aqui utilizamos los SETTERS para cambiar el nombre de la cria
		clonado.crias[0].nombre="Jarte"; //Aqui utilizamos los nombres ya que estan en publicos, pero lo correcto son los setters.
		
		
		System.out.printf("%nEsta clonado? %s",clonado.equals(p1)?"Si":"No");
		System.out.println(clonado.toString());
		
				
	}

}
