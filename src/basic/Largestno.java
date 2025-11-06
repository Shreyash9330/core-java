package basic;
import java.util.*;
public class Largestno {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter the value Of a,b & c :");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a >= b && a>=c)
		{
			System.out.println("A is Largest No"+a);
		}
		else if(b>=a && b>=c)
		{
			System.out.println("B is a Largest no"+ b);
		}
		else 
		{
			System.out.println( " C Is a Largest no"+c);
		}
	}

}
