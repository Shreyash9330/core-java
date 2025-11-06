package basic;

class Student11
{
	String name;
	
	static String college;
	
	Student11(String nm,String clg)
	{
		name= nm;
		college =clg;
	}
	void display()
	{
		System.out.println("Name Of The Student Is a "+name);
		System.out.println("Collge of the student is "+college);
	}
}

public class Static2 {

	public static void main(String[] args) {
		
		Student11 s1 = new Student11("Shreyash","AEC");
		Student11 s2 = new Student11("Ganesh","COEP");
		s1.display();
		s2.display();
	
	}
	

}
