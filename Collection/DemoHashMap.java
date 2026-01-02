package collection;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put(10, 'a');   
		m.put(45, 25);
		m.put("Hello", "Hi");
		m.put(null, 36);
		m.put('s', 12);			// duplicate values are allowed 
		m.put(10, 12);			//dupliccate key not allowed 
		m.put('P', null);
		
		System.out.println(m);
		System.out.println(m.isEmpty());
		System.out.println(m.remove(10));
		System.out.println(m.remove(null));
		System.out.println(m.size());
		
		System.out.println(m.get('m'));
		System.out.println(m);
		System.out.println(m.containsKey(10));
		System.out.println(m.containsValue(null));
		
		Map m1 =new HashMap();
		m1.put(3.4f,"Welcome");
		m1.put(22,'d');
		m.putAll(m1);
		System.out.println(m);
		System.out.println(m.remove('a'));
		System.out.println(m);
		m.clear();
		System.out.println(m.isEmpty());
		System.out.println(m.size());
	}

}
