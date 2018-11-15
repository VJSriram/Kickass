
public class tuna {

	private String first;
	private String last;
	// Static variable
	private static int members = 0;
	
	// Constructor Syntax
	public tuna(String fn, String ln) {
		first = fn;
		last = ln;
		members++;
		
		System.out.printf("Contructor for %s %s, members in the club: %d\n", first, last, members);
		
	}
	
	

}
