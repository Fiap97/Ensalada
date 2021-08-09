package POO;

public class Auto {

	

	private double altura;
	private double ancho;
	private String tipoMaterial;
	private String color;
	private boolean patente;
	private boolean permisoCirculacion;
	private int revisionTecnica;
	
	

	public Auto() {
	}

	
	public Auto(double altura, String tipoMaterial) {
		super();
		this.altura = altura;
		this.tipoMaterial = tipoMaterial;
	}
	
	

	public Auto(double altura, double ancho, String tipoMaterial, String color, boolean patente,
			boolean permisoCirculacion, int revisionTecnica) {
		this.altura = altura;
		this.ancho = ancho;
		this.tipoMaterial = tipoMaterial;
		this.color = color;
		this.patente = patente;
		this.permisoCirculacion = permisoCirculacion;
		this.revisionTecnica = revisionTecnica;
	}


	
	
	
	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getAncho() {
		return ancho;
	}


	public void setAncho(double ancho) {
		this.ancho = ancho;
	}


	public String getTipoMaterial() {
		return tipoMaterial;
	}


	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public boolean isPatente() {
		return patente;
	}


	public void setPatente(boolean patente) {
		this.patente = patente;
	}


	public boolean isPermisoCirculacion() {
		return permisoCirculacion;
	}


	public void setPermisoCirculacion(boolean permisoCirculacion) {
		this.permisoCirculacion = permisoCirculacion;
	}


	public int getRevisionTecnica() {
		return revisionTecnica;
	}


	public void setRevisionTecnica(int revisionTecnica) {
		this.revisionTecnica = revisionTecnica;
	}

	
	public void circulacionCiudad(boolean patente, boolean permisoCirculacion, int revisionTecnica) {
		
		this.patente=patente;
		this.permisoCirculacion=permisoCirculacion;
		this.revisionTecnica=revisionTecnica;
		
	}
	
	public void circulacionCiudad() {
		
		if(patente && permisoCirculacion && revisionTecnica==2021) {
			System.out.println("Puede manejar");
		}
		else {
			System.out.println("No puede manejar");
		}
		
		
	}

	@Override
	public String toString() {
		return "Auto [altura=" + altura + ", ancho=" + ancho + ", tipoMaterial=" + tipoMaterial + ", color=" + color
				+ ", patente=" + patente + ", permisoCirculacion=" + permisoCirculacion + ", revisionTecnica="
				+ revisionTecnica + "]";
	}



	


	
	
	
	
	
}
