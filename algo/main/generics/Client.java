package main.generics;

import java.util.ArrayList;
import java.util.List;



/**
 * PECS
 * producer extends - e.g box of fruits or flocks of animal. 
 * a box will release only not allowed to store. not allowed animals.add() allowed animals.get()
 * 
 * consumer super - 
 * a box will store a fruits. allowed animals.add() not allowed animals.get()
 * 
 * 
 * @author Admin
 *
 */
public class Client {
	
	public static void main(String[] args) {
		
		List<Number> nums = new ArrayList<>();
		
		List<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog());
		dogs.add(new BullDog());
		
		List<? extends Animal> animals = dogs;
//		animals.add(new Cat()); not allowed
		animals.get(0);

		
		List<? super Dog> superDogs = dogs; // allowed
		superDogs.add(new Dog()); // allowed
		superDogs.add(new BullDog()); // allowed
//		superDogs.add(new Animal()); // not allowed
//		Dog o = superDogs.get(0); // not allowed

		
		List<Creature> creatures = new ArrayList<>();
		sup(creatures);
		
		List<Animal> supAnimal = new ArrayList<>();
		sup(supAnimal);
		
//		List<Dog> supDog = new ArrayList<>();
//		sup(supDog); not allowed
		
	}
	
	public void ext(List<? extends Animal> animals) {
//		this is not allowed because their is case that you can pass to parameter any subtype 
//		of animal like Cat so you cannot add a dog to a lits of cats
//		animals.add(new Dog()); not allowed
//		animals.add(new Cat()); not allowed
		animals.add(null); // allowed
		animals.get(0); // allowed
	}
	
	public static void sup(List<? super Animal> animals) { 
		
		//allowed to add all subtype of animal
		animals.add(new Animal());
		animals.add(new Dog()); 
		animals.add(new Cat());
		Object object = animals.get(0); //only allowed to get if the assigned instance is object(in end of super type)
//		Animal animal = animals.get(0); // not allowed
 
	}
	


}
