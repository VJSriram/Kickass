
public class Students {
	// Variable Syntax : dataType variableName;
			String name;
			int age;

	// Default Constructor
	// Constructor Syntax : modifier ClassName()
	public Students()
	
	{
		System.out.println("Constructor with no parameters called");
		name = "noname";
		age = 1;
	}
	
	// Parameterized Constructor
	// Syntax modifier ClassName(Parameters)
	public Students(String iname) {
		System.out.println("Constructor with one string parameters called");
		name = iname;
		age = 1;
	}
	
	public Students(int iage) {
		System.out.println("Constructor with one integer parameter is called.");
		name = "noname";
		age = iage;
	}
	
	public Students(String iname, int iage) {
		System.out.println("Constructor with two parameter called");
		name = iname;
		age = iage;
	}
	
	// Method Syntax : modifier returnType nameofMethod(Parameters);
	
	public void introduce() 
	{
		System.out.println("name is "+name+" and age is "+age);
	}

}
