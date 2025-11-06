package oopsConcept;

class Parent 
{
		int x;
		void show()
		{
			System.out.println("Parent Method");
		}
		
}

class Child extends Parent
{
	int y ;
	void display()
	{
		System.out.println("This is a child Method");
	}
}


public class Inheritance {

	public static void main(String[] args) {
		Child c=new Child();
		c.display();
		c.show();

	}

}
