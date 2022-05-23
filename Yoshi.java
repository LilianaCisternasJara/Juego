
public class Yoshi extends Personaje{
	private int velocidad;

	public Yoshi(String nombre, int ancho, int alto, String color, String poder,
			String posX, String posY, int velocidad) {
		super(nombre, ancho, alto, color, poder, posX, posY);
		this.velocidad = velocidad;
	}
	
	public void comerMatar() {
		System.out.println("Yoshi se comió al enemigo");
		
	}
	
	
	
	@Override
	public void chocar(Personaje p) {
		System.out.println("Yoshi ha chocado, sale corriendo");
	}

	@Override
	public void moverseIzquierda() {
		System.out.println("Yoshi se mueve a la izquierda");
	}

	@Override
	public void moverseDerecha() {
		System.out.println("Yoshi se mueve a la derecha");
	}

	@Override
	public void matar() {
		System.out.println("Yoshi saltó sobre su enemigo y lo mató");
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


}
