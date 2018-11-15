
public class AdditionwReturn {

	public static void main(String[] args) {
		
		// Add(100, 111, 212);
		
		// Variable Syntax : datatype variableName;
		
		int sum = Add(100, 111, 212);
		// Multiplication
		int result = sum * 15;
		System.out.println(result);
	}
	
	// Method syntax : modifier returntype nameofmethod(Parameters list)
	public static int Add (int a, int b, int c)
	{
		//System.out.println(a + b + c);
		return (a + b + c);
	}

}
