public class Caja<T> {

	T contenido;
	
	public Caja (T contenido){
		this.contenido=contenido;
	}
	
	public T getContenido(){
		return contenido;
	}
	
	public void setContenido(T contenido){
		this.contenido=contenido;
	}
		
}
