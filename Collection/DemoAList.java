package collection;
	import java.util.List;
	import java.util.ArrayList;
public class DemoAList {

	public static void main(String[] args) {
		
				List l = new ArrayList();
				
				l.add(10);
				l.add("Shreyash");
				l.add('A');
				l.add(45.4f);
				l.add(23.43d);
				l.add(10);
			
				System.out.println(l);
				System.out.println(l.lastIndexOf(10));
				System.out.println(l.indexOf("K"));
				System.out.println(l.remove(0));
				System.out.println(l);
				
				
			List l1 =l.subList(0,5);
			System.out.println(l1);
			l.clear();
			System.out.println(l);
			}

		


	}


