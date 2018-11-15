/* Interface.
   You cannot instantiate an interface.
   An interface does not contain any constructors.
   All of the methods in an interface are abstract.
   An interface cannot contain instance fields. The only fields that can appear in an interface must be declared both static and final.
   An interface is not extended by a class; it is implemented by a class.
   An interface can extend multiple interfaces
*/

// All the interface methods are by default abstract and public.
// Variables declared in interface are public, static and final by default.

public class TestInterface implements Myinterface{

	public static void main(String[] args) {
		TestInterface testinterface=new TestInterface();
		testinterface.display();
		testinterface.test();

	}

	@Override
	public void display() {
		System.out.println("Hi from Interface");
		
	}

	@Override
	public void test() {
		System.out.println("Hi from Test");
		
	}
	
}
 interface Myinterface{
	 public void display();
	 public void test();
}
