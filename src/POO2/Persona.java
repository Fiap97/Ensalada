package POO2;

public class Persona {


	private String nombre;
	private String rut;
	private boolean presente;

	public Persona() {
		super();
	}



	public Persona(String nombre, String rut, boolean presente) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.presente = presente;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getRut() {
		return rut;
	}



	public void setRut(String rut) {
		this.rut = rut;
	}



	public boolean isPresente() {
		return presente;
	}



	public void setPresente(boolean presente) {
		this.presente = presente;
	}



	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", rut=" + rut + ", presente=" + presente + "]";
	}

}



