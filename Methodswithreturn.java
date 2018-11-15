
public class Methodswithreturn {

	public static void main(String[] args) {
		sayHello(" Tom");
		sayHello(" Mark");
		sayHello(" Jack");
		Add(100, 400, 124);
		Add(200, 447, 123);
		Add(245, 333, 114);
	}
	
	public static void sayHello(String name) 
	{
		System.out.println("Hello" + name);
	}
	
	// Addition
	public static void Add (int a, int b, int c) 
	{
		System.out.println(a + b + c);
	}

}
