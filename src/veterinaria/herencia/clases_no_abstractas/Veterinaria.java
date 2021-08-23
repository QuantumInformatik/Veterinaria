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
public class Veterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal("HEMBRA",true); // creamos un animal de la clase animal
        System.out.println("el animal: "+animal.toString());
        
        /*
        Noten que mamifero es una clase que extiende de animal, por ende tendrá acceso
        a los atributos y metodos de Animal.
        Pero todavía no hemos llegado a un nivel de especialización alto 
        en cuanto a clases.
        
        para ello se crea la clase Perro, que es un animal, y es un mamifero. 
        */
        Mamifero mamifero = new Mamifero("MACHO",true);
        System.out.println("El mamifero: "+mamifero.toString());
        
        

    }
    
}
