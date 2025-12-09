package oopsConcept;

class Parent1
{
	String name ="Parent Class";
	
}

class Child1 extends Parent1
{
	String name ="Child Class";


 void showNames()
 {
	 System.out.println("Child name using this:"+this.name);
	 System.out.println("Parent name using super:"+super.name);
	 
 }
 
// void showNames() {
//     System.out.println("Child name using this: " + this.name);
//     System.out.println("Parent name using super: " + super.name);
// }
}


public class Inheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Child1 c1 = new Child1();
			//Parent p1
			c1.showNames();
	}

}
