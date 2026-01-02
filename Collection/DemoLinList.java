package collection;

import java.util.LinkedList;
import java.util.List;

public class DemoLinList {

	public static void main(String[] args) {
		
		List l = new LinkedList();
		
		l.add(45);
		l.add('S');
		l.add(45.1f);
		l.add(45.22d);
		l.add(45);
		l.add("Jai Shree Ram");
		
		System.out.println(l);
		System.out.println(l.indexOf(45.1f));
		System.out.println(l.lastIndexOf('S'));
		
		List l1 = l.subList(0, 2);
		
		System.out.println(l1);
		System.out.println(l1.remove(1));
		System.out.println(l);
		l.clear();
		System.out.println(l);
				
		

	}

}
