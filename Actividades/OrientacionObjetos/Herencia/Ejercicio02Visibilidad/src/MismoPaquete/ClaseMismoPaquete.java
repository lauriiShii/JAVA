package MismoPaquete;

public class ClaseMismoPaquete {
	
	/**MAIN**/
	public static void main(String[] args) {
		
		/**VISIVILIDAD**/
		MismaClase Clase = new MismaClase();
		
		Clase.friend = "friend";
		// Clase.privado="privado";
		Clase.protegido = "protegido";
		Clase.publico = "publico";

		// No usamos el getPrivado ya que esta clase no puede conocer el valor del atributo, lo daria como null
		System.out.printf(
				"Una clase esta en el mismo paquete que yo, por ello tengo acceso a sus atributos con visivilidad %s, %s y %s con ayuda de sus gets.%n",
				Clase.getFriend(), Clase.getProtegido(), Clase.getPublico());
	}
}
