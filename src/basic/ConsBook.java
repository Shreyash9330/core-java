package basic;

class Book11
{
	String title ;
	String author;
	
	Book11()
	{
		title="Rich Dad Poor Dad";
		author="XYZ";
	}
	void display() {
		System.out.println("Title Of the book "+title+" "
				+ "Author of the book is "+author);
	}
}

public class ConsBook {

	
	public static void main(String[] args) {
		
		Book11 b1 =new Book11();
		b1.display();
	}

}
