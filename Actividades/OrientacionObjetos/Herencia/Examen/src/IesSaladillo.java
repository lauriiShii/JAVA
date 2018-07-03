
public class IesSaladillo {

	public static void main(String[] args) {

		int i, j, k;

		Alumno a1, a2, a3, a4, a2Clon, a3Clon, a4Clon;
		Profesor p1, p2, p3, p1Clon, p2Clon, p3Clon;

		try {

			/** ALUMNO CON NOMBRE NO CORRECTO **/
			// a1 = new Alumno ("4");

			/** 3 ALUMNOS Y 3 PROFESORES PARA METERLOS EN UN ARRAY **/
			a2 = new Alumno("Laura Calvente Dominguez");
			a3 = new Alumno("Julio Marquez Rodriguez");
			a4 = new Alumno("SamuelCalvente Dominguez");

			p1 = new Profesor("Ana Gutierrez Sanchez", 1500f);
			p2 = new Profesor("Eva Peralta Macias", 1800f);
			p3 = new Profesor("Jose Luke Mano", 1000f);

			Docente docentes[] = new Docente[] { a2, a3, a4, p1, p2, p3 };

			/** EJECUTAR EL ARRAY CON METODO Y TOSTRING **/
			for (i = 0; i < docentes.length; i++) {
				System.out.print(docentes[i].tipo_numero() + docentes[i].toString());
			}

			/** CLONAR LOS OBJETOS EN OTRO ARRAY **/
			a2Clon = (Alumno) a2.clone();
			a3Clon = (Alumno) a3.clone();
			a4Clon = (Alumno) a4.clone();

			p1Clon = (Profesor) p1.clone();
			p2Clon = (Profesor) p2.clone();
			p3Clon = (Profesor) p3.clone();

			Docente clonados[] = new Docente[] { a2Clon, a3Clon, a4Clon, p1Clon, p2Clon, p3Clon };

			System.out.println("\nPERSONAS CLONADAS : \n");

			for (j = 0; j < clonados.length; j++) {
				System.out.print(clonados[j].tipo_numero() + clonados[j].toString());
			}

			/** COMPROBAMOS QUE LOS CLONES SON IGUALES A SUS PADRES **/
			System.out.println("\n¿LOS CLONES SON IGUALES A SUS DOCENTES RESPECTIVOS?\n");

			for (k = 0; k < docentes.length; k++) {
				System.out.printf("¿%s y su clon son iguales?: %s%n", ((Persona) docentes[k]).getNombre(),
						docentes[k].equals(clonados[k]) ? "Si" : "No");
			}

			/** LLAMAMOS AL METODO VALIDAR **/
			validar(clonados);

			/** COMPROBAMOS QUE LOS DOCENTES CLONADOS HAN CAMBIADO **/
			System.out.println("\n¿LOS CLONES SON IGUALES A SUS DOCENTES RESPECTIVOS DESPUES DE VALIDARLOS?\n");

			for (k = 0; k < docentes.length; k++) {
				System.out.printf("¿%s y su clon son iguales?: %s%n", ((Persona) docentes[k]).getNombre(),
						docentes[k].equals(clonados[k]) ? "Si" : "No");
			}
			
			/**MOSTRAR CLONADOS**/
			for (j = 0; j < clonados.length; j++) {
				System.out.print(clonados[j].tipo_numero() + clonados[j].toString());
			}
			
		} catch (NombreIncorrectoException e) {
			System.out.println(e.getMessage());
		}

	}

	/** METODO QUE VALIDA **/
	public static void validar(Docente array[]) {
		int i;

		for (i = 0; i < array.length; i++) {
			if (array[i] instanceof Sueldo)
				((Sueldo) array[i]).aumentarSueldo(10);
			if (array[i] instanceof Notas)
				((Notas) array[i]).ponerNota(5.3);
			if (i % 2 == 0)
				((Persona) array[i]).setValidado(true);
			else
				((Persona) array[i]).setValidado(false);

		}

	}

}
