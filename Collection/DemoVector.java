package collection;

import java.util.List;
import java.util.Vector;

public class DemoVector {

	public static void main(String[] args) {
		List l = new Vector();
		l.add(10);
		l.add(96);
		l.add('M');
		l.add("Harshal");
		l.add(12.3f);
		l.add(10);
		
		System.out.println(l);
		System.out.println(l.indexOf(12.3f));
		System.out.println(l.indexOf(10));
		System.out.println(l.lastIndexOf(10));
		System.out.println(l.remove(2));
		
		System.out.println(l);
		
		List l1 = l.subList(0,2);
		
		System.out.println(l1);
		l.clear();
		System.out.println(l);
	}

}
