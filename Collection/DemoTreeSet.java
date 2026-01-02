package collection;

import java.util.Set;
import java.util.NavigableSet;
import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		
		Set s = new TreeSet();
		
		s.add(13);
		s.add(12);
		s.add(36);
		s.add(685);   // Unorderd data
		s.add(87);
		s.add(13);  //duplicate  not allowed
		
		System.out.println(s);
//		System.out.println(s.first());
//		System.out.println(s.last());
		
		Set s1 = new TreeSet();
		
		s1.add("Pune");
		s1.add("Amravati");
		s1.add("Mumbai");
		s1.add("Goa");
		s1.add("Delhi");
		s1.add("Akola");
		
		System.out.println(s1);
		
		NavigableSet s2 = new TreeSet();
		s2.add(6);
		s2.add(9);
		s2.add(75);
		s2.add(45);
		s2.add(35);
		s2.add(29);
		
		System.out.println(s2);
		System.out.println(s2.floor(20)+"This less than 20");  // it floor means value less than 20 or given number that is 6,9;      
		
		
		System.out.println(s2.ceiling(30)+"This is greater than 30");
		// it ceiling  is a  value is greater than 30 or given number the output like  35,45,75
		
	}

}
