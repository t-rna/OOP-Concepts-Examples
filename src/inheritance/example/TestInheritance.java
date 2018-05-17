package inheritance.example;

public class TestInheritance {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		Animal wtf = new Dog();
		
		/*
		 * Illustrating "scope" of visibility of methods depending 
		 * on what type the variable is and depending on the 
		 * inheritance.
		 */
		
		animal.makeSound();
		animal.makeParentSound();
		System.out.println();
		
		dog.makeSound();
		dog.makeParentSound();
		dog.makeChildSound();
		System.out.println();
		
		/*
		 * See here, since variable "wtf" is of type Animal,
		 * it does not have visibility of the makeChildSound()
		 * method even though it is an object of type Dog
		 * and Dog is a derived class with the makeChildSound() 
		 * method.
		 */
		wtf.makeSound();
		wtf.makeParentSound();
		System.out.println();
	}
}
