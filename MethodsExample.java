
public class MethodsExample {

	public static void main(String[] args) 
	{
		System.out.println("I will be passing values to " + "two methods.");
		System.out.println(" ");
		
		// Passing arguments to squareNumber method.
		System.out.println("Frist i will pass value to the " +  "squareNumber method");
		
		squareNumber(2);
		squareNumber(3);
		squareNumber(12);
		
		// Passing arguments to cudeNumber method. 
		System.out.println("Now i will pass value to the " + "cudeNumber method");
		
		cudeNumber(3);
		cudeNumber(9);
		cudeNumber(25);
	}
	
	public static void squareNumber(int x) 
	{
		int xAnswer;
		xAnswer = x * x;
		System.out.println("The square of " + x + " is " + xAnswer);
	}
	
	public static void cudeNumber(int x)
	{
		int xAnswer;
		xAnswer = x * x * x;
		System.out.println("The cude of " + x + " is " + xAnswer);
	}

}
