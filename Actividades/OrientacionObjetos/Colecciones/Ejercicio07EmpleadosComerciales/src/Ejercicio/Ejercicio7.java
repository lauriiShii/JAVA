package Ejercicio;

import Herencia.Empleado;
import Herencia.Encargado;
import Herencia.Jefe;
import Herencia.Trabajador;
import Teclado.Teclado;
import Teclado.Rango;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by José Luis on 05/05/2016.
 */
public class Ejercicio7 {
    public static void subMenuDelSubmenu(ArrayList<Empleado> lista) {
        boolean salir = false;
        do {
            System.out.printf("1. Si quiere crear que sea un Trabajador\n" +
                    "2. Si quiere crear un Encargado\n" +
                    "3. Si quiere crear un Jefe\n" +
                    "4. Salir\n");

            switch (Teclado.numeroByte("Introduce una opción: ")) {
                case 1:
                    lista.add(new Trabajador(Teclado.cadena("Introduce la fecha: "), Teclado.cadena("Introduce el nombre que desea ponerle: "), Teclado.numeroByte("Introduce el numero de horas: ")));
                    System.out.printf("Añadiendo en la posición %s", lista.size() - 1);
                    break;
                case 2:
                    lista.add(new Encargado(Teclado.cadena("Introduce la fecha: "), Teclado.cadena("Introduce el nombre que desea ponerle: "), Teclado.numeroByte("Introduce el numero de horas: "), Teclado.cadena("Introduce una descripción: ")));
                    System.out.printf("Añadiendo en la posición %s", lista.size() - 1);
                    break;
                case 3:
                    lista.add(new Jefe(Teclado.cadena("Introduce la fecha: "), Teclado.cadena("Introduce el nombre que desea ponerle: "), Teclado.numeroByte("Introduce el numero de horas: "), Teclado.cadena("Introduce una descripción: ")));
                    System.out.printf("Añadiendo en la posición %s", lista.size() - 1);
                    break;
                case 4:
                    System.out.println("Saliendo del submenu...");
                    salir = true;
                    break;
                default:
                    System.out.println("Esa opción es erronea.");
                    break;
            }
        } while (!salir);
    }

    public static void subMenuDelSubmenu2(ArrayList<Empleado> lista) {
        boolean salir = false;
        int posicion, opcion;
        do {
            System.out.printf("1. Si quiere crear que sea un Trabajador\n" +
                    "2. Si quiere crear un Encargado\n" +
                    "3. Si quiere crear un Jefe\n" +
                    "4. Salir\n");
            switch (Teclado.numeroByte("Introduce una opción: ")) {
                case 1:
                    lista.add(Teclado.numeroByte("Introduce la posición: ", 0, lista.size(), Rango.INCLUIDO_MIN_MAX), new Trabajador(Teclado.cadena("Introduce la fecha: "), Teclado.cadena("Introduce el nombre que desea ponerle: "), Teclado.numeroByte("Introduce el numero de horas: ")));
                    System.out.println("Guardado..");
                    break;
                case 2:
                    lista.add(Teclado.numeroByte("Introduce la posición: ", 0, lista.size(),Rango.INCLUIDO_MIN_MAX), new Encargado(Teclado.cadena("Introduce la fecha: "), Teclado.cadena("Introduce el nombre que desea ponerle: "), Teclado.numeroByte("Introduce el numero de horas: "), Teclado.cadena("Introduce una descripción: ")));
                    System.out.println("Guardado..");
                    break;
                case 3:
                    lista.add(Teclado.numeroByte("Introduce la posición: ", 0, lista.size(), Rango.INCLUIDO_MIN_MAX), new Jefe(Teclado.cadena("Introduce la fecha: "), Teclado.cadena("Introduce el nombre que desea ponerle: "), Teclado.numeroByte("Introduce el numero de horas: "), Teclado.cadena("Introduce una descripción: ")));
                    System.out.println("Guardado..");
                    break;
                case 4:
                    System.out.println("Saliendo del submenu...");
                    salir = true;
                    break;
                default:
                    System.out.println("Esa opción es erronea.");
                    break;
            }
        } while (!salir);
    }

    public static void subMenu(ArrayList<Empleado> lista) {
        boolean salir = false;
        do {
            System.out.printf("2.1. Añadir un empleado\n" +
                    " 2.2. Añadir un empleado en una posición\n" +
                    " 2.3. Salir\n");
            switch (Teclado.numeroByte("Introduce una opción: ")) {
                case 1:
                    subMenuDelSubmenu(lista);
                    break;
                case 2:
                    subMenuDelSubmenu2(lista);
                    break;
                case 3:
                    System.out.println("Saliendo del submenu...");
                    salir = true;
                    break;
                default:
                    System.out.println("Esa opción es erronea.");
                    break;
            }
        } while (!salir);
    }

    public static void subMenuEliminar(ArrayList<Empleado> lista) {
        int posicion, contador = 1, copiaI;
        Empleado antiguo = null;
        String nombreBusqueda;
        boolean salir = false, encontrado = false;
        do {
            System.out.printf(" 3.1. Eliminar por posición\n" +
                    " 3.2. Eliminar por contenido\n" +
                    " 3.3. Salir\n");

            switch (Teclado.numeroByte("Introduce una opción: ")) {
                case 1:
                    posicion = Teclado.numeroByte("Introduce la posición que desea modificar: ", 0, lista.size(), Rango.INCLUIDO_MIN_MAX);
                    lista.remove(posicion);
                    System.out.println("Eliminado..");
                    break;
                case 2:
                    encontrado = false;
                    contador = 1;
                    nombreBusqueda = Teclado.cadena("Introduce el nombre a eliminar: ");
                    for (int i = 0; i < lista.size() && !encontrado; i++) {
                        if (lista.get(i).getNombre().equals(nombreBusqueda)) {
                            encontrado=true;
                            antiguo = lista.get(i);
                        }
                    }
                    if (antiguo == null)
                        System.out.printf("Parece que no existe ese usuario con nombre %s.\n", nombreBusqueda);
                    else
                        while (lista.remove(antiguo)) { // Mientras sea true, sigue eliminando
                            System.out.printf("Se elimino %s\n", contador);
                            contador++;
                        }
                    break;
                case 3:
                    System.out.println("Saliendo del submenu...");
                    salir = true;
                    break;
                default:
                    System.out.println("Esa opción es erronea.");
                    break;
            }
        } while (!salir);
    }

    public static void modificandoEmpleado(int posicion, ArrayList<Empleado> lista) {
        boolean salir = false;
        do {
            System.out.printf("1. incrementar_horas_trabajadas\n" +
                    " 2. venta_realizad\n" +
                    " 3. aumento_productividad\n" +
                    " 4. Salir\n");
            switch (Teclado.numeroByte("Introduce una opción: ")) {
                case 1:
                    lista.get(posicion).incrementar_horas_trabajadas(Teclado.numeroByte("Introduce las horas a incrementar: "));
                    break;
                case 2:
                    lista.get(posicion).venta_realizada(Teclado.numeroByte("Introduce el numero de venta: "), Teclado.numeroLong("Ubtroduce el importe"));
                    break;
                case 3:
                    lista.get(posicion).aumento_productividad(Teclado.numeroByte("Aumenta productividad en porcentaje: "));
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Esa opción es erronea.");
                    break;
            }
        } while (!salir);
    }

    public static void main(String[] args) {
        int posicion, i;
        Empleado antiguo;
        ArrayList<Empleado> lista = new ArrayList<Empleado>();
        lista.add(new Trabajador("1", "nombre", 0));
        lista.add(new Trabajador("1", "nombre2", 0));
        lista.add(new Trabajador("1", "nombre3", 0));
        lista.add(new Trabajador("1", "nombre3", 0));
        boolean salir = false;
        do {
            System.out.printf("1. Nueva lista de empleados\n" +
                    "2. Insertar un empleado nuevo\n" +
                    "3. Eliminar un empleado\n" +
                    "4. Modificar un empleado\n" +
                    "5. Consultar un empleado\n" +
                    "6. Consultar lista de empleados\n" +
                    "7. Mostrar el número de empleados introducidos.\n" +
                    "8. Clonar un empleado\n" +
                    "9. Salir\n");
            switch (Teclado.numeroByte("Introduce una opción: ")) {
                case 1:
                    System.out.println("Nueva lista creada, se reemplazo la anterior");
                    lista.clear();
                    break;
                case 2:
                    subMenu(lista);
                    break;
                case 3:
                    subMenuEliminar(lista);
                    break;
                case 4:
                    posicion = Teclado.numeroByte("Introduce la posición que desea modificar: ", 0, lista.size(), Rango.INCLUIDO_MIN_MAX);
                    antiguo = lista.get(posicion);
                    System.out.printf("Antiguo: %s", antiguo);
                    modificandoEmpleado(posicion, lista);
                    System.out.printf("Nuevo: %s", lista.get(posicion));
                    break;
                case 5:
                    System.out.printf("%s", lista.get(Teclado.numeroByte("Introduce la posición que desea consultar: ", 0, lista.size(), Rango.INCLUIDO_MIN_MAX)));
                    break;
                case 6:
                    for (i = 0; i < lista.size(); i++)
                        System.out.printf("%s.- %s", i, lista.get(i));
                    System.out.println();
                    break;
                case 7:
                    System.out.printf("Acutualmente tenemos %s introducidos", lista.size());
                    break;
                case 8:
                    posicion = Teclado.numeroByte("Introduce la posición que desea clonar: ", 0, lista.size(), Rango.INCLUIDO_MIN_MAX);
                    lista.add((Empleado) lista.get(posicion).clone());
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
                default:
                    System.out.println("Esa opción es erronea.");
            }
        } while (!salir);
    }
}
