
public class Animals implements Tiger{

	public static void main(String[] args) {
		Animals obj=new Animals();
		obj.eat();
		obj.run();
		obj.sleep();
		obj.travel();
		

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Tiger is eating");
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("Tiger is busy travelling");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Tiger is running");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Tiger is sleeping don't disturb");
		
	}

}


