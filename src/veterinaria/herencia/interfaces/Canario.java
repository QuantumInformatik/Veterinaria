package veterinaria.herencia.interfaces;

public class Canario extends Ave implements Mascota, AnimalAccion{
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

	@Override
	public void acariciar() {
		// TODO Auto-generated method stub
		System.out.println("Lo acaricio cantandole en ingles...");
		
	}

	@Override
	public void brindarHogar() {
		// TODO Auto-generated method stub
		
		System.out.println("Dejandolo volar...");
		
	}
	
	

}
