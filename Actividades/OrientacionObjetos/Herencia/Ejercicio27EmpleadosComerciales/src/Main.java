
public class Main {
	public static void main(String[] args) {

		/** ENCARGADO **/
		// Creamos empleado
		Encargado encargado = new Encargado("08-02-2010", "Alicia Duran Garcia", 20000,"Controla todos los camareros");
		encargado.venta_realizada(1, 2000);
		encargado.venta_realizada(2, 150);
		System.out.println("*************************\n\nENCARGADO -->\n"+encargado.toString());

		// Clonamos
		Encargado c1;
		c1 = (Encargado) encargado.clone();
		System.out.println("\nCLON ENCARGADO -->\n" + encargado.toString());

		// Comparamos
		System.out.printf("\n¿EL CLON DE ENCARGADO Y ENCARGADO SON IGUALES?: %s%n", encargado.equals(c1) ? "Si" : "No");

		// Modificamos clon
		c1.aumento_productividad(20);
		c1.incrementar_horas_trabajadas(300);
		c1.venta_realizada(3, 470);
		System.out.println("\nCLON MODIFICADO DE ENCARGADO -->\n" + c1.toString());

		// Comparamos
		System.out.printf("\n¿EL CLON MODIFICADO Y EL ENCARGADO SON IGUALES?: %s%n", encargado.equals(c1) ? "Si" : "No");
		System.out.println("\n*************************");

	}

}
