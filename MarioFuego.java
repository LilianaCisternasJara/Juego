
public class MarioFuego extends Mario implements Marios{

	private int cantBolas;

	public MarioFuego(String nombre, int ancho, int alto, String color, String poder, String posX, String posY,
			String tamanio, String traje, int velocidad, int cantBolas) {
		super(nombre, ancho, alto, color, poder, posX, posY, tamanio, traje, velocidad);
		this.cantBolas = cantBolas;		
	}
	
	public void lanzarBolas() {
		System.out.println("Mario Fuego está lanzando bolas");
	}
	

	@Override
	public void saltar() {
		System.out.println("Mario Fuego ha saltado");
	}

	@Override
	public void montarYoshi() {
		System.out.println("Mario Fuego ha montado a Yoshi");
	}

	@Override
	public void saltarBajarYoshi() {
		System.out.println("Mario Fuego ha bajado de Yoshi");
	}

	@Override
	public void saltarMatar() {
		System.out.println("Mario Fuego saltó sobre su enemigo");
	}

	@Override
	public void agacharse() {
		System.out.println("Mario Fuego se agachó");
	}

	@Override
	public void entrarTubo() {
		System.out.println("Mario Fuego ha entrado al tubo");
	}

	@Override
	public void cambiarTraje() {
		System.out.println("Mario Fuego ha cambiado de traje");
	}

	@Override
	public void moverseIzquierda() {
		System.out.println("Mario Fuego se mueve a la izquierda");
	}

	@Override
	public void moverseDerecha() {
		System.out.println("Mario Fuego se mueve a la derecha");
	}

	@Override
	public void chocar(Personaje p) {
		System.out.println("Mario Fuego ha chocado con otro personaje, pierde las hélices");
	}

	@Override
	public void matar() {
		System.out.println("Mario Fuego ha matado a su rival");
	}

}
