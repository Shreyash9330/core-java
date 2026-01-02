package collection;


import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {

	public static void main(String[] args) {
		
		Set s = new HashSet();  // Unordered Data
		
		s.add(11);
		s.add('A');
		s.add("Shubham");
		s.add(79.3f);
		s.add(null);
		s.add(11);
		
		System.out.println(s);
		System.out.println(s.remove(null));
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		
		Object o[] = s.toArray();     //Convert Set to Array
		for(Object i:o)
		{
			System.out.println(i);
		}
		
		s.clear();
		System.out.println(s);
		System.out.println(s.isEmpty());

	}

}
