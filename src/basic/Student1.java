package basic;

		// Constructor on java 
public class Student1 {

	// instance variable
		int rollno;
		String name;
		float marks;

	Student1()
	{
		 rollno = 22;
		 name  = "Shreyash";
		 marks = 85;
	}
	
	

	
	public static void main(String[] args) {
		
		Student1 s=new Student1();
		System.out.println("Rollno="+s.rollno+" Name ="+s.name+" Marks ="+s.marks);
	}

}
