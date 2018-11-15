
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* dataType[] arrayName;
		   arrayName  = new dataType[arraySize]; 
           arrayName[index] = arrayElement; //storing to an array element
        */
		
		int[] numbers = {10, 20, 30, 40, 50};
		
		for (int x : numbers) {
			
			System.out.print( x );
			System.out.print(",  ");
		}
		System.out.println();
		
		// Syntax : modifier String stringName = "String to store"
		String[] names = {"James", "Larry", "Haiden", "Jeremy", "Robert"};
		
		for (String name : names) {
			System.out.print( name );
			System.out.print(", ");
			
		}
		
		
		
	}

}
