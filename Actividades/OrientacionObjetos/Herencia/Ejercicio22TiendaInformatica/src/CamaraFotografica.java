
public class CamaraFotografica extends Dispositivo{

	/**ATRIBUTOS**/
	protected boolean compacta;
	protected boolean analogica;
	
	/**CCONSTRUCTORES**/
	CamaraFotografica(){
		super("Desconocido", "Desconocido", 0,0f);
		compacta = false;
		analogica = false;
	}
	
	CamaraFotografica(String marca, String modelo, int stock, float capacidadSD, boolean compacta, boolean analogica){
		super(marca, modelo, stock,capacidadSD);
		this.compacta = compacta;
		this.analogica = analogica;
	}
	
	/**EQUALS**/
	public boolean equals(Object obj) {
		boolean resultado=false;
		if(obj instanceof CamaraFotografica && super.equals(obj) && compacta == (((CamaraFotografica)obj).compacta)
				&& analogica == (((CamaraFotografica)obj).analogica))
				resultado=true;
		return resultado;		
	}	
	
	/**CLON**/
	protected Object clone(){
		CamaraFotografica clonado;
		clonado=(CamaraFotografica) super.clone();
		return clonado;		
	}

	/**toString**/
	public String toString() {
		return "CamaraFotografica [compacta=" + compacta + ", analogica=" + analogica + ", "
				+ super.toString() + "]";
	}
	
	
	
}
