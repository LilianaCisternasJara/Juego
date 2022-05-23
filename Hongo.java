
public class Hongo implements Caracteristicas{
	private String nivelAlegria;

	public Hongo(String nivelAlegria) {
		super();
		this.nivelAlegria = nivelAlegria;
	}

	public String getNivelAlegria() {
		return nivelAlegria;
	}

	public void setNivelAlegria(String nivelAlegria) {
		this.nivelAlegria = nivelAlegria;
	}

	@Override
	public void darPoder() {
		System.out.println("Hongo dió poder a Mario");
	}

	@Override
	public void salirdelBloque() {
		System.out.println("Honguito ha salido del bloque");
		
	}
	

	
}
