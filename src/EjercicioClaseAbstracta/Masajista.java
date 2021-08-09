package EjercicioClaseAbstracta;

public class Masajista extends SeleccionFutbol{

	private String titulacion;
	private int aniosExperiencia;
	

	public Masajista(String titulacion, int aniosExperiencia) {
		super();
		this.titulacion=titulacion;
		this.aniosExperiencia=aniosExperiencia;
		// TODO Auto-generated constructor stub
	}

	public Masajista(int id, String nombre, String apellidos, int edad,String titulacion, int aniosExperiencia) {
		super(id, nombre, apellidos, edad);
		this.titulacion=titulacion;
		this.aniosExperiencia=aniosExperiencia;
		// TODO Auto-generated constructor stub
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	
	
	public void darMasaje() {
		System.out.println("Dando masaje desde el masajista");
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
		return "Masajista [titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + ", getId()=" + getId()
				+ ", getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getEdad()=" + getEdad()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
	
	
	
	
}
