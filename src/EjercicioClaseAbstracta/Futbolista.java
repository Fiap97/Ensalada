package EjercicioClaseAbstracta;

public class Futbolista extends SeleccionFutbol{

	
	private int dorsal;
	private String demarcacion;
	
	public Futbolista(int dorsal, String demarcacion) {
		super();
		this.dorsal=dorsal;
		this.demarcacion=demarcacion;
		// TODO Auto-generated constructor stub
	}
	public Futbolista(int id, String nombre, String apellidos, int edad,int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.dorsal=dorsal;
		this.demarcacion=demarcacion;
		// TODO Auto-generated constructor stub
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public String getDemarcacion() {
		return demarcacion;
	}
	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
	
	public void entrevista() {
		System.out.println("Dando entrevista desde el futbolista");
	}
	@Override
	public void viajar() {
		System.out.println("Viajando");
	}
	@Override
	public void concentrarse() {
		System.out.println("Concentradose");
	}
	@Override
	public void entrenamiento() {
		System.out.println("Entrenando");
	}
	@Override
	public void partidoFutbol() {
		System.out.println("Jugando el partido");
	}
	
	@Override
	public String toString() {
		return "Futbolista [dorsal=" + dorsal + ", demarcacion=" + demarcacion + ", getId()=" + getId()
				+ ", getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getEdad()=" + getEdad()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
	
	
}
