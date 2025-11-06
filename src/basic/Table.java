package basic;
import java.util.*;
public class Table {

	public static void main(String[] args) {
		int no;
		System.out.println("Enter the no :");
		Scanner sc=new Scanner(System.in);
		no = sc.nextInt();
		System.out.println("Multiplication Table Of " + no);
		for( int i=1;i<=10;i++)
		{
			System.out.println(no+" X "+i +" = "+(no*i));
		}
	}	

}
