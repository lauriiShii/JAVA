

public abstract class Forma {

	public abstract String toString();
	
	public String identidad(){
		return String.format("Pertenezco a %s",getClass());
	}
}
