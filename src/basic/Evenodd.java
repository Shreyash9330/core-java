package basic;
import java.util.*;
public class Evenodd {
	
	public static void main(String args[])
	{
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no :");
		a=sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("Given No is a Even");
		}
		else
		{
			System.out.println("Given no is a Odd");
		}
	}
}
