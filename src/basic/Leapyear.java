package basic;
import java.util.*;
public class Leapyear {

	public static void main(String[] args) {
		int year;
		System.out.println("Enter the year :");
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		
		if((year % 400 == 0) || (year %4==0 && year %100  !=0) )
		{
			System.out.println(year +" is a Leap year");
		}
		else
		{
			System.out.println(year +" is not Leap Year");
		}

	}

}
