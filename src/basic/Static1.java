package basic;

class Employee
{
	String name;
	static String CompanyName ="Google";
	
	Employee(String n)
	{
		name =n;
	}
	
	void display() 
	{
		System.out.println(name +" Work  At "+CompanyName);
		
	}
}



public class Static1 {

	public static void main(String[] args) {
		Employee e1= new Employee("Shreyash");
		Employee e2= new Employee("Ganesh");
		
		e1.display();
		e2.display();

	}

}
