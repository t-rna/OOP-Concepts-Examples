package inheritance.polymorphism;

public class Cat extends Animal{
	
	public Cat() 
	{
		/* empty constructor */
	}
	
	/*
	 * Since Cat inherits from abstract base class Animal,
	 * it MUST provide a definition of the abstract makeSound() method...
	 * 
	 * OTHERWISE
	 * makeSound() here will be abstract and Cat will become abstract.
	 */
	public void makeSound() 
	{	
		System.out.println("I'm cat");
	}
}
