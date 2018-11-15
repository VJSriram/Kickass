
public class Goals {
	
	public String firstName;
	public String lastName;
	// static variable
	public static int players = 0;
	
	// Constructor
	public Goals(String fN, String lN) {
		firstName = fN;
		lastName = lN;
		players++;
		System.out.printf("Constructor for %s, %s, members in the club: %d\n", firstName, lastName, players);
	}

}
