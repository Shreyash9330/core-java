package basic;
import java.util.*;
public class IfElse {

	public static void main(String[] args) {
		int age ;
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enetr your age :");
		age =sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("You are Eligible foe vote");
		}
		else 
		{
			System.out.println("Your Not Eligible for Vote :");
		}
	}

}
