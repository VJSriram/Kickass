
public class DivisionWReturn {

	public static void main(String[] args) {
		// Variable syntax : datatype variableName;
		
		int sum = division(400, 45);
		int sum1 = sum * 20;
		System.out.println(sum1);
	}
	
	// Method syntax : modifier returntype nameofmethod(parameter list)
	public static int division(int y, int z) 
	{
		return (y / z);
		
	}

}
