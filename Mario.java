
public class Mario extends Personaje implements Marios{
	private String tamanio;//Su tamaño depende del poder adquirido
	private String traje;
	private int velocidad;
	private int numVidas;

	public Mario(String nombre, int ancho, int alto, String color, String poder,
			String posX, String posY, String tamanio, String traje, int velocidad) {
		super(nombre, ancho, alto, color, poder, posX, posY);
		this.tamanio = tamanio;
		this.traje = traje;
		this.velocidad = velocidad;
		this.numVidas = 3;
	}
	
	@Override
	public void saltar() {
		System.out.println("Mario ha saltado");
	}

	@Override
	public void montarYoshi() {
		System.out.println("Mario ha montado a Yoshi");
	}

	@Override
	public void saltarBajarYoshi() {
		System.out.println("Mario ha bajado de Yoshi");
	}

	@Override
	public void saltarMatar() {
		System.out.println("Mario saltó sobre su enemigo");
	}

	@Override
	public void agacharse() {
		System.out.println("Mario se agachó");
		
	}

	@Override
	public void entrarTubo() {
		System.out.println("Mario ha entrado al tubo");
	}

	@Override
	public void cambiarTraje() {
		System.out.println("Mario ha cambiado de traje");
	}

	@Override
	public void moverseIzquierda() {
		System.out.println("Mario se movió a la izquierda");
	}

	@Override
	public void moverseDerecha() {
		System.out.println("Mario se movió a la derecha");
	}

	@Override
	public void chocar(Personaje p) {
		System.out.println("Mario pierde vida");
		this.numVidas = this.numVidas - 1;
	}

	@Override
	public void matar() {
		System.out.println("Mario mató");
	}

	@Override
	public void morir() {
		if(this.cantVidas == 0)
		System.out.println("Mario se murió :(");
	}
		
	public void crecer() {
		System.out.println("Mario ha crecido");
	}
	
	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
}
