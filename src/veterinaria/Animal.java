/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

/**
 *
 * @author juang
 */
public class Animal {
    protected String sexo;
    protected boolean castrado;
    protected boolean extinto;

    public Animal() {
    }
    
    

    public Animal(String sexo, boolean castrado, boolean extinto) {
        this.sexo = sexo;
        this.castrado = castrado;
        this.extinto = extinto;
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
    
    
    
    
    
}
