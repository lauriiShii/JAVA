
public class Main {
	public static void main(String[] args) {

		/**CLONAMOS**/
		Pez sujeto = new Pez("lubina");
		Pez clonado;
		clonado = (Pez) sujeto.clone();
		
		/**COMPARAMOS**/
		System.out.printf("Son iguales: %s%n", sujeto.equals(clonado)?"Si":"No");
		System.out.println("Sujeto inicial --> "+sujeto.toString());
		System.out.println("Clon del sujeto --> "+clonado.toString());
		
		/**MODIFICAMOS CLON**/
		clonado.setNombre("pez emperador");
		
		/**COMPARAMOS**/
		System.out.printf("Son iguales: %s%n", sujeto.equals(clonado)?"Si":"No");
		System.out.println("Sujeto inicial --> "+sujeto.toString());
		System.out.println("Clon del sujeto --> "+clonado.toString());
		
		/**¿CUANTOS PECES HAN SIDO CREADOS?**/
		Pez p = new Pez ("Rodaballo");
		System.out.println("El número de pezes creados es: "+p.getNumPezes());
	}
}
