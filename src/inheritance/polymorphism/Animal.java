package inheritance.polymorphism;

public abstract class Animal {
	
	public Animal() 
	{
		/* empty constructor */
	}
	
	/*
	 * An abstract method is a method without a body.
	 * An abstract method causes the class to be abstract
	 * 
	 * Any class inheriting an abstract class must provide a definition
	 * of the abstract method.
	 */
	public abstract void makeSound();
}
