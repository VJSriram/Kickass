
public class Adobe {
	public String firstName;
	public String lastName;
	// static variable
	public static int teams = 0;
	
	// Constructor
	public Adobe(String fN, String LN) {
		
		firstName = fN;
		lastName = LN;
		teams++;
		System.out.printf("Constructor for %s, %s, teams in the club: %d\n", firstName, lastName, teams);
		
	}

}
