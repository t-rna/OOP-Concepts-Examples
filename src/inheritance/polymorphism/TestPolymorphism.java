package inheritance.polymorphism;

public class TestPolymorphism {

	public static void main(String[] args) {
		
		/*
		 * Polymorphism (using abstract inheritence)
		 * 
		 * The general base class animal doesn't define makeSound()
		 * When makeSound() is called on an Animal, the derived
		 * class's respective makeSound() implementation is called.
		 */
		
		Animal[] myAnimals = new Animal[2];
		
		myAnimals[0] = new Dog();	// Declaring a new Dog object as type Animal
		myAnimals[1] = new Cat();	// Declaring a new Cat object as type Animal
		
		// For each Animal "a" in myAnimals
		for (Animal a : myAnimals)
			a.makeSound();
		
		// Long form equivalent of above 
		//for (int i = 0; i < myAnimals.length; i++)
		//	myAnimals[i].makeSound();
	}
}
