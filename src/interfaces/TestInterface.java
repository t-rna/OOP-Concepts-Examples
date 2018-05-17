package interfaces;

public class TestInterface {

	public static void main(String[] args) {
		
		/*
		 * Interface...
		 * 
		 * Notice this is exactly the same as the TestPolymorphism class.
		 * We're making an array of the interface type instead of the 
		 * abstract base class.
		 * 
		 * So, interfaces can be thought of as abstract inheritance..
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
