
public class PlantaPoder extends Escenario implements Caracteristicas{
	String fortaleza;

	public PlantaPoder(String forma, int alto, int ancho, String fortaleza) {
		super(forma, alto, ancho);
		this.fortaleza = fortaleza;
	}

	@Override
	public void darPoder() {
		System.out.println("Mario obtuvo el poder de tirar bolas de fuego");
	}

	@Override
	public void salirdelBloque() {
		System.out.println("La planta de poder ha salido del bloque");
		
	}
	
	
	
	

}
