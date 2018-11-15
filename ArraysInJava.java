
public class ArraysInJava {

	public static void main(String[] args) {
		
		/* Arrays in Java
		Arrays are used to assign a series of elements of the same type in consecutive memory locations; 
		to define a list of elements. 
		They work similar to variables, except they contain multiple values at different indices.
		*/
		
		/*
		 * Syntax : dataType[] arrayName;
		 * 
		 * 			arrayName = new dataType[arraySize];
		 * 
		 * 			arrayName[Index] = arrayElement; // Storing to an array element. 
 		 */
		
		/* Notes:
		 * 
		 *  dataType can be any Java data type. arrayName is defined by the programmer. 
		 *  arraySize and arrayElement are integers. arrayValue depends on the assigned data type and is defined by the programmer.
		 *  Each element stored in an array is given an index, which allows you to access that element using square brackets.
		 * 
		 * Arrays are initialized with a size. 
		 * The array index range is 0 to the initialized size -1. 
		 * This means that the first index in the array is 0, and the last is size -1. 
		 * Trying to access an index outside the index range will result in an error.
		 * Like regular variables, array variables can be declared first, and initialized later.
		 * 
		 * Dynamically sized arrays can be created using the ArrayList class.
		 */
		
		
		int[] array;
		
		array = new int[2]; // declaring an array of size 2
		array[0] = 1; // storing a value of 1 in the first element
		array[1] = 2; // storing a value of 2 in the second element. 
		
		//System.out.println(array[1]);
		System.out.println(array[0]);
		
	}

}
