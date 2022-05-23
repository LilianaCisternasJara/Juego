
public class Goomba extends Personaje{
	private boolean colmillos;

	public Goomba(String nombre, int ancho, int alto, String color, String poder,
			String posX, String posY, boolean colmillos) {
		super(nombre, ancho, alto, color, poder, posX, posY);
		this.colmillos = colmillos;
	}

	public boolean isColmillos() {
		return colmillos;
	}

	public void setColmillos(boolean colmillos) {
		this.colmillos = colmillos;
	}

	@Override
	public void moverseIzquierda() {
		System.out.println("Goomba se movió a la izquierda");
	}

	@Override
	public void moverseDerecha() {
		System.out.println("Goomba se movió a la derecha");
	}

	@Override
	public void matar() {
		System.out.println("Goomba mató");
	}

	@Override
	public void morir() {
		System.out.println("Goomba ha sido aplastado, murió");
	}

	@Override
	public void chocar(Personaje p) {
		System.out.println("Goomba ha chocado");
	}
	
	
	

}
