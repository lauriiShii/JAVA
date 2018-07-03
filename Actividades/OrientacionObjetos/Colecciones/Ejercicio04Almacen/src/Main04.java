public class Main04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		
		Almacen<String> almacen = new Almacen<String>();
		Almacen<Long> almacenLong = new Almacen<Long>();
		Caja<String> caja;	
		Caja<Long> cajaLong;
		for(x=0;x<10;x++){
			caja=new Caja<String>((String.format("Esta caja es la numero %d",x)));
			almacen.anhadir(caja);
			System.out.println(almacen.lista.get(x).contenido);
		}
		for(x=0;x<10;x++){
			cajaLong=new Caja<Long>((387L*x));
			almacenLong.anhadir(cajaLong);
			System.out.println(almacenLong.lista.get(x).contenido);
		}
		
	
		
		System.out.println();
		System.out.println(almacen.primero());
		System.out.println(almacen.ultimo());
		
		System.out.println(almacenLong.primero());
		System.out.println(almacenLong.ultimo());
	}

}
