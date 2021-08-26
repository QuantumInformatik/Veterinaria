package veterinaria.herencia.interfaces;

import java.util.ArrayList;

import java.util.List;

import static veterinaria.herencia.interfaces.Constantes.HEMBRA;;


public class Principal {

	public static void main(String[] args) {
		//SuperClase  objeto = new SuperClase();  SE PUEDE
		//SuperClase  objeto = new SubClase();  SE PUEDE
		//SubClase  objeto = new SubClase(); SE PUEDE
		//SubClase  objeto = new SuperClase(); NO SE PUEDE
		
		//Animal animal = new Animal(); 
		
		
		Mascota animal1 = new Perro(HEMBRA,false, false);
		Mascota animal2 = new Canario(false, true, true);
		
		List<Mascota> animales = new ArrayList<Mascota>(); //Lista ligada
		
		animales.add(animal1); //add agrega un animal a la lista
		animales.add(animal2);
		
		for (Mascota animalIterador : animales) { 
			System.out.println(animalIterador.toString());
			animalIterador.acariciar();
			animalIterador.desplazarse();
		}
		
		
	}

}
