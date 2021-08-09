package EjercicioClaseAbstracta;

public class Entrenador extends SeleccionFutbol{

	private int idFederacion;

	public Entrenador(int idFederacion) {
		super();
		this.idFederacion=idFederacion;
		// TODO Auto-generated constructor stub
	}

	public Entrenador(int id, String nombre, String apellidos, int edad,int idFederacion) {
		super(id, nombre, apellidos, edad);
		this.idFederacion=idFederacion;
		// TODO Auto-generated constructor stub
	}

	public int getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(int idFederacion) {
		this.idFederacion = idFederacion;
	}
	
	public void planificarEntrenamiento() {
		System.out.println("Planificando entrenamiento");
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
		return "Entrenador [idFederacion=" + idFederacion + ", getId()=" + getId() + ", getNombre()=" + getNombre()
				+ ", getApellidos()=" + getApellidos() + ", getEdad()=" + getEdad() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
}
