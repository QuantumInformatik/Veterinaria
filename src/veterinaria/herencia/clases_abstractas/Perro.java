package veterinaria.herencia.clases_abstractas;

public class Perro extends Mamifero {
	
	private boolean ladraSuave;

	
	
	public Perro(String sexo, boolean castrado, boolean ladraSuave) {
		super(sexo, castrado);
		this.ladraSuave = ladraSuave;
	}

	public boolean isLadraSuave() {
		return ladraSuave;
	}

	public void setLadraSuave(boolean ladraSuave) {
		this.ladraSuave = ladraSuave;
	}
	
	
	

}
