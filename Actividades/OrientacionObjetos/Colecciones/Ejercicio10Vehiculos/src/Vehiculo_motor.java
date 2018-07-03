
import java.util.Date;

public class Vehiculo_motor extends Vehiculo implements Arrancable {
	
	protected double cilindrada,caballos;
	protected Motor miMotor;
	protected boolean estaApagado, delante;
	protected int velocidad;
	
	public Vehiculo_motor(String matricula, Marcas marca,Date fecha,double cilindrada, double caballos) {
		super(matricula,marca,fecha);
		this.caballos = caballos;
		this.cilindrada = cilindrada;
		miMotor = new Motor("V8", cilindrada, caballos);
	}
	// CLASE INTERNA
	public class Motor{
		
		protected String modelo;
		protected double cilindrada,caballos;
		
		
		public Motor(String modelo,double cilindrada, double caballos) {
			this.modelo = modelo;
			this.cilindrada = cilindrada;
			this.caballos = caballos;
		
		}
		
		public Object clone() {
			Motor m;
			try {
				m =(Motor)super.clone();
			} catch (CloneNotSupportedException e) {
				m = null;
			}
			return m;
		}
		public String toString() {
			return "Motor [modelo=" + modelo + ", cilindrada=" + cilindrada + ", caballos=" + caballos + "]";
		}
		public boolean equals(Object obj){
			if(obj instanceof Motor){
				Motor v = (Motor) obj;
				return v.modelo.equals(((Motor)obj).modelo) && v.cilindrada == (((Motor)obj).cilindrada) &&
				v.caballos == (((Motor)obj).caballos);
				
			}
			else return false;
		}
		public int hasCode(){
			return modelo.hashCode()+(int) cilindrada*10000+(int) caballos*10000;
		}
		
		
	}
	public int hasCode(){
		return miMotor.hasCode()+super.hasCode();
	}
	// Como tiene nuevos atributos implementamos equals 
	public boolean equals(Object obj){
		//boolean resultado = false; 
		
		if(obj instanceof Vehiculo_motor){
			Vehiculo_motor v = (Vehiculo_motor) obj;
			return super.equals(v) && v.cilindrada == (((Vehiculo_motor)obj).cilindrada) && v.caballos == (((Vehiculo_motor)obj).caballos) &&
			v.miMotor.equals(((Vehiculo_motor)obj).miMotor);
		}
		else return false;
		
		
	}
	public Object clone(){
		Vehiculo_motor m;
		m =(Vehiculo_motor)super.clone();
		m.miMotor =(Motor)miMotor.clone();
		return m;
	}
	public String toString(){
		return String.format("Matricula: %s\nMarca: %s\nFecha compra: %s", matricula,marca,fecha);
	}
	public void arrancar() {
		if(estaApagado == true)
			estaApagado = false;
	}
	public void parar() {
		velocidad = 0;	
	}
	public void subir_marcha() {
		velocidad+=10;	
	}
	public void bajar_marcha() {
		velocidad-=10;	
	}
	public void punto_muerto() {
		velocidad = 0;
	}
	public void marcha_atras() {
		if(delante == true);
			delante = false;
	}
	

}
