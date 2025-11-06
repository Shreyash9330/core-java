package oopsConcept;
				//Create a class Person with variable name and method showName().

				//Inherit a class Student with variable rollNo and display both name and rollNo.
class Person{
	
	String name;
	int rlno;
	void showName()
	{
		
		System.out.println("Name Of Person Is "+name);
	}
}

class Student extends Person
{
	int rlno;
	void showDetails()
	{
		
		System.out.println("Roll NO :"+rlno);
		System.out.println("Name : "+name);
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
		Student s1=new Student();
			
			s1.name="Shreyash";
			s1.rlno=55;
			s1.showDetails();
	}

}
