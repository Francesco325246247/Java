package Main;

public class Account {
	
	private double balance;
	public Account(){
		balance = 0.0;
	}

	public void deposit(double amount){
		balance = balance + amount;
	}
	
	public void withdraw(double amount){
		balance = balance - amount;
	}
	
	public String getBalance(){
		
		return "Your total balance now is " + balance;
	}
}
