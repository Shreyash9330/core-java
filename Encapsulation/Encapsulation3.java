package oopsConcept;

/*Create a class BankAccount with private variables accountNumber and balance.
  Use methods deposit() and withdraw() to modify balance.
  Prevent withdrawing more than the balance.*/

class BankAccount 
{
	
	// Private data members (Encapsulation)
	private String accountNumber;
	private double balance;
	
	
	   // Constructor
	BankAccount(String accountNumber,double balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	
	 // Deposit method
	public void deposit(double amount)
	{
		if(amount > 0)
		{
			balance += amount;
			System.out.println("Deposited Rs :"+amount);
		}
		else
		{
			System.out.println("Invalid deposit Amount");
		}
	}
	
	
	// Withdraw method with balance check
	public void withdraw(double amount)
	{
		if(amount > 0 && amount <= balance)
		{
			balance -=amount;
			System.out.println("Withdrawn : Rs"+amount);
		}
		else if (amount > balance)
		{
			System.out.println("Insufficient Balance!");
		}
		else
		{
			System.out.println("Invalid Withdraw Amount");
		}
	}
	
	
	// Getter for account number
	public String getAccountNumber()
	{
		return accountNumber;
	}
	 
	
	 // Getter to check current balance
	public double getBalance()
	{
		return balance;
	}
	
	
}

public class Encapsulation3 {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount("123456789",5000.0);
		
		System.out.println("Account Number :"+acc.getAccountNumber());
		System.out.println("Initial Balance : "+acc.getBalance());
		
		acc.deposit(1000);
		acc.deposit(4000);
		acc.withdraw(10000);
		acc.withdraw(100);
		
		System.out.println("Final Balance :"+acc.getBalance());

	}

}
