 //Abstract class & Abstract Method. 
public class AbstractClassExample {

	public static void main(String[] args) 
	{
		
		// Cannot instantiate abstract class
		Bank obj = new Citi();
		obj.MoneyTransfer();
		obj.Deposit();
		obj.OnlineBanking();
		obj.withdraw();
		
		

	}

}
// Bank and HDFC both are abstract classes which cannot be instantiated. 
abstract class Bank
{
	public void MoneyTransfer()
	{
		System.out.print("Money Transferring .... ");
	}
	// Abstract Methods
	public void OnlineBanking() {
	}	public void Deposit() {
	}	public void withdraw()
	
}

abstract class HDFC extends Bank
{
	public void OnlineBanking()
	{
		System.out.println("Online Banking ... ");
	}
}

// Citi is a concrete class
class Citi extends HDFC
{
	public void Deposit()
	{
		System.out.println("Money depositing .... ");
	}
	public void withdraw()
	{
		System.out.println("Money is being withdrawed....");
	}
}