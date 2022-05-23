
public class Dino extends Personaje{
	private boolean sonrisa;

	public Dino(String nombre, int ancho, int alto, String color, String poder,
			String posX, String posY, boolean sonrisa) {
		super(nombre, ancho, alto, color, poder, posX, posY);
		this.sonrisa = sonrisa;
	}

	public boolean isSonrisa() {
		return sonrisa;
	}

	public void setSonrisa(boolean sonrisa) {
		this.sonrisa = sonrisa;
	}

	@Override
	public void moverseIzquierda() {
		System.out.println("Dino se movió a la izquierda");
	}

	@Override
	public void moverseDerecha() {
		System.out.println("Dino se movió a la derecha");
	}

	@Override
	public void matar() {
		System.out.println("Dino mató a Mario");
	}

	@Override
	public void morir() {
		System.out.println("Dino ha muerto");
	}

	@Override
	public void chocar(Personaje p) {
		System.out.println("Dino ha chocado");
	}
	
	
	
}
