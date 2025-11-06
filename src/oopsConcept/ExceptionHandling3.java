package oopsConcept;
	
class Arr1
{
	void disaplay() {
		
	int arr[]= {12,13,14};
	
	try {
		
		System.out.println(arr[5]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Array Index Invalid");
	}
	catch(Exception e)
	{
		System.out.println("Went Wrong");
	}
	finally
	{
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
	}
}
public class ExceptionHandling3 {

	public static void main(String[] args) {
		Arr1 a1= new Arr1();
		a1.disaplay();

	}

}
