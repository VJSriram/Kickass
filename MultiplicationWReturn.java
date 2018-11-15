
public class MultiplicationWReturn {

	public static void main(String[] args) {
		
		// Multiplication
		// Variable Syntax : datatype VariableName;
		int sum = Multi(10, 45);
		
		// Division
		int sum1 = sum / 12;
		System.out.println(sum1);
		

	}
	
	// Method syntax : modifier returntype nameofmethod(parameter list)
	public static int Multi (int x, int y) 
	{
		return (x*y);
	}

}
