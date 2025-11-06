package basic;
import java.util.*;
public class Switchcase {

	public static void main(String[] args) {
		int a,b;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the two numbers :");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enetr your Choice like Add ,Mul,Div,Sub .");
		String ch;
		ch=sc.next();
		
	
		switch(ch)
		{
			case "Add":
				System.out.println("Addition of two numbers are :"+(a+b));
			break;
			
			case "Mul":
				System.out.println("Multplication Of two numbers are :"+(a*b));
			break;
			
			case "Div":
				System.out.println("Division of two numbers are :"+(a/b));
			break;
			
			case "Sub":
				System.out.println("Substraction Of Two Numbers are :"+(a-b));
			break;
			
			default:
				System.out.println("Invalid Your Choice");
				
		}

	}

}
