package veterinaria.herencia.clases_abstractas;

public abstract class Mamifero extends Animal{
	
	private boolean poneHuevos;
	private boolean puedeSumergirseMuchoTiempo; //
	
	
	public Mamifero(String sexo, boolean castrado) {
		super(sexo, castrado);
		
	}
	
	public Mamifero() {
		super();
	}

	public boolean isPoneHuevos() {
		return poneHuevos;
	}

	public void setPoneHuevos(boolean poneHuevos) {
		this.poneHuevos = poneHuevos;
	}

	public boolean isPuedeSumergirseMuchoTiempo() {
		return puedeSumergirseMuchoTiempo;
	}

	public void setPuedeSumergirseMuchoTiempo(boolean puedeSumergirseMuchoTiempo) {
		this.puedeSumergirseMuchoTiempo = puedeSumergirseMuchoTiempo;
	}
	
	

	@Override
	public String toString() {
		return "Mamifero [poneHuevos=" + poneHuevos 
				+ ", \npuedeSumergirseMuchoTiempo=" + puedeSumergirseMuchoTiempo
				+ "]";
	}

	@Override
	public void desplazarse() {
		int a = 5, b=3;
		System.out.println("El mamifero se desplaza "+(a+b));
		
	}
	
	
	

}
