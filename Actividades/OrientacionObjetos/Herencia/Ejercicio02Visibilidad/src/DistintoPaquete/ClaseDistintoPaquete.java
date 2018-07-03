package DistintoPaquete;

import MismoPaquete.MismaClase;

public class ClaseDistintoPaquete {

	/**MAIN**/
	public static void main(String[] args) {
		
		/**VISIVILIDAD**/
		MismaClase Clase = new MismaClase();
		
		//Clase.friend = "friend";
		// Clase.privado="privado";
		//Clase.protegido = "protegido";
		Clase.publico = "publico";

		// getFriend, getPrivado y getProtegido no servira aqui ya que al ser una clase de otro paquete no puede conocer el valor de sus atributos
		System.out.printf(
				"Estoy en un paquete distinto a la que contiene los atributos que intento usar, por ello solo puedo conocer aquellos con  visivilidad %s con ayuda de su get.%n",
				Clase.getPublico());
	}
}
