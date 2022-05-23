
public class MarioHelice extends Mario implements Marios{
	private int cantHelices;

	

	public MarioHelice(String nombre, int ancho, int alto, String color, String poder, String posX, String posY,
			String tamanio, String traje, int velocidad, int cantHelices) {
		super(nombre, ancho, alto, color, poder, posX, posY, tamanio, traje, velocidad);
		this.cantHelices = cantHelices;
	}

	public int getCantHelices() {
		return cantHelices;
	}

	public void setCantHelices(int cantHelices) {
		this.cantHelices = cantHelices;
	}

	public void volar() {
		System.out.println("Mario Hélice está volando");
	}
	
	@Override
	public void saltar() {
		System.out.println("Mario Hélice ha saltado");
	}

	@Override
	public void montarYoshi() {
		System.out.println("Mario Hélice ha montado a Yoshi");
	}

	@Override
	public void saltarBajarYoshi() {
		System.out.println("Mario Hélice ha bajado de Yoshi");
	}

	@Override
	public void saltarMatar() {
		System.out.println("Mario Hélice saltó sobre su enemigo");
	}

	@Override
	public void agacharse() {
		System.out.println("Mario Hélice se agachó");
	}

	@Override
	public void entrarTubo() {
		System.out.println("Mario Hélice ha entrado al tubo");
	}

	@Override
	public void cambiarTraje() {
		System.out.println("Mario Hélice ha cambiado de traje");
	}

	@Override
	public void chocar(Personaje p) {
		System.out.println("Mario Hélice ha chocado con otro personaje, pierde las hélices");
	}

	@Override
	public void moverseIzquierda() {
		System.out.println("Mario Hélice se mueve a la izquierda");
	}

	@Override
	public void moverseDerecha() {
		System.out.println("Mario Hélice se mueve a la derecha");
	}

	@Override
	public void matar() {
		System.out.println("Mario Hélice ha matado a su rival");
	}
}
