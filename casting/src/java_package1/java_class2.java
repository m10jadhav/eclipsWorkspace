
package java_package1;

public class java_class2 extends java_class1
{
	 public void add()
	   {
		   int x,y,z;
		   x=25; y=10;
		   z=x+y;
		   System.out.println("value of z"+" "+z);
	   }
		
	public static void  main(String[]args)
	{
		java_class2 ref=new java_class2();
		ref.add();
		
		java_class ref1=new java_class2();
	    ref1.add();	
	}
}
