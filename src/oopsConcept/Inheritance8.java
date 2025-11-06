package oopsConcept;
class Laptop{
	
	void display()
	{
		System.out.println("There are the many types of laptop like ");
	}
}




public class Inheritance8 extends Laptop {
	
	
	void display(String Modelnm,int mno) {
		
		System.out.println("Laptop Model name is a "+Modelnm);
		System.out.println("Laptop Model no is a  "+mno);
		
	}
	public static void main(String[] args) {
		
		Inheritance8 myobj =new Inheritance8();
		myobj.display("Victus",75);
		

	}

}
