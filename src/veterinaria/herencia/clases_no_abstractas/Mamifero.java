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
public class Mamifero extends Animal{
    private boolean poneHuevos;
    private boolean puedeSumergirseMuchoTiempo;

    public Mamifero(String sexo, boolean castrado) {
        super(sexo, castrado);
                this.setExtinto(false);

    }
    
    public Mamifero(){
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
        return "Mamifero{" + "poneHuevos=" + poneHuevos 
                + ", extinto=" + this.extinto
                + ", castrado=" + castrado
                + ", sexo=" + this.sexo
                + ", puedeSumergirseMuchoTiempo=" + puedeSumergirseMuchoTiempo + '}';
    }

      
    
    
    
    
    
}
