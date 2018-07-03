package BoletinEstructurada;
import java.util.Scanner;

public class Ejercicio05 {

	/**
	 * Los empleados de una fábrica trabajan en dos turnos: diurno y nocturno.
	 * Se desea calcular el jornal diario de acuerdo con los siguientes tarifas:
	 * La tarifa de las horas diurnas es de 3 € por hora, mientras que el de las
	 * nocturnas es de 4,80 € por hora. Cuando se trata de un día festivo, la
	 * tarifa se incrementa en 1,20 € por hora en el turno diurno y 1,80 € por
	 * hora en el nocturno.
	 */
	public static void main(String[] args) {

		/** VARIABLES Y OBJETOS */
		Scanner teclado = new Scanner(System.in);
		int turno; // Si el turno es 1 es nocturno si es 2 sera diurno
		int turnoCompartido; // 1 sera que solo tiene un tipo de turno y 2 que
								// tiene tanto horas de noche como de dia
		int festivo, horasNocturnas, horasDiurnas, horas;
		final double INCREMENTODIURNO = 1.20;
		final double INCREMENTONOCTURNO = 1.80;
		final double HORADIURNA = 3;
		final double HORANOCTURNA = 4.80;

		/** PEDIMOS DATOS */
		do {
			System.out
					.println("Introduce los siguientes datos para calcular su jornal: "
							+ "\nUn turno compratido es aquel que ocupa horas tanto diurnas como nocturnas.\n"
							+ "Tipo de turno (1.Compartido o 2.No compartido): ");
			turnoCompartido = teclado.nextInt();

			// SI EL TURNO TIENE HORAS DIURNAS Y NOCTURNAS
			if (turnoCompartido == 1) {
				do {
					System.out.println("Horas nocturnas trabajadas: ");
					horasNocturnas = teclado.nextInt();

					System.out.println("Horas diurnas trabajadas: ");
					horasDiurnas = teclado.nextInt();

					System.out
							.println("¿Hoy fué un día festivo?(1.Si o 2.No): ");
					festivo = teclado.nextInt();

					if (horasNocturnas <= 0 || horasDiurnas <= 0 || festivo < 1
							|| festivo > 2)
						System.out
								.println("Introduce siempre valores positivos y siguiendo las restricciones.");
					else // CALCULAMOS EL SALARIO

					if (festivo == 1)// FESTIVO
						System.out
								.println("Su salario del día es: "
										+ (horasNocturnas
												* (INCREMENTONOCTURNO + HORANOCTURNA) + horasDiurnas
												* (INCREMENTODIURNO + HORADIURNA)));

					else
						// NO FESTIVO
						System.out.println("Su salario del día es: "
								+ (horasNocturnas * HORANOCTURNA + horasDiurnas
										* HORADIURNA));

				} while (horasNocturnas <= 0 || horasDiurnas <= 0
						|| festivo < 1 || festivo > 2);
			}
			// SI EL TURNO ES DE UN TIPO SOLO
			else {
				do {
					System.out
							.println("Tipo de turno(1.Diurno o 2.Nocturno): ");
					turno = teclado.nextInt();

					System.out.println("Horas trabajadas: ");
					horas = teclado.nextInt();

					System.out
							.println("¿Hoy fué un día festivo?(1.Si o 2.No): ");
					festivo = teclado.nextInt();

					if (turno < 1 || turno > 2 || festivo < 1 || festivo > 2
							|| horas <= 0)
						System.out
								.println("introduce siempre valores positivos y siguiendo las restricciones.");
					else { // CALCULAMOS EL SALARIO

						if (festivo == 1 && turno == 1)// FESTIVO Y DIURNO
							System.out
									.println("Su salario del día es: "
											+ (horas * (INCREMENTODIURNO + HORADIURNA)));

						else if (festivo == 1 && turno == 2)// FESTIVO Y
															// NOCTURNO
							System.out
									.println("Su salario del día es: "
											+ (horas * (HORANOCTURNA+INCREMENTONOCTURNO)));
						
						else if (festivo == 2 && turno == 1)//NO FESTIVO Y DIURNO
							System.out.println("Su salario del día es: "
									+ (horas * HORADIURNA));
						
						else if (festivo == 2 && turno == 2)//NO FESTIVO Y NOCTURNO
							System.out.println("Su salario del día es: "
									+ (horas * HORANOCTURNA));

					}

				} while (turno < 1 || turno > 2 || festivo < 1 || festivo > 2
						|| horas <= 0);

			}

			if (turnoCompartido < 1 || turnoCompartido > 2)
				System.out
						.println("Introduce un valor correcto para indicar si el turno es compartido o no.");

		} while (turnoCompartido < 1 || turnoCompartido > 2);

		teclado.close();

	}

}
