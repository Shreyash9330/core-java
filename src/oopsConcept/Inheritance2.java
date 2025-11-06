package oopsConcept;
						// Single Inheritance :
class Teacher
{
	void teach()
	{
		System.out.println("Teacher Teach to th student");
	}
}

class MathTeacher extends Teacher
{
	void ExplainMath()
	{
		System.out.println("He is a Math Teacher");
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		
		MathTeacher m1 = new MathTeacher();
		m1.teach();
		m1.ExplainMath();

	}

}
