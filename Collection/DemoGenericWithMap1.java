package collection;
										// Customm User defined  Class used in this program 
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;


class Book
{
	int bid;
	String bname,bauthnm;
	float bprice;
	public Book(int bid, String bname, String bauthnm, float bprice) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bauthnm = bauthnm;
		this.bprice = bprice;
	}
	@Override
	public String toString() {
		return "Book [ bid = " + bid + ", bname = " + bname + ", bauthnm = " + bauthnm + ", bprice = " + bprice + " ] ";
	}
	
	
}

public class DemoGenericWithMap1 {

	public static void main(String[] args) {
		List<Book> l = new ArrayList<Book>();
		l.add(new Book(1,"C","ABC",678.5f));	
		l.add(new Book(2,"Python","PQR",458.5f));	
		l.add(new Book(3,"Java","IJK",523.5f));	
		l.add(new Book(4,"C++","XYZ",896.5f));	
		
		ListIterator<Book> li = l.listIterator();
		while(li.hasNext())
		{
			Book b = li.next();
			System.out.println(b);
		}
		
	}

}
