package oopsConcept;
import java.util.Scanner;
class InsufficientFundException extends Exception
{
	public InsufficientFundException(String msg)
	{
		super(msg);
	}
}
public class ExceptionHandling4 {

	public static void main(String[] args) {
		double balance = 10000.00;
		System.out.println("Enter The Amount ");
		Scanner sc = new Scanner(System.in);
		try {
			double amount = Double.parseDouble(sc.next());
			// double amount = sc.nextDouble();
			if(amount<=0)
			{
				throw new IllegalArgumentException("Amount must be generate yhan a ");
			}
			if(amount>balance)
				
			{
				 throw new InsufficientFundException("Withdrawal amount exceeds balance. Insufficient Balance!");
				
			}
		balance = balance- amount;
		System.out.println("Transication Sucessfully "+"Updated Balance is " +balance);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid Argument");
		}
		catch (InsufficientFundException e) {
            System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Unaccepted error Occured");
		}
		finally {
					System.out.println("Thank You For using ATM");
				}
		sc.close();
		}

}
