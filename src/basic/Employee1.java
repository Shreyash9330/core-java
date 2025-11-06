package basic;


class Worker
{
	int id ;
	String name ;
	float salary;
	
	Worker(int no ,String nm,float sal)
	{
		
		name=nm;
		salary =sal;
		id =no;
	}
	
	void display()
	{
		System.out.println("Id Of Emplyee is " +id+" Name OF the Employee is "+name+" Salary of the Employee "+salary);
	}
}
public class Employee1 {

	public static void main(String[] args) {
		
		Worker w1 = new Worker(5,"Shreyash",45000);
		
		w1.display();

	}

}
