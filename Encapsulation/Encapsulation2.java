package oopsConcept;


class Employees
{
	private int empid;
	private float salary;
	private String empName;
	
	public int getEmpid()
	{
		return empid;
	}
	
	public void setEmpid(int empid)
	{
		this.empid =empid;
	}
	
	public float getSalry()
	{
		return salary;
	}
	
	public void setSalary(float salary)
	{
		if(salary>10000)
		{
			this.salary = salary;
		}
		else
		{
			System.out.println("Invalid Salary");
		}
		
	}
	
	public String getEmpName()
	{
		return empName;
	}
	
	public void setEmpName(String empName)
	{
		this.empName = empName;
	}
}
public class Encapsulation2 {

	public static void main(String[] args) {
		Employees e1 = new Employees();
		e1.setEmpid(101);
		e1.setEmpName("Ganesh");
		e1.setSalary(100000.00f);
		
		System.out.println("Emplyee Details :");
		System.out.println("Empolyee id :"+e1.getEmpid());
		System.out.println("Emplyee Name :"+e1.getEmpName());
		System.out.println("Employee Salary "+e1.getSalry());

	}

}
