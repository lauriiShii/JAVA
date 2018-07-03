package Apartado3;

public abstract class Forma {

	public abstract String toString();
	
	public String identidad(){
		return String.format("%s", this);
	}
}
