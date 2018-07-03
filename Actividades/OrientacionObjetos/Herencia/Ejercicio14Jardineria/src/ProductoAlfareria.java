
public class ProductoAlfareria extends Producto{

	boolean fragil;
	
	ProductoAlfareria (double precio, String descripcion, boolean fragil){
		super(precio, descripcion);
		this.fragil = fragil;
	}
	
	ProductoAlfareria (){
		super(0.0, "Sin descripcion disponible");
		fragil = false;
	}
	
	public void dameDatos(){
		System.out.printf("Precio: %.2f ------ Descripcion: %s.%n", damePrecio(), dameDescripcion());
	}
}
