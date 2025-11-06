package basic;

class Test
{
	static void sub(int a,int b)
	{
		System.out.println("Substraction Of two numbers "+(a-b));
		
	}
	
	void Mul(int x,int y )
	{
		System.out.println("Multiplication Of two Numbers = "+(x*y));
	}
	
}
public class Static5 {

	public static void main(String[] args) {
		Test.sub(15,10);
		Test t1 =new Test();
		t1.Mul(15, 5);
		
	}

}
