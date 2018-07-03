

import Teclado.Limite;
import Teclado.Rango;
import Teclado.Teclado;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by Alejandro on 07/05/2016.
 */
public class MainTreeMap {
    public static void main(String[] args) {
        boolean salir = false;

        TreeMap<String, Animal> arbol = new TreeMap<String, Animal>();


        Animal gato = new Gatos("Gatete1", 25, "Neko", "Shampoo del bueno", false, "01/01/2001");
        gato.criar("CriaGato1", "26/05/2021");
        Animal loro = new Loros("Lorito1", 25, "Monstruo de las galletas", Alimentacion.HERBIVORAS, false, "02/01/2001");
        loro.criar("CriaLoro1", "15/06/1999");
        Animal perro = new Perros("Perraco1", 25, "Wan-chan", "Suave y sedoso de guaurnier", false, 9, "03/01/2001");
        Animal perro2 = new Perros("Perraco2", 25, "Wan-chan", "Suave y sedoso de guaurnier", false, 9, "04/01/2001");
        Animal perro3 = new Perros("Perraco3", 25, "Wan-chan", "Suave y sedoso de guaurnier", false, 9, "05/01/2001");
        Animal gato2 = new Gatos("Gatete2", 25, "Neko", "Shampoo del bueno", false, "06/01/2001");

        arbol.put(gato.codigo, gato);
        arbol.put(loro.codigo, loro);
        arbol.put(perro.codigo, perro);
        arbol.put(perro2.codigo, perro2);
        arbol.put(perro3.codigo, perro3);
        arbol.put(gato2.codigo, gato2);

        do {
            switch (Teclado.nextInt("Â¿QuÃ© quieres hacer?\n1. Nuevo Ã¡rbol\n2. AÃ±adir animal\n3. Mostrar el mÃ¡s pequeÃ±o\n4. Mostrar el mayor\n5. Mostrar Ã¡rbol\n6. Mostrar subÃ¡rbol\n7. Salir", 1, 7, EnumRango.AMBOSINCLUIDOS)) {
                case 1:
                    arbol.clear();
                    System.out.println("SE HA LIMPIADO EL Ã�RBOL");
                    break;
                case 2:
                    anhadirAnimal(arbol);
                    break;
                case 3:
                    if (!arbol.isEmpty())
                        System.out.println(arbol.firstKey());
                    else
                        System.out.println("EL Ã�RBOL ESTÃ� VACÃ�O");
                    break;
                case 4:
                    if (!arbol.isEmpty())
                        System.out.println(arbol.lastKey());
                    else
                        System.out.println("EL Ã�RBOL ESTÃ� VACÃ�O");
                    break;
                case 5:
                    mostrarArbol(arbol);
                    break;
                case 6:
                    mostrarSubArbol(arbol);
                    break;
                case 7:
                    salir = true;
                    break;
            }
        } while (!salir);
    }

    public static void anhadirAnimal(TreeMap<String, Animal> arbol) {
        boolean esMamifero, esPerroLoro, enfadado, habla;
        String nombre, raza, champu, fecha;
        byte agresividad, alimentacionAux;
        double cuota;
        Alimentacion alimentacion = null;
        Animal animal;

        esMamifero = Teclado.nextBoolean("Â¿QuÃ© es su mascota?", "MamÃ­fero", "Ave");
        fecha = Teclado.next("Â¿CuÃ¡ndo naciÃ³ su mascota?");

        if (esMamifero)
            esPerroLoro = Teclado.nextBoolean("Â¿QuÃ© tipo de mamÃ­fero es su mascota?", "Perro", "Gato");
        else
            esPerroLoro = Teclado.nextBoolean("Â¿QuÃ© tipo de ave es su mascota?", "Loro", "Periquito");

        nombre = Teclado.next("Â¿CÃ³mo se llama su mascota?");
        raza = Teclado.next("Â¿CuÃ¡l es su raza?");
        cuota = Teclado.nextDouble("Â¿CuÃ¡nto cree usted que vale pasar una noche en esta clÃ­nica de 5 peztrellas?", 0, EnumLimite.MAYOR);

        if (esMamifero) {
            champu = Teclado.next("Â¿QuÃ© champÃº usa su mascota?");
            enfadado = Teclado.nextBoolean("Â¿EstÃ¡ enfadada su mascota?", "SÃ­", "No");
            if (esPerroLoro) {
                agresividad = Teclado.nextByte("Â¿CÃ³mo de agresivo es su perro? (0-100)", (byte) 0, (byte) 100, EnumRango.AMBOSINCLUIDOS);
                animal = new Perros(nombre, cuota, raza, champu, enfadado, agresividad, fecha);
                arbol.put(animal.codigo, animal);
            } else {
                animal = new Gatos(nombre, cuota, raza, champu, enfadado, fecha);
                arbol.put(animal.codigo, animal);
            }
        } else {
            alimentacionAux = Teclado.nextByte("Â¿QuÃ© tipo de alimentaciÃ³n lleva su mascota? 1.-InsectÃ­vora 2.-HerbÃ­vora 3.-OmnÃ­vora 4.-CarnÃ­vora", (byte) 1, (byte) 4, EnumRango.AMBOSINCLUIDOS);
            switch (alimentacionAux) {
                case 1:
                    alimentacion = Alimentacion.INSECTIVORAS;
                    break;
                case 2:
                    alimentacion = Alimentacion.HERBIVORAS;
                    break;
                case 3:
                    alimentacion = Alimentacion.OMNIVORAS;
                    break;
                case 4:
                    alimentacion = Alimentacion.CARNIVORAS;
                    break;
            }

            if (esPerroLoro) {
                habla = Teclado.nextBoolean("Â¿Habla su mascota?", "SÃ­", "No");
                animal = new Loros(nombre, cuota, raza, alimentacion, habla, fecha);
                arbol.put(animal.codigo, animal);
            } else {
                animal = new Periquitos(nombre, cuota, raza, alimentacion, fecha);
                arbol.put(animal.codigo, animal);
            }
        }
        System.out.println("Mascota aÃ±adida");
    }

    public static void mostrarArbol(TreeMap<String, Animal> arbol) {
        ArrayList<Animal> lista = new ArrayList<Animal>(arbol.values());

        if (!arbol.isEmpty())
            for (Animal a : lista)
                System.out.println(a);
        else
            System.out.println("EL MAPA ESTÃ� VACÃ�O");
    }

    public static void mostrarSubArbol(TreeMap<String, Animal> arbol) {
        int cont = 1;
        String cod1, cod2;
        int pos1 = 0, pos2 = 0;
        Animal a1 = null, a2 = null, aux;
        SortedMap<String, Animal> subArbol;
        ArrayList<Animal> lista = new ArrayList<Animal>(arbol.values());
        ArrayList<Animal> lista2;

        if (!lista.isEmpty()) {
            cod1 = Teclado.next("Introduce la primera clave");
            cod2 = Teclado.next("Introduce la segunda clave");

            for (Animal a : lista) {
                if (a.codigo.equals(cod1)) {
                    pos1 = cont;
                    a1 = a;
                } else if (a.codigo.equals(cod2)) {
                    pos2 = cont;
                    a2 = a;
                }
                cont++;
            }
            if (a1 != null || a2 != null) {
                if (pos1 > pos2) { //Compruebo que la posiciÃ³n de a1 sea mayor que la de a2, y si lo son los cambio
                    aux = a1;
                    a1 = a2;
                    a2 = aux;
                }

                subArbol = arbol.subMap(a1.codigo, true, a2.codigo, true); //Los booleans lo que hacen es incluir los objetos seleccionados por parÃ¡metros en el subÃ¡rbol
                lista2 = new ArrayList<Animal>(subArbol.values());
                for (Animal a : lista2)
                    System.out.println(a);

            } else
                System.out.println("ERROR, HAY UNA CLAVE INCORRECTA");
        } else
            System.out.println("EL MAPA ESTÃ� VACÃ�O");
    }
}
