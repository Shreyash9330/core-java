package basic;

import java.util.*;
	
		// Array of Object 
public class Student {

		int rollno;
		String name;
		float marks;
		
		void get()
		{
			System.out.println("Enter  the Rollno,Name & Marks ");
			Scanner sc=new Scanner(System.in);
			rollno=sc.nextInt();
			name=sc.next();
			marks=sc.nextFloat();
			
		}
		
		void displays()
		{
			System.out.println("Rollno ="+rollno+" Name ="+name+" Marks ="+marks);
		}
		
			
		
		
	public static void main(String[] args) {
		
//			Student s=new Student();
//			s.get();
//			s.displays();
//			
//			Student s1=new Student();
//			s1.get();
//			s1.displays();
		
		Student  s[] =new Student[5];
		for(int i=0;i<=5;i++)
		{
			s[i]=new Student();
			s[i].get();
			s[i].displays();
					
		}
			
			
			
			
	}

}
