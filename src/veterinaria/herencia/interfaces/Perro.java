package veterinaria.herencia.interfaces;

public class Perro extends Mamifero implements Mascota {

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

	@Override
	public void acariciar() {
		System.out.println("Tocandole la cabeza...");

	}

	@Override
	public void brindarHogar() {
		// TODO Auto-generated method stub
		System.out.println("Comprandole una casa para perro...");

	}

	@Override
	public void desplazarse() {
		System.out.println("Perro corre tras vehiculos... like Joker");

	}

}
