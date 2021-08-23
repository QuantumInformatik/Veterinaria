/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria.herencia.clases_no_abstractas;

/**
 *
 * @author juang
 */
public class Animal {
    protected String sexo;
    protected boolean castrado;
    protected boolean extinto=true;

    public Animal() {
    }
    
    public Animal(String sexo, boolean castrado) {
        this.sexo = sexo;
        this.castrado = castrado;
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

    @Override
    public String toString() {
        return "Animal{" + "sexo=" + sexo + ", castrado=" + castrado + ", extinto=" + extinto + '}';
    }
    
    
    
    
    
}
