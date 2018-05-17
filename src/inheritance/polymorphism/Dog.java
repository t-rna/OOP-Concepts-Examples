package inheritance.polymorphism;

public class Dog extends Animal{

	public Dog() 
	{ 
		/*empty constructor */ 
	}
	
	/*
	 * Since Dog inherits from abstract base class Animal,
	 * it MUST provide a definition of the abstract makeSound() method...
	 * 
	 * OTHERWISE
	 * makeSound() here will be abstract and Dog will become abstract.
	 */
	public void makeSound() 
	{
		System.out.println("I'm doge");
	}
}
