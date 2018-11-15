 /* Abstract Class & Abstract Method.
 	Abstract keyword is used to create an abstract class in java.
	We can use abstract keyword to create an abstract method, an abstract method doesn’t have body.
	If abstract class doesn’t have any method implementation.
	The subclass of abstract class in java must implement all the abstract methods unless the subclass is also an abstract class.
  */
public class Abstract {

	public static void main(String[] args) 
	{
		// Cannot instantiate the abstract class.
		//Abstract class in java can’t be instantiated.
		MaheshPhone obj = new SureshPhone();  
		obj.call();
		obj.text();
		obj.ring();
		obj.vibrate();

	}

}

// MaheshPhone & RameshPhone Class are Abstract class. Which cannot be instantiated. 
abstract class MaheshPhone 
{
	public void call()
	{
		System.out.println("Calling ...");
	}
	// Abstract Methods
	public abstract void text(); 
	public abstract void ring();
	public abstract void vibrate();

}

abstract class RameshPhone extends MaheshPhone 
{
	public void text()
	{
		System.out.println("Texting...");
	}
}
//SureshPhone class is a concrete class. It can be instantiate because it's not a abstract class.
class SureshPhone extends RameshPhone 
{
	public void ring()
	{
		System.out.println("Ringing...");
	}
	
	public void vibrate()
	{
		System.out.println("Vibrating...");
	}
}


