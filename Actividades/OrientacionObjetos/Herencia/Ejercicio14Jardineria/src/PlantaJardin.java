
public class PlantaJardin extends Producto{
	
	boolean regada;
	
	PlantaJardin (double precio, String descripcion, boolean regada){
		super(precio, descripcion);
		this.regada = regada;
	}
	
	PlantaJardin (){
		super(0.0, "Sin descripcion disponible");
		regada = false;
	}
	
	public void dameDatos(){
		System.out.printf("Precio: %.2f ------ Descripcion: %s.%n", damePrecio(), dameDescripcion());
	}
}
