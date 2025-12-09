package string;

public class Demo1 {

	public static void main(String[] args) {
		
		String s1 = new String("Hello World");
		System.out.println(s1.length());
		System.out.println(s1.substring(3));   // Start From this
		System.out.println(s1.substring(0,4));   // print this into this
		System.out.println(s1.substring(4,0));   // print this into this
		
		
		String s2 = new String("Shreyash");
		System.out.println(s2.length());
		System.out.println(s2.substring(5));
		System.out.println(s2.substring(0,2));
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.concat(s1));
		

	}

}
