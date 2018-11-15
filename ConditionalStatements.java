
public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Subject1 = 30;
		int Subject2 = 80;
		
		// && -> AND operator, || -> OR operator
		if ((Subject1 >= 35) && (Subject2 >= 35)) {
			System.out.println("The condition is true");
	
		}else {
			System.out.println("The condition is false");
		}
		
		// || -> OR operator
		
		if ((Subject1 >=90) || (Subject2 <= 45)) {
			System.out.println("This condition is ture");
			
		} else {
			System.out.println("This condition is false");
		}

	}

}
