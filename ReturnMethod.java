
public class ReturnMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 11;
		int b = 6;
		int c = min(a,b);
		
		System.out.println("Minimuc value = " + c);

	}

	private static int min(int a, int b) {
		// TODO Auto-generated method stub
		int min;
		
		if (a < b)
			min = b;
		else 
			min = a;
	
		return min;
	}

}
