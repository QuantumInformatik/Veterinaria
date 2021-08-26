package veterinaria.herencia.clases_no_abstractas;


import java.util.ArrayList;

import java.util.List;


public class Principal {

	public static void main(String[] args) {
		//SuperClase  objeto = new SuperClase();  SE PUEDE
		//SuperClase  objeto = new SubClase();  SE PUEDE
		//SubClase  objeto = new SubClase(); SE PUEDE
		//SubClase  objeto = new SuperClase(); NO SE PUEDE
		
		Animal animal = new Animal();

		Animal animal1 = new Mamifero("MACHO",false);
		Animal animal2 = new Ave(false, true);
		
		List<Animal> animales = new ArrayList<Animal>(); //Lista ligada
		
		animales.add(animal1); //add agrega un animal a la lista
		animales.add(animal2);
		
		for (Animal animalIterador : animales) { 
			Ave ave = (Ave) animalIterador; //cast o casting - castear - casteo
			
			ave.desplazarse();
		}
		
		
	}

}
