package veterinaria.herencia.clases_abstractas;

import java.util.ArrayList;

import java.util.List;

import static veterinaria.herencia.clases_abstractas.Constantes.MACHO;
import static veterinaria.herencia.clases_abstractas.Constantes.HEMBRA;;


public class Principal {

	public static void main(String[] args) {
		//SuperClase  objeto = new SuperClase();  SE PUEDE
		//SuperClase  objeto = new SubClase();  SE PUEDE
		//SubClase  objeto = new SubClase(); SE PUEDE
		//SubClase  objeto = new SuperClase(); NO SE PUEDE
		
		//Animal animal = new Animal(); 
		
		
		Animal animal1 = new Perro(HEMBRA,false, false);
		Animal animal3 = new Perro(MACHO,false, false);

		Animal animal2 = new Canario(false, true, true);
		
		List<Animal> animales = new ArrayList<Animal>(); //Lista ligada
		
		animales.add(animal1); //add agrega un animal a la lista
		animales.add(animal2);
		
		for (Animal animalIterador : animales) { 
			System.out.println(animalIterador.toString());
			animalIterador.desplazarse();
		}
		
		
	}

}
