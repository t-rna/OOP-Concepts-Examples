package interfaces;

public class Dog implements Animal{

	public Dog() { /*empty constructor */ }
	
	public void makeSound() 
	{
		System.out.println("I'm doge");
	}
	
	public void eat()
	{
		System.out.println("I eat dog food");
	}
	
	public void sleep()
	{
		System.out.println("I dogzzZ");
	}
}
