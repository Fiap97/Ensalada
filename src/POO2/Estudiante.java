package POO2;

public class Estudiante extends Persona{

	private double deuda;

	public Estudiante() {
		super();
	}



	public Estudiante(String nombre, String rut, boolean presente, double deuda) {
		super(nombre, rut, presente);
		this.deuda = deuda;
	}



	public double getDeuda() {
		return deuda;
	}



	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}



}