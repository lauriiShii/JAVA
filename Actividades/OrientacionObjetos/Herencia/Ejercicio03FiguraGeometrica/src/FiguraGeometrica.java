
public abstract class FiguraGeometrica {

	protected float x, y;
	
	FiguraGeometrica () {
		this(0f,0f);
	}
	
	FiguraGeometrica (float base, float altura) {
		this.x=x;
		this.y=y;
	}
	
	abstract protected float calcularArea ();
}
