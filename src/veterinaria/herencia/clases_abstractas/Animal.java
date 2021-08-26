package veterinaria.herencia.clases_abstractas;


/*
 * Una clase abstracta se puede heredar pero no instanciar
 */
public abstract class Animal {
	
	private String sexo;
	private boolean castrado;
	private boolean extinto = true;
	
	public Animal() {}
	
	public Animal(String sexo, boolean castrado) {
		this.sexo=sexo;
		this.castrado=castrado;
	}
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public boolean isCastrado() {
		return castrado;
	}
	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}
	public boolean isExtinto() {
		return extinto;
	}
	public void setExtinto(boolean extinto) {
		this.extinto = extinto;
	}
	

	public abstract void desplazarse();
	
	
	

}
