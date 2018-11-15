
public class ConstantsInJava {

	public static void main(String[] args) {
		
		/* A constant is a variable which cannot have its value changed after declaration. It uses the 'final' keyword.
		
		Syntax : modifier final dataType variableName = value; // global constant
				 modifier static final dataType variableName = value; // constant within a class
				 	 
		Notes
				1.  It is convention to capitalize the variable name of a constant.
				2.  Declaring a field as 'final' ensures that it is constant and cannot change.
		*/
				 
		final double PI = 3.14; // global constant, outside of a class
		
		// constants within a class. local constants
			class human {
				public static final int NUMBER_OF_EARS = 2;
			
			}
			
			//accessing a class constant
			int ears = human.NUMBER_OF_EARS;
			
			System.out.println(ears);
				
				 
			
	}

}
