
public class ConstructorExample {
	
	// variables
	int id;
	String name;
	String city;
	
	// Constructor
	public ConstructorExample(int id, String name) 
	{
		this.id = id;
		this.name = name;
	}
	
	// Constructor
	public ConstructorExample(int id, String name, String city) 
	
	{
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	// Method
	public void display() 
	
	{
		System.out.println("id :"+  id + " name :"+  name + " city :" +city);
	}

	
	// Main method
	public static void main(String[] args) 
	
	{
		// Object
		ConstructorExample ce = new ConstructorExample(123, "Sairam");
		ce.display();
		ConstructorExample ce1 = new ConstructorExample(007, "VJSriram", "Hyderabad");
		ce1.display();
	}
}
