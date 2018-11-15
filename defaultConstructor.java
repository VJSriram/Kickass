
public class defaultConstructor {

	int x;
	int y;
	
	// Used to assign values to the variables at the time of object creation. 
	// Constructor should be className. 
	// Constructor Syntax : modifier className();
	
	public defaultConstructor() {
		
		
		x = 12;
		y = 25;
	}
	
	public static void main(String args[]) 
	{
		defaultConstructor Objname = new defaultConstructor();
		//Objname.x = 12;
		//Objname.y = 25;
		System.out.println(Objname.x);
		System.out.println(Objname.y);
	}
	
}

	
