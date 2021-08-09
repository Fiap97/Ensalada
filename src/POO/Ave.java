package POO;

public class Ave extends Animal{

	private String colorAve;

	public Ave(String nombre, String raza, String color) {
		super(nombre, raza, color);
		// TODO Auto-generated constructor stub
	}

	public Ave(String nombre, String raza, String color, String colorAve) {
		super(nombre, raza, color);
		this.colorAve = colorAve;
	}

	public String getColorAve() {
		return colorAve;
	}

	public void setColorAve(String colorAve) {
		this.colorAve = colorAve;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ave [colorAve=");
		builder.append(colorAve);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
	
}
