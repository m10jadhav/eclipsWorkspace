

package java_package;

public class java_class1 extends java_class
{
	
	public void multi()
	{
		int a=20;
		System.out.println(a);
		int b=10;
		System.out.println(b);
		int multi;                  //multi
		multi=a*b;
		System.out.print("multi=");
		System.out.println(multi);
	}
	
	public static void main(String[]args)
	{
		java_class1 ref=new java_class1();
	    ref.sum();
		ref.sub();
		ref.multi();
		
		
	}
}
