package Parte3y4;

public class Main {

	public static void main(String[] args) {

		Plantas miPlanta, miPlanta2, miPlanta3, miPlanta4;
		Insectos miInsecto, miInsecto2, miInsecto3, miInsecto4;
		
		miPlanta = new Plantas(3.60, false);
		miInsecto = new Insectos("Verde", 5, 4);
		miPlanta2 = new Plantas(1.20, true);
		miInsecto2 = new Insectos("Rojo", 6, 3);
		miPlanta3 = new Plantas(3.60, false);
		miInsecto3 = new Insectos("Verde", 5, 4);
		
		// CLONAR PLANTAS E INSECTOS
		miInsecto4 = (Insectos) miInsecto2.clone();
		System.out.printf("Hemos clonado al %s \nA partir de %s\n", miInsecto4.toString(), miInsecto2.toString());
		
		miPlanta4 = (Plantas) miPlanta2.clone();
		System.out.printf("\nHemos clonado a la %s \nA partir de la %s\n", miPlanta4.toString(), miPlanta2.toString());
		
		/*CONTAR PLANTAS E INSECTOS CREADOS. Como en el apartado anterior lo que hemos realizado ha sido una clonación,
		 * en lugar de contar 4 plantas y 4 insectos cuenta 3, ya que clonacion no cuenta como crear objeto.*/ 
		
		System.out.printf("En total se han creado %d Plantas\n", Plantas.getOrden());
		System.out.printf("En total se han creado %d Insectos\n\n", Insectos.getOrden());
		
	}
}
