
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import Teclado.Teclado;

public class Main {


	public static void main(String[] args) {

		ArrayList<Vehiculo> list = new ArrayList<Vehiculo>();
		
		System.out.println("MENÚ");
		System.out.println(""
				+ "1. Insertar un vehículo nuevo, es decir, un coche, una moto o un triciclo. "
				+ "\n2. Mostrar los vehículos insertados en el mismo orden en el que fueron introducidos. "
				+ "\n3. Mostrar el número de vehículos introducidos. "
				+ "\n4. Modificar el estado de un vehículo a motor"
				+ "\n5. Mostrar sublista al revés. "
				+ "\n6. Clonar un vehículo."
				+ "\n7. Salir.");
	
		menu(list);
	}
	public static void menu(ArrayList<Vehiculo> list){
		boolean salir = false;
		int n = 0,i = 0;
		Vehiculo clon;
		HashSet<Vehiculo> sin;
		do{
			n = Teclado.numeroInt("\nElige una opcion del menu");
			
			if(n<=0 || n>9)
				System.out.println("Opcion invalida, vuelva a intentarlo\n");
		
		switch(n){
			// AÑADIR VEHICULO. 
			case 1:	anhadirVehiculo(list);
					break;
			// MOSTRAR LISTA
			case 2:	sin = new HashSet<Vehiculo>(list);
					list.clear();
					list.addAll(sin);
					for(Vehiculo o:list)
						System.out.println("\n"+o.getClass().getSimpleName()+"\n"+o);
					break;
			// CANTIDAD VEHICULOS
			case 3: System.out.println("En la lista hay: "+list.size()+" vehiculos");
					break;
			// AÑADIR EMPLEADO
			case 4: do{
						i = Teclado.numeroInt("Introduzca la posicion del vehiculo deseado.");
						
						if(list.get(i-1) instanceof Triciclo)
							System.out.println("El tricilo funciona a pedales...");
						if(i<=0 || i>list.size())
							System.out.println("Opcion incorrecta");
						
					}while(i<=0 || i>list.size() || list.get(i-1) instanceof Triciclo);
			
					modificarVehiculo(list,i-1);
					break;
			// SALIR
			case 5: mostrarSub(list);
					break;
			case 6:	do{
						i = Teclado.numeroInt("Introduzca la posicion del vehiculo deseado.");
						
						if(i<=0 || i>list.size())
							System.out.println("Opcion incorrecta");
						
					}while(i<=0 || i>list.size());
					clon = (Vehiculo) list.get(i-1).clone();
					list.add(clon);
					break;
			case 7: salir = true;
					break;
			
		}
	}while(n<=0 || n>6 || salir !=true);
	}
	public static void anhadirVehiculo(ArrayList<Vehiculo> list){
		int n;
		GregorianCalendar formato = new GregorianCalendar(Calendar.YEAR,Calendar.MONTH,Calendar.DAY_OF_YEAR);
		Date fecha = null;
		
		fecha = new Date(formato.getTimeInMillis());
		
		System.out.println("VECHICULOS DISPONIBLES");
		System.out.println("1. Moto \n2. Coche \n3. Triciclo ");
		
		do{
			n = Teclado.numeroInt("Que opcion eliges");
			if(n !=1 && n!=2 && n!=3)
				System.out.println("Opcion incorrecta");
			switch(n){
				case 1: list.add(new Moto("9597 BFP",Marcas.GLOBE,fecha,125,60));break;
				case 2: list.add(new Coche("9597 FLY",Marcas.SKIPE,fecha,1400,110));break;
				case 3: list.add(new Triciclo("MERCADONA",Marcas.GLOBE,fecha));break;
			}
		}while(n !=1 && n!=2 && n!=3);
	}	
	public static void modificarVehiculo(ArrayList<Vehiculo> list, int i){
		int n = 0; 
		Vehiculo_motor m = null;
		System.out.println(""
				+ "1. Arrancar. "
				+ "\n2. Parar. "
				+ "\n3. Subir de marcha. "
				+ "\n4. Bajar de marcha"
				+ "\n5. Punto muerto. "
				+ "\n6. Marcha atras.");
		do{
			n = Teclado.numeroInt("\nQue desea hacer seleccione una opcion");
			
			if(n !=1 && n!=2 && n!=3 && n!=4 && n!=5 && n!=6)
				System.out.println("Opcion invalida, vuelva a intentarlo\n");
			
			if(list.get(i-1) instanceof Moto || list.get(i-1) instanceof Coche){
				m = (Vehiculo_motor) list.get(i-1);
				switch(n){
					case 1:	m.arrancar();
							if(m.estaApagado == false)
								System.out.println("El coche esta encendido");
							else
								System.out.println("El coche esta apagado");
							break;
					case 2:	m.parar();
							System.out.println("Ahora la velocidad del vechiculo es: "+m.velocidad);
							break;
					case 3:	m.subir_marcha();
							System.out.println("Ahora la velocidad del vechiculo es: "+m.velocidad);
							break;
					case 4:	m.bajar_marcha();
							System.out.println("Ahora la velocidad del vechiculo es: "+m.velocidad);
							break;
					case 5:	m.punto_muerto();
							System.out.println("Ahora la velocidad del vechiculo es: "+m.velocidad);
							break;
					case 6: m.marcha_atras();
							if(m.delante == false)
								System.out.println("El coche va marcha atras");
							else
								System.out.println("El coche va hacia delante");
							break;
				}
			}
			else
				System.out.println("Haz elegido un tricilo, eso no arranca ni sube de marcha, solo pedalea");	
		}while(n !=1 && n!=2 && n!=3 && n!=4 && n!=5 && n!=6);
	}
	
	public static void mostrarSub(ArrayList<Vehiculo> list){
		int n = 0,j;
		@SuppressWarnings("unused")
		List<Vehiculo> subList; 
		do{
			n = Teclado.numeroInt("\nSeleccione un indice menor");
			j = Teclado.numeroInt("\nSeleccione otro indice mayor");
			
			if(n<=0 || n>list.size())
				System.out.println("Opcion invalida, vuelva a intentarlo\n");
			if(n>j)
				throw new IllegalArgumentException();
			else {
				subList = list.subList(j, n);
				for(j = list.size(); j<0; j--)
					System.out.println("SUBLISTA ALREVES\n"+list.get(j));
			}
		}while(n<=0 || n>list.size());
	}
	
	
	
	}


