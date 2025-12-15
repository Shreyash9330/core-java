package basic;
class Rectangle1
{
	int length ;
	int breadth;
	
	Rectangle1(int l,int b)
	{
		length =l;
		breadth =b;
	}
	void area()
	{
		int area = length * breadth;
		System.out.println("Area Of Rectangel are "+area);
	}
	
	
}
public class AreaofR {

	public static void main(String[] args) {
		
		Rectangle1 r1 =new Rectangle1(15, 2);
		r1.area();

	}

}
