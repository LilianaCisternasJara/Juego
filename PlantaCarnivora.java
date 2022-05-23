
public class PlantaCarnivora extends Escenario {
	
	private String nivelLocura;
	
	public PlantaCarnivora(String forma, int alto, int ancho, String nivelLocura) {
		super(forma, alto, ancho);
		this.nivelLocura = nivelLocura;
	}
	
	
	public String getNivelLocura() {
		return nivelLocura;
	}


	public void setNivelLocura(String nivelLocura) {
		this.nivelLocura = nivelLocura;
	}


	public void matarPorTocar() {
		System.out.println("Mario ha tocado la Planta, ha perdido vida");
	}

	public void aparecer() {
		System.out.println("Planta Carnívora ha aparecido");
	}
}
