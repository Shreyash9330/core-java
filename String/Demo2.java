package string;
								// StringBuilder  in java 
public class Demo2 {

	public static void main(String[] args) {
		
		StringBuilder   sb = new StringBuilder("Jai Shree Ram"); 
		System.out.println(sb.capacity()); // Length of the  String + byte us in create obj;
		System.out.println(sb.insert(0, "P"));  // add the give location
		System.out.println(sb.append("IT"));	// Add the last
		System.out.println(sb.delete(0, 1));    // delete give location
		System.out.println(sb.replace(0, 5, "Ram"));
		System.out.println(sb.reverse());
		
		

	}

}
