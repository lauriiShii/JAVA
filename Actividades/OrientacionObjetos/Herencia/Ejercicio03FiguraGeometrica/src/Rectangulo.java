
public class Rectangulo extends FiguraGeometrica {

	private float base, altura;
	
	Rectangulo (float x, float y, float base, float altura){
		super(x,y);
		this.base=base;
		this.altura=altura;
	}

	protected float calcularArea() {
		return base*altura;
	}
}
