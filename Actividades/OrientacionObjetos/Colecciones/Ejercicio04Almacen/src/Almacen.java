import java.util.ArrayList;



public class Almacen<T> implements Generizable<T>{

	ArrayList<Caja<T>> lista ;

	
	 Almacen(){
		 
		 lista = new ArrayList<Caja<T>>();
	//	for(int x=0;x<10;x++)
		//	lista.add(new Caja<T>(null));
	}
	 public void anhadir(Caja<T> caja){
		 lista.add(caja);
	 }
	 
	@Override
	public T primero() {
		// TODO Auto-generated method stub
		return lista.get(0).getContenido();
	}

	
	@Override
	public T ultimo() {
		// TODO Auto-generated method stub
		return lista.get(lista.size()-1).getContenido();
	}

}
