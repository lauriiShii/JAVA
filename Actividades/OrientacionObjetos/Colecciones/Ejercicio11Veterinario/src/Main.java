

import Teclado.Limite;
import Teclado.Rango;
import Teclado.Teclado;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int menu;
        boolean salir = false;
        HashMap<String, Animal> mapa = new HashMap<String, Animal>();

        Animal gato = new Gatos("Gatete", 25, "Neko", "Shampoo del bueno", false);
        gato.criar("CriaGato1", "20/05/2021");
        Animal loro = new Loros("Lorito", 25, "Monstruo de las galletas", Alimentacion.HERBIVORAS, false);
        loro.criar("CriaLoro1", "15/06/1999");

        mapa.put(gato.codigo, gato);
        mapa.put(loro.codigo, loro);

        do {
            menu = Teclado.numeroInt("Â¿QuÃ© quieres hacer?\n" +
                    "1. Nuevo mapa\n" +
                    "2. AÃ±adir animal\n" +
                    "3. Eliminar animal\n" +
                    "4. NÃºmero total de animales\n" +
                    "5. Mostrar mapa\n" +
                    "6. Sorteo\n" +
                    "7. Buscar una mascota y hacerla hablar. Comprobar si estÃ¡ enfadada.\n" +
                    "8. Clonar una mascota con sus crÃ­as.\n" +
                    "9. Salir", 1, 9, Rango.INCLUIDO_MIN_MAX);

            switch (menu) {
                case 1:
                    mapa.clear();
                    System.out.println("SE HA LIMIPADO EL MAPA");
                    break;
                case 2:
                    anhadirAnimal(mapa);
                    break;
                case 3:
                    eliminarAnimal(mapa);
                    break;
                case 4:
                    System.out.println(contarAnimales(mapa));
                    break;
                case 5:
                    mostrarMapa(mapa);
                    break;
                case 6:
                    sorteo(mapa);
                    break;
                case 7:
                    buscarMascota(mapa);
                    break;
                case 8:
                    clonarMascota(mapa);
                    break;
                case 9:
                    salir = true;
                    break;
            }

        } while (!salir);
    }

    public static void anhadirAnimal(HashMap<String, Animal> mapa) {
        boolean esMamifero, esPerroLoro, enfadado, habla;
        String nombre, raza, champu;
        byte agresividad, alimentacionAux;
        double cuota;
        Alimentacion alimentacion = null;
        Animal animal;

        esMamifero = Teclado.booleano("Â¿QuÃ© es su mascota?", "MamÃ­fero", "Ave");

        if (esMamifero)
            esPerroLoro = Teclado.booleano("Â¿QuÃ© tipo de mamÃ­fero es su mascota?", "Perro", "Gato");
        else
            esPerroLoro = Teclado.booleano("Â¿QuÃ© tipo de ave es su mascota?", "Loro", "Periquito");

        nombre = Teclado.cadena("Â¿CÃ³mo se llama su mascota?");
        raza = Teclado.cadena("Â¿CuÃ¡l es su raza?");
        cuota = Teclado.numeroDouble("Â¿CuÃ¡nto cree usted que vale pasar una noche en esta clÃ­nica de 5 peztrellas?", 0, Limite.MAYOR);

        if (esMamifero) {
            champu = Teclado.cadena("Â¿QuÃ© champÃº usa su mascota?");
            enfadado = Teclado.booleano("Â¿EstÃ¡ enfadada su mascota?", "SÃ­", "No");
            if (esPerroLoro) {
                agresividad = Teclado.numeroByte("Â¿CÃ³mo de agresivo es su perro? (0-100)", (byte) 0, (byte) 100, Rango.INCLUIDO_MIN_MAX);
                animal = new Perros(nombre, cuota, raza, champu, enfadado, agresividad);
                mapa.put(animal.codigo, animal);
            }
            else {
                animal = new Gatos(nombre, cuota, raza, champu, enfadado);
                mapa.put(animal.codigo, animal);
            }
        }
        else {
            alimentacionAux = Teclado.numeroByte("Â¿QuÃ© tipo de alimentaciÃ³n lleva su mascota? 1.-InsectÃ­vora 2.-HerbÃ­vora 3.-OmnÃ­vora 4.-CarnÃ­vora", (byte) 1, (byte) 4, Rango.INCLUIDO_MIN_MAX);
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
                habla = Teclado.booleano("Â¿Habla su mascota?", "SÃ­", "No");
                animal = new Loros(nombre, cuota, raza, alimentacion, habla);
                mapa.put(animal.codigo, animal);
            }
            else {
                animal = new Periquitos(nombre, cuota, raza, alimentacion);
                mapa.put(animal.codigo, animal);
            }
        }
        System.out.println("Mascota aÃ±adida");
    }

    public static void eliminarAnimal(HashMap<String, Animal> mapa) {
        String claveAnimal;

        if (!mapa.isEmpty()) {
            claveAnimal = Teclado.cadena("Introduce la clave del animal que quieres eliminar");
            if (mapa.remove(claveAnimal) != null)
                System.out.println("SE HA ELIMINADO SIN PROBLEMAS");
            else
                System.out.println("NO EXISTE ESE ANIMAL, Â¡ANIMAL!");
        } else
            System.out.println("EL MAPA ESTÃ� VACÃ�O");
    }

    public static String contarAnimales(HashMap<String, Animal> mapa) {
        int i, numPerros = 0, numGatos = 0, numLoros = 0, numPeriquitos = 0, numCrias = 0;
        Animal animalAux;
        Iterator<Animal> it;

        it = mapa.values().iterator(); //El Entry es para coger entrySet() y coger asÃ­ el iterador
        while (it.hasNext()) {
            animalAux = it.next();

            if (animalAux instanceof Perros)
                numPerros++;
            else if (animalAux instanceof Gatos)
                numGatos++;
            else if (animalAux instanceof Loros)
                numLoros++;
            else if (animalAux instanceof Periquitos)
                numPeriquitos++;

            //Contar crias
            for (i = 0; i < animalAux.getCrias().length; i++)
                if (animalAux.getCrias()[i] != null)
                    numCrias++;
        }
        return String.format("Hay %d perros, %d gatos, %d loros, %d periquitos y %d crias en total%n", numPerros, numGatos, numLoros, numPeriquitos, numCrias);
    }

    public static void mostrarMapa(HashMap<String, Animal> mapa) {
        boolean salir = false;
        int menu;
        ArrayList<Animal> lista = new ArrayList<Animal>(mapa.values());
        ListIterator<Animal> it;

        if (!mapa.isEmpty()) {
            do {
                menu = Teclado.numeroInt("Â¿CÃ³mo quieres mostrar el resultado?\n" +
                        "1. Mostrar hacia delante\n" +
                        "2. Mostrar hacia atrÃ¡s\n" +
                        "3. Salir", 1, 3, Rango.INCLUIDO_MIN_MAX);
                switch (menu) {
                    case 1:
                        for (Animal a:lista)
                            System.out.println(a);
                        break;
                    case 2:
                        it = lista.listIterator(lista.size());
                        while (it.hasPrevious())
                            System.out.println(it.previous());
                        break;
                    case 3:
                        salir = true;
                        break;
                }
            } while (!salir);
        } else
            System.out.println("EL MAPA ESTÃ� VACÃ�O");
    }

    public static void sorteo(HashMap<String, Animal> mapa) {
        final int PORCENTAJE = 10;
        class Loteria {
            ArrayList<Animal> lista;
            public Loteria() {
                lista = new ArrayList<Animal>(mapa.values()); //Lo paso a ArrayList para poder sacar un aleatorio
            }
            public String sortear() {
                int i = new Random().nextInt(lista.size());
                return lista.get(i).codigo;
            }
        }

        Loteria loto = new Loteria();
        Animal animal = mapa.get(loto.sortear());
        animal.setCuotaMensual(animal.getCuotaMensual() * PORCENTAJE / 100);
        System.out.printf("Se ha reducido la cuota de %s%n", mapa.get(animal.codigo).getNombre());
    }

    public static void buscarMascota(HashMap<String, Animal> mapa) {
        String claveAnimal;
        Animal animalAux;

        if (!mapa.isEmpty()) {
            claveAnimal = Teclado.cadena("Introduce la clave del animal que quieres buscar");
            if (mapa.containsKey(claveAnimal)) {
                animalAux = mapa.get(claveAnimal);
                System.out.printf("%s dijo %s%n", animalAux.getNombre(), animalAux.hablar());
                System.out.printf("%s %s%n", animalAux.getNombre(), animalAux.enfadarse() ? "estÃ¡ enfadado" : "no estÃ¡ enfadado");
            } else
                System.out.printf("NO EXISTE EL ANIMAL CON LA CLAVE %s%n", claveAnimal);
        } else
            System.out.println("EL MAPA ESTÃ� VACÃ�O");
    }

    public static void clonarMascota(HashMap<String, Animal> mapa) {
        String claveAnimal;
        Animal animalAux, clon;

        if (!mapa.isEmpty()) {
            claveAnimal = Teclado.cadena("Introduce la clave del animal que quieres buscar");
            if (mapa.containsKey(claveAnimal)) {
                animalAux = mapa.get(claveAnimal);
                clon = (Animal) animalAux.clone();
                System.out.printf("Original: %s%s%nClon: %s%s%n", animalAux, animalAux.getCrias().toString(), clon, clon.getCrias().toString());
                System.out.println(animalAux.equals(clon)?"SON IGUALES":"NO SON IGUALES");
                System.out.println("Cambiando la primera crÃ­a del clon");

                if (clon.getCrias()[0] != null)
                    clon.getCrias()[0].setNombre("Moddy-chan");
                System.out.printf("Original: %s%nClon: %s%n", animalAux, clon);
                System.out.println(animalAux.equals(clon)?"SON IGUALES":"NO SON IGUALES");
            }
            else
                System.out.printf("NO EXISTE EL ANIMAL CON LA CLAVE %s%n", claveAnimal);
        }
        else
            System.out.println("EL MAPA ESTÃ� VACÃ�O");
    }
}
