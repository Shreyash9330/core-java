package oopsConcept;
import java.util.Scanner;
class ADemo
{
	int x,y;
	void get()
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		x=Sc.nextInt();
		y=Sc.nextInt();
	}
	
	void display()
	{
		try {
			if(y==0)
				throw new ArithmeticException();
			else if(x<y)
				throw new Exception();
			else 
				System.out.println("Division = "+(x/y));
			}
		catch(ArithmeticException ae)
		{
			System.out.println("Divide By 0 Not Possible");
		}
		catch(Exception e)
		{
			System.out.println("First  No Is Smaller Than Second No");
		}
		
		finally
		{
			System.out.println("Thank you");
		}
			System.out.println("Addition = "+(x+y));
			System.out.println("Substraction = "+(x-y));
			System.out.println("Multiplication = "+(x*y));
			
		}
	}

public class ExceptionHandling2 {

	public static void main(String[] args) {
		ADemo a = new ADemo();
		a.get();
		a.display();

	}

}
