package oopsConcept;




public class GarbageCollector {

	public void finalize()
	{
		System.out.println("Object Is Grabbage Collector");
	}
	
	public static void main(String[] args) {
		
		GarbageCollector g1 =new GarbageCollector();
		GarbageCollector g2 =new GarbageCollector();
		GarbageCollector g3 =new GarbageCollector();
		g1 = null ;
		g2 = null;
		g3 = null;
		
		System.gc();
	
	}
}
