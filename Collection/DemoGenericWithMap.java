package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoGenericWithMap {

	public static void main(String[] args) {
		
		Map<Integer,String> m = new HashMap<Integer,String>();
		
		m.put(1,"Pune");
		m.put(2,"Amravati");
		m.put(3,"Goa");
		m.put(4,"Mumbai");
		m.put(5,"Chennai");
		
		Set<Integer> s = m.keySet();
		Iterator<Integer> i = s.iterator();
		while(i.hasNext())
		{
			
			// Print only key  
//			System.out.println( i.next());			
			
			// Print are Both key and value
			
			int k = i.next();
			String value = m.get(k);
			System.out.println(k+" = "+value);
			
		}
	
	}

}
