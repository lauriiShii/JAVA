package MismoPaquete;

public class SubclaseMismoPaquete extends MismaClase {

	/** MAIN **/
	public static void main(String[] args) {

		/** VISIVILIDAD **/
		MismaClase Clase = new MismaClase();

		Clase.friend = "friend";
		// Clase.privado="privado";
		Clase.protegido = "protegido";
		Clase.publico = "publico";

		// No usamos el getPrivado ya que esta clase no puede conocer el valor del atributo, lo daria como null
		System.out.printf(
				"Soy una clase hija de otra y estoy en el mismo paquete, por ello puedo conocer los atributos de mi padre que tienen visivilidad %s, %s y %s con ayuda de sus gets.%n",
				Clase.getFriend(), Clase.getProtegido(), Clase.getPublico());

		/** HERENCIA **/
		SubclaseMismoPaquete SubClase = new SubclaseMismoPaquete();

		SubClase.friend = "friend";
		//SubClase.privado="privado";
		SubClase.protegido = "protegido";
		SubClase.publico = "publico";
		
		System.out.printf(
				"Soy una clase hija de otra y estoy en el mismo paquete, por ello puedo conocer los atributos de mi padre que tienen visivilidad %s, %s y %s con ayuda de sus gets.%n"
						+ "Puedo aceder a un atributo %s con los metodos de mi padre que lo permitan.",
				SubClase.getFriend(), SubClase.getProtegido(), SubClase.getPublico(), SubClase.damePrivado());

	}
}
