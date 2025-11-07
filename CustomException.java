package oopsConcept;
									// Custom Exception Handling In java
import java.util.Scanner;
class Passout extends Exception
{
	Passout(String msg)
	{
		super( msg);
	}
	
}
public class CustomException {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Passout Year");
		int year=Sc.nextInt();
		
		try
		{
			if(year != 2024) {
				throw new Passout("Passout Year Must be 2024!......"  + "Soory You Can't Apply");
			}
			else {
				System.out.println("Register Here..........");
			}
		}
		catch (Passout p)
		{
			System.out.println("Exception Caught: " + p.getMessage());
		}
		
	}

}
