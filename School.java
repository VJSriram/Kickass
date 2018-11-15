
public class School implements Crooms{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School obj=new School();
		obj.english();
		obj.maths();
		obj.physics();
		obj.science();
		obj.social();
		
	}

	@Override
	public void maths() {
		// TODO Auto-generated method stub
		System.out.println("Maths class is on every wednesday at 2 pm");
		
	}

	@Override
	public void science() {
		// TODO Auto-generated method stub
		System.out.println("Science class is on every tuesday afternoon");
		
	}

	@Override
	public void social() {
		// TODO Auto-generated method stub
		System.out.println("Social class is once every 2 weeks. Class schedule TBD");
		
	}

	@Override
	public void english() {
		// TODO Auto-generated method stub
		System.out.println("English class is twice every week on monday & saturday all day.");
		
	}

	@Override
	public void physics() {
		// TODO Auto-generated method stub
		System.out.println("Every Thursday evening");
		
	}

}
