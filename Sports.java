
public class Sports implements Sport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sports obj=new Sports();
		obj.bat();
		obj.bowl();
		obj.field();
		obj.keeping();
		obj.umpire();
	}

	@Override
	public void bat() {
		// TODO Auto-generated method stub
		System.out.println("Sachin is batting on 99");
	}

	@Override
	public void field() {
		// TODO Auto-generated method stub
		System.out.println("Sachin is field on the leg side");
	}

	@Override
	public void bowl() {
		// TODO Auto-generated method stub
		System.out.println("Tendulkar bowling was great in last over");
	}

	@Override
	public void keeping() {
		// TODO Auto-generated method stub
		System.out.println("Dhoni is one of the best wicker keeper ever. ");
		
	}

	@Override
	public void umpire() {
		// TODO Auto-generated method stub
		System.out.println("David Shepard was one of the best umpire's ever in the cricket history!");
		
	}

}
