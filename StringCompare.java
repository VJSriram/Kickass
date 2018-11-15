
public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String Compare Syntax : bool equal = stringName.equals("String literal"); -> returns true or false. 
		
		String password = "Magento123";
		if (password.equals("Magento123")) {
			System.out.println("The doors are open. ");
		}else {
			System.out.println("Incorrect password. Doors cannot be opened. Please try again later!");
		}
	}

}
