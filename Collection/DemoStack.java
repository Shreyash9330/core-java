package collection;

import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {
		Stack s = new Stack();
		
		s.push(10);
		s.push('K');
		s.push("Tejas");
		s.push(54.1f);
		s.push(10);
		s.push(45);
		
		System.out.println(s);
		s.pop();						// LAst in First out like using pop remove  last element in stack i.e : 45;
		System.out.println(s);
		s.pop();						// that is second 10;
		System.out.println(s);

	}

}
