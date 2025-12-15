package oopsConcept;
import java.util.Scanner;

class InvalidAgeException extends Exception
{
		public InvalidAgeException (String msg)
		{
			super(msg);
		}
	int age ;
	
	void display()
	{
		try {
			  if(age != 18)
			  {
				  throw new InvalidAgeException ("Invalid Age");
			  }
			  else
			  {
				  System.out.println("You eligible for vote");
			  }
		}
		catch (InvalidAgeException ie)
		{
			System.out.println("Invalid Age");
		}
	}
}




public class ExceptionHandling1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter Yuur Age ");
		int age = sc.nextInt();
		InvalidAgeException ie = new InvalidAgeException();
		ie.display();
	}

}
