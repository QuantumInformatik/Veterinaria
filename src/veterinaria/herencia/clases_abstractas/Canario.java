package veterinaria.herencia.clases_abstractas;

public class Canario extends Ave{
	private boolean puedeCantar;
	
	
	public Canario(boolean puedeVolar, boolean depredador, boolean puedeCantar) {
		super(puedeVolar, depredador);
		this.puedeCantar = puedeCantar;
	}

	public boolean isPuedeCantar() {
		return puedeCantar;
	}

	public void setPuedeCantar(boolean puedeCantar) {
		this.puedeCantar = puedeCantar;
	}
	
	

}
