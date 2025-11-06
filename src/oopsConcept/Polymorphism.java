package oopsConcept;
										// --- Method Overloading in Polymorphism ---  //
class Main 
{
	int add(int a,int b)
	{
		return(a+b);
	}
	
	double add(double a,double b)
	{
		return(a+b);
	}
	
	int Mul(int a,int b)
	{
		return(a*b);
	}
}
public class Polymorphism {

	public static void main(String[] args) {
			Main m1 = new Main();
			System.out.println(m1.add(75,25));				// calls  add(int a,int b);
			System.out.println(m1.add(54.3, 35.4));         // calls  add(float a,float b)
			System.out.println(m1.Mul(13,9));				// calls  add(int a,int b);

	}

}
