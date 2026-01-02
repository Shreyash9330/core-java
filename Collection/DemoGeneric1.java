package collection;

class Box<T>
{
	T value;
	void set(T value)
	{
		this.value = value;
	}
	
	T get()
	{
		 return value;
	}
}

public class DemoGeneric1 {

	public static void main(String[] args) {
		
		Box<String> box1 = new Box<>();
		box1.set("Shreyash");
		System.out.println(box1.get());

		Box<Integer> box2 = new Box<>();
		box2.set(100);
		System.out.println(box2.get());
	}

}
