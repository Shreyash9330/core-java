package basic;
import java.util.*;
public class Ifexample {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("Enter the age :");
		age =sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Age is Greateer than 18.");
		}
	}
}
