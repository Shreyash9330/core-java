package oopsConcept;
class Calculation{
	int z;
	void addition(int x ,int y){
		z = x + y;
		System.out.println("Sum of two numbers :"+z);
		
	}
	void Substraction(int x ,int y) {
		
		int z = x-y;
		System.out.println("Difference Between Two num :"+z);
	}
}

class MyCalculation extends Calculation{
	void Multiplication(int x ,int y){
		z = x * y;
		System.out.println("Multiplication Of Two numbers :"+z);
	}
}
public class Inheritance9 {

	public static void main(String[] args) {
		int a =56, b= 45;
		MyCalculation demo = new MyCalculation();
		demo.addition(a, b);
		demo.Multiplication(a, b);
		demo.Substraction(a, b);
		
	}

}
