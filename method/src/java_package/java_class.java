package java_package;

public class java_class {
	
	public static void main(String[]agrs)  //main method
	{
		boolean b1=true;
		int b=20;
		int a=127;
		System.out.println(b);
		System.out.println(a);
		a+=++b;
		System.out.println("a"+a);
		test();                           //static method called by name only
		java_class.test();                 //static method called by class name
		
		java_class ref=new java_class();   //object creation of non-static method 
		ref.test1();
		
		
	}
	  
	public static void test() 
	{
		int i=10;
		System.out.println(i);            //static method
	}
	
	public void test1()
	
	{
		int j=30;                        // non-static method
		System.out.println(j);
	}

}
