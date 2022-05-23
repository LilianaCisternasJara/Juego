
public class Peach extends Personaje{
	private boolean corona;

	public Peach(String nombre, int ancho, int alto, String color, String poder,
			String posX, String posY, boolean corona) {
		super(nombre, ancho, alto, color, poder, posX, posY);
		this.corona = corona;
	}

	public boolean isCorona() {
		return corona;
	}

	public void setCorona(boolean corona) {
		this.corona = corona;
	}
	public void gritar() {
		System.out.println("Peach está gritando");
	}

	@Override
	public void moverseIzquierda() {
		System.out.println("Peach se movió a la izquierda");
	}

	@Override
	public void moverseDerecha() {
		System.out.println("Peach se movió a la derecha");
	}
	
	

}
