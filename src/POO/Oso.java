package POO;

public class Oso extends Animal{
	
	private String tipo;

	public Oso(String nombre, String raza, String color) {
		super(nombre, raza, color);
		
	}
	

	public Oso(String nombre, String raza, String color, String tipo) {
		super(nombre, raza, color);
		this.tipo = tipo;
	}



	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Oso [tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
