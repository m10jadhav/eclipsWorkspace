//polymorphism (overloding)  //one object perform 
                             //different role at 
package java_package;        //different time of 
                             //Interval
public class java_class
{   
	public void shape (String s)
	{
	  System.out.println("Find Area of shapes");
			
	}
	

	public void shape(int i,int j)
	{
		int a;
		a=i*j/2;
		System.out.println("area of trigle ");
		System.out.println(a);
	}
	public static void main(String []args)
	{
		java_class ref=new java_class();
		ref.shape("triangle");
		ref.shape(12,10);
	}
	
	
}
