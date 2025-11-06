package oopsConcept;
						//Hierarchical Inheritance
class Employee
{
	void work()
	{
		System.out.println("Employee Work On Company");
	}
}

class Developer extends Employee
{
	void Writecode()
	{
		System.out.println("Developer Write a Code");
	}
}

class Manager extends Employee
{
	void manageTeam()
	{
		System.out.println("Manager Manage All Team");
	}
}
public class Inheritance5 {
	
	public static  void main(String args[])
	{
		Employee e  =new Employee();
		Developer d =new Developer();
		Manager   m  =new Manager();
		m.manageTeam();
		e.work();
		d.Writecode();
	}

}
