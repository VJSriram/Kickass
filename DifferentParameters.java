
public class DifferentParameters {

	public static void main(String[] args) {
		// datatype VariableName();
		String stringName = "Anjali";
		String stringName1 = "Madhu";
		int number = 6;
		
		displayName(stringName, number);
		displayName(stringName1, 2);

	}
	
	public static void displayName(String Name, int number) 
	{
		for (int counter = 1; counter <= number; counter++)
		{
			System.out.println(Name);
		}
	}

}
