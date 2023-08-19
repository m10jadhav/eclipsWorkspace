package basic;

public class subclass extends superclass {
	public void test3() {
		System.out.println("subclass method");
	}
	
	public static void main(String []args) {
		subclass ref=new subclass();
		ref.test3();
		ref.test();
		ref.test2();
		
	}

}
