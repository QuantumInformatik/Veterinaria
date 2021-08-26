package veterinaria.herencia.clases_abstractas;

public abstract class Ave extends Animal {
	
	private boolean puedeVolar;
	private boolean depredador;
	
	
	public Ave(boolean puedeVolar, boolean depredador) {
		
		this.puedeVolar = puedeVolar;
		this.depredador = depredador;
	}


	public boolean isPuedeVolar() {
		return puedeVolar;
	}


	public void setPuedeVolar(boolean puedeVolar) {
		this.puedeVolar = puedeVolar;
	}


	public boolean isDepredador() {
		return depredador;
	}


	public void setDepredador(boolean depredador) {
		this.depredador = depredador;
	}

	@Override
	public void desplazarse() {
		int a = 1, b=2;
		System.out.println("El ave se desplaza volando"+(a+b));
		
	}
	

	@Override
	public String toString() {
		return "Ave [puedeVolar=" + puedeVolar + ", depredador=" + depredador + "]";
	}
	
	
	
	
	

}
