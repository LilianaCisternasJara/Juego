
public abstract class Personaje {
	
	private String nombre;
	private int ancho;
	private int alto;
	private String color;
	private String poder;
	public int cantVidas;
	private boolean vida;
	private String posX;
	private String posY;
	
	public Personaje(String nombre, int ancho, int alto, String color, String poder, String posX, String posY) {
		this.nombre = nombre;
		this.ancho = ancho;
		this.alto = alto;
		this.color = color;
		this.poder = poder;
		this.cantVidas = 3;
		this.vida = true;//true porque empieza con vida
		this.posX = posX;
		this.posY = posY;
	}
	
	public void chocar(Personaje p) {
		if(p instanceof Mario) {
			System.out.println("chocó con Mario");
			this.cantVidas = this.cantVidas -1;
		}
		if(p instanceof Dino) {
			System.out.println("chocó con Dino");
		}
		if(p instanceof Bowser) {
			System.out.println("chocó con Bowser");
		}
		if(p instanceof Goomba) {
			System.out.println("chocó con Goomba");
		}
	}
	
	public void moverseIzquierda() {
		System.out.println("Se mueve a la izquierda");
	}
	public void moverseDerecha() {
		System.out.println("Se mueve a la derecha");	
	}
	
	public void matar() {
		System.out.println("Mató");
	}
	public void morir() {
		System.out.println("Se murió :(");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	public int getCantVidas() {
		return cantVidas;
	}

	public void setCantVidas(int cantVidas) {
		this.cantVidas = cantVidas;
	}

	public boolean isVida() {
		return vida;
	}

	public void setVida(boolean vida) {
		this.vida = vida;
	}
	
	
	

}
