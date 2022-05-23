
public class Tubo extends Escenario{
	private String ubicacion;

	public Tubo(String forma, int alto, int ancho, String ubicacion) {
		super(forma, alto, ancho);
		this.ubicacion = ubicacion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public void ubicar() {
		System.out.println("El tubo está bajo el bloque");
	}
}
