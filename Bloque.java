
public class Bloque extends Escenario{
	private int numMonedas;

	public Bloque(String forma, int alto, int ancho, int numMonedas) {
		super(forma, alto, ancho);
		this.numMonedas = numMonedas;
	}

	public int getNumMonedas() {
		return numMonedas;
	}

	public void setNumMonedas(int numMonedas) {
		this.numMonedas = numMonedas;
	}
	
	
	
	

}
