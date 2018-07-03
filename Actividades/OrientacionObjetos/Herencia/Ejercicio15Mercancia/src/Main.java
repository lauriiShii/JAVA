
public class Main {

	public static void main(String[] args) {
		/** PLANTA **/
		PlantaJardin p = new PlantaJardin(1, "flores violetas muy delicadas con tallos finos", false,true);
		dameDatos(p);
		
		/**PRODUCTO**/
		ProductoAlfareria pro = new ProductoAlfareria();
		dameDatos(pro);
	}
	
	public static void dameDatos(Mercancia producto){
		
		//Datos producto
		System.out.printf("Nombre: %s%n",producto.dameDescripcion());
		System.out.printf("Precio: %s%n",producto.damePrecio());
		
		//Si es plantas
		if (producto instanceof MercanciaViva){
			System.out.printf("Necesita riego: %b%n",((MercanciaViva)producto).necesitaRiego());
			System.out.printf("Necesita comida: %b%n",((MercanciaViva)producto).necesitaComida());
		}
		//Si es fragil
		if(producto instanceof MercanciaFragil){
			System.out.printf("Embalaje: %b%n", ((MercanciaFragil)producto).dameEmbalaje());
			System.out.printf("Peso: %b%n", ((MercanciaFragil)producto).damePeso());
		}
		System.out.println();
	}

}
