
//super constructor

package java_package;

public class java_subclass extends java_class
{     int j;
     java_subclass()
     { 
    	super(1);
    	j=20;
    	System.out.print("value of j= ");
    	System.out.println(j);
     }
     public static void main(String[]args)
     {
    	 java_subclass ref=new java_subclass();
     }
}
