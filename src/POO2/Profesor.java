package POO2;

public class Profesor extends Persona{
	
	private float sueldo;

	public Profesor() {
		super();
	}



	public Profesor(String nombre, String rut, boolean presente,float sueldo) {
		super(nombre, rut, presente);
		this.sueldo=sueldo;
	}



	public float getSueldo() {
		return sueldo;
	}



	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	
	
}
