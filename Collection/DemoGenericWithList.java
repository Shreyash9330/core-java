package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class DemoGenericWithList {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
			l.add("Pune");
			l.add("Amravati");
			l.add("Akola");
			l.add("Jalgaon");
			l.add("Chikhli");
			
			System.out.println(l);
			
			ListIterator<String> li = l.listIterator();
			while(li.hasNext())
			{
				System.out.println(li.next());
			}
			
			System.out.println("**********************************");
			
			while(li.hasPrevious())
			{
				System.out.println(li.previous());
			}
			

	}

}
