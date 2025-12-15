package oopsConcept;

class Students
{
	private String  name;
	private int age;
	private int rno;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name =name;
	}
	
	public int getAge()
	{
		
		return age;
	}
	
	public void setAge(int age)
	{
		if(age>0)
		{
			this.age=age;
		}
		else
		{
			System.out.println("Age is Invalid");
		}
	}
	
	public int getRno()
	{
		return rno;
	}
	
	public void setRno(int rno)
	{
		this.rno =rno;
	}
		
}

public class Encapsulation {

	public static void main(String[] args) {
			Students s1 = new Students();
			s1.setName("Shreyash");
			s1.setAge(22);
			s1.setRno(15);
			
			System.out.println("Name :"+s1.getName());
			System.out.println("Age :"+s1.getAge());
			System.out.println("Rno :"+s1.getRno());
	}

}
