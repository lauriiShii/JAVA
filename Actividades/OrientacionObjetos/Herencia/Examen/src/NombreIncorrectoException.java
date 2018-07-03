
public class NombreIncorrectoException extends Exception{

	private static final long serialVersionUID = 1L;

	public NombreIncorrectoException (String mensaje)
	{
		super(mensaje); //SI QUIERO QUE ESE MENSAJE SE MUESTRE EN EL CATCH, USAR EL METODO GET.MESSAGE
	}
	
}
