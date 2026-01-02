package collection;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap1 {

	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<>();
		
		m.put("Shreyash",101);
		m.put("Ganesh",102);
		m.put("Harshal",103);
		m.put("Shubham",104);
		m.put("Gaurav",105);
		m.put("Sanket",106);
		
		System.out.println(m);
		
		System.out.println("Keys");
		
		for(String key : m.keySet())
		{
			System.out.println(key);
		}
		
		System.out.println("Values");
		for(Integer values : m.values())
		{
			System.out.println(values);
		}
		
//		Q4. Check if a particular key exists in a HashMap.		
//		containsKey(k)	Check if key exists
		
		System.out.println(m.containsKey("Sanket"));
		
//		containsValue(v)
//		Q5. Check if a particular value exists in a HashMap
		System.out.println(m.containsValue(101));
	}

}
