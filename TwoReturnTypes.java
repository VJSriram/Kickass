
public class TwoReturnTypes {
	
	// Method Syntax : modifier returntype nameofmethod(parameters list)
	
	public static void main(String[] args) {
		
		// datatype variableName;
		int n1 = 10;
		int n2 = 25;
		int maximum;
		maximum = max(n1, n2);
		System.out.println("maximum is "+ maximum);
		System.out.println("Minimum is "+max(22, 65));
	
	
		
	}
	
	public static int max(int num1, int num2) 
	
	{
		if (num1 > num2)
			return num1;
		else
			return num2;
	}

}
