package basic;
import java.util.*;
public class Fabnoicc {

	public static void main(String[] args) {
		
		int n, first =0 ,second=1,next;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no :");
		n =sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }
	}

}
