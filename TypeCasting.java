
public class TypeCasting {

	public static void main(String[] args) {
		
		/* Type Casting in Java. 
		
		Type casting is used to convert an object or variable of one type into another.
		
		Syntax : dataType variableName = (dataType) variableToConvert;
		
		There are two casting directions: 
		narrowing (larger to smaller type) and widening (smaller to larger type). 
		Widening can be done automatically (for example, int to double), 
		but narrowing must be done explicitly (like double to int).
		*/
	
		double calculatedMarks;
		
		calculatedMarks = 86.7;
		int finalGrade = (int)calculatedMarks;
		
		System.out.println(calculatedMarks);
	}

}
