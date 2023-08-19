package java_package;

public class java_class
{
	int b=20;                      //instant variable/ non-static variable
	static int c=30;               //static variable
	
	public static void test()      //static method
	{
		int i=10;                  //local variable
		System.out.println(i);
			
	}
	
	public void test1()
	{
		int j=30;
		System.out.println(j);
		
	}
	
	public static void main(String[] args)//main method
	{
		int a=20;
		System.out.println(a);
		
		test();                       //static method calling
		java_class.test();            //static method calling by class
		
		System.out.println(c);
		System.out.println(java_class.c);
		java_class ref= new java_class();
		ref.test1();
		System.out.println(ref.b);
		
	}
	
	

}
