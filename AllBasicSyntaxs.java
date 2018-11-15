
public class AllBasicSyntaxs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Standard Methods in Java. 
		
		modifier returntype nameOfMethod (Parameter list)
		public static int main(int a, int b);
		
		// Class Declaration Syntax
		
		modifier class myClass {  //class header
			 
			// field, constructor
			
			// method declarations
		}
		
		// Constructor Syntax
		
		modifier class className {
			modifier className(inputParameters) {
			// set feilds and run methods needed on instantiation here
			}
		}
		
		// Instantiation Syntax
		
		className objectName = new ClassName(inputParameters);
		
		
		// Object Syntax
		
		ClassName object = new className();
		
		// Variable Syntax
		
		dataType variableName;
		
		
		// Constants Syntax
		
		// global constant
		modifier final dataType variableName = value; 
		
		// constant within a class
		modifier static final dataType variableName = value; 
		
		
		// Array Syntax
		
		dataType[] arrayName;
		arrayName = new dataType[arraySize];
		
		arrayName[index] = arrayElement; // storring to an array element. 
		
		// String Syntax
		// String variables are variables used to hold strings.
		
		modifier String stringName = "String to store";
		
		// String Length Syntax
		// Spaces count as characters.
		
		int length = stringName.length();
		
		// String Compare Syntax
		// To compare the contents of a string variable to another string.
		
		bool equal = stringName.equals("String literal"); //returns true or false
		
		// String Trim Syntax
		// Used to remove trailing and leading whitespace in a string.
		
		String trimmedString = stringName.trim();
		
		// String Split Syntax
		// Splits a string into parts based on a regex (usually a space) and stores it into an String array.
		
		String[] splitString = bigString.split(regex);
		
		// Substring Syntax
		// A substring is a portion of an original string.
		// Like an array, the first index of a string is 0.
		
		String sub = bigString.substring(startIndex, endIndex); //endIndex is optional
		
		// String representation Syntax
		// Used to return a string representation of a non-string.
		
		String stringVariable = String.valueOf(nonString);
		
		// HashMaps in Java Syntax
		// Hash maps are used to store key-value pairs. Similar to dictionaries, maps, objects, and tuples in other languages.
		
		//creating a HashMap object
		HashMap<Key_DataType, Value_DataType> hashMapName = new HashMap<Key_DataType, Value_DataType>();

		//adding values to the hash map
		hashMapName.put(key, value);

		//getting value from key
		keyValue = hashMapName.get(key);

		// HashSets in Java Syntax
		// Used to store values like an array and ensure there are no duplicates.
		
		HashSet<DataType> set = new HashSet<DataType>();

		//adding to a set
		set.add(item);

		//checking for set membership, returns true if item is a member
		set.contains(item);
		
	Declaring an Exception in Java. 
		
		// Fields and methods
		Syntax : modifier exceptionName extends Exception
		
		// for runtime exception
		modifier exceptionName extends RutineException 
		
	Throwing an Exception in Java. 
	
		// Syntax : modifier methodName function throws exceptionName. 
	
		public methodName function throws exceptionName{
			//checking for regular or error condition
			if(booleanExpression){ //good condition
			}
			else { //error condition
				throw new exceptionName();
			}
}


