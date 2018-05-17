package inheritance.example;

public class Dog extends Animal{

	public Dog() 
	{ 
		/*empty constructor */ 
	}
	

	public void makeSound() 
	{
		System.out.println("I'm the derived class Doge");
	}
	
	public void makeChildSound()
	{
		System.out.println("This is my child call woof woof");
	}
}
