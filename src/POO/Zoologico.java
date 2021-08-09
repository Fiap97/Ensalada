package POO;

public class Zoologico {

	
	private Ave ave;
	private Oso oso;
	private int diasAbierto;
	private String direccion;
	
	public Zoologico() {
		
	}
	
	public Zoologico(Ave ave, Oso oso, int diasAbierto, String direccion) {
		this.ave = ave;
		this.oso = oso;
		this.diasAbierto = diasAbierto;
		this.direccion = direccion;
	}

	public Ave getAve() {
		return ave;
	}

	public void setAve(Ave ave) {
		this.ave = ave;
	}

	public Oso getOso() {
		return oso;
	}

	public void setOso(Oso oso) {
		this.oso = oso;
	}

	public int getDiasAbierto() {
		return diasAbierto;
	}

	public void setDiasAbierto(int diasAbierto) {
		this.diasAbierto = diasAbierto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int agregarDias() {
		
		return diasAbierto;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Zoologico [ave=");
		builder.append(ave);
		builder.append(", oso=");
		builder.append(oso);
		builder.append(", diasAbierto=");
		builder.append(diasAbierto);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
