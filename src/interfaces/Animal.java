package interfaces;

public interface Animal {
	
	/*
	 * An interface is like a contract. Any class that implements
	 * the interface is required to provide a definition for all
	 * the (abstract) methods below...
	 * 
	 * To the "outside world", an interface is a guarantee that 
	 * every class that has implemented the interface will provide 
	 * a definition for the methods. 
	 */
	
	public abstract void makeSound() ;
	
	public abstract void eat();
	
	public abstract void sleep();
}
