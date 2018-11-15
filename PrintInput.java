import java.util.Scanner;

public class PrintInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// dataType int
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter some number");
		
		int input_number = scan.nextInt();
		
		System.out.print("The entered value is ");
		System.out.println(input_number);
		
		// dataType double
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter some decimal number");
		
		double input_decimal = scan1.nextDouble();
		System.out.print("Entered decimal is ");
		System.out.println(input_decimal);
		
		// dataType float
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Please enter some decimal number");
		
		float input_decimal1 = scan.nextFloat();
		System.out.print("Entered decimal is ");
		System.out.println(input_decimal1);
		
		
		
		// dataType Char. To take a text input use "String"
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Enter a string");
		
		String input_char = scan3.nextLine();
		
		System.out.print("Entered a name is ");
		System.out.println(input_char);

	}

}
