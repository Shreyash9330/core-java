package oopsConcept;

class Person1
{
	Person1()
	{
		System.out.println("Person Constructor Called");
	}
}

class Student1 extends Person1
{
	Student1()
	{
		super();
		System.out.println("Student Constructor Called");
	}
}
public class Inheritance7 {

	public static void main(String[] args) {
		Student1 s1 =new Student1();
	
				

	}

}
