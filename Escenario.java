
public abstract class  Escenario {
	
	private String forma;
	private int alto;
	private int ancho;
	
	public Escenario(String forma, int alto, int ancho) {
		super();
		this.forma = forma;
		this.alto = alto;
		this.ancho = ancho;
	}
	
	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	
	

}
