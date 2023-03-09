package lista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericListsMain {

	public static void main(String[] args) {
		List<Animal> listOfAnimals = new ArrayList<>();
		List<Dog> listOfDogs = new ArrayList<>();
		
		listOfAnimals.add(new Animal(1));
		listOfAnimals.add(new Animal(2));
		listOfAnimals.add(new Animal(3));
		
		listOfDogs.add(new Dog(1, "Karl"));
		listOfDogs.add(new Dog(2, "Josh"));
		listOfDogs.add(new Dog(3, "Emma"));
		
		show(listOfAnimals);
		System.out.println("_________");
		show(listOfDogs);
		
	}
	public static void show(List<? extends Animal> list) {
		for (Animal animal : list) {
			System.out.println(animal.toString());
		}
	}

}
