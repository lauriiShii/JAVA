
public class Main {

	public static void main(String[] args) {
		
		/**CREAMOS PRODUCTO SOBREMESA**/
		SobreMesa miPc = new SobreMesa ("Sony","VGN-NW11Z",5,3.2f,2000f,new Monitor("1080x950","Benq"));
		System.out.println("Producto: "+miPc.toString());
		
		/**CLONAMOS**/
		SobreMesa clonado;
		clonado = (SobreMesa) miPc.clone();
		System.out.println("Clon: "+clonado.toString());
		
		/**COMPARAMOS**/
		System.out.printf("Son iguales: %s%n", miPc.equals(clonado)?"Si":"No");
		
		/**MODIFICAMOS CLON**/
		clonado.setModelo("NN0-00000");
		System.out.println("Clon: "+clonado.toString());
		
		/**COMPARAMOS**/
		System.out.printf("Son iguales: %s%n", miPc.equals(clonado)?"Si":"No");

	}

}
