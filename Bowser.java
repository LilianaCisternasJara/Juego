
public class Bowser extends Personaje{
	private String nivelIra;

	public Bowser(String nombre, int ancho, int alto, String color, String poder,
			String posX, String posY, String nivelIra) {
		super(nombre, ancho, alto, color, poder, posX, posY);
		this.nivelIra = nivelIra;
	}
	
	public void atacar() {
		System.out.println("Bowser ataca");
	}

	public String getNivelIra() {
		return nivelIra;
	}

	public void setNivelIra(String nivelIra) {
		this.nivelIra = nivelIra;
	}

	@Override
	public void moverseIzquierda() {
		System.out.println("Bowser se movió a la izquierda");
	}

	@Override
	public void moverseDerecha() {
		System.out.println("Bowser se movió a la derecha");
	}

	@Override
	public void matar() {
		System.out.println("Bowser ha matado a Mario");
	}

	@Override
	public void morir() {
		System.out.println("Bowser ha muerto");
	}

	@Override
	public void chocar(Personaje p) {
		System.out.println("Bowser ha chocado");
	}
	
	

}
