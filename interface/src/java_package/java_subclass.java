
package java_package;

public class java_subclass implements java_class 
{
   public void equation1()
   {
	  int i=20;
	  int j=10;
	  int a=i+j;
	  System.out.print("value of a = ");
	  System.out.println(a);   
   }
	
   public void equation2()
   {
	  int i=50;
	  int j=30;
	  int b=i-j;
	  System.out.print("value of b = ");
	  System.out.println(b);
	}
	
   public void equation3()
   {
	  int i=5;
	  int j=10;
	  int c=i*j;
	  System.out.print("value of c = ");
	  System.out.println(c);
	   
   }
   public static void main(String[]args)
   {
	   java_subclass ref=new java_subclass();
	   ref.equation1();
	   ref.equation2();
	   ref.equation3();
   }
	
}
