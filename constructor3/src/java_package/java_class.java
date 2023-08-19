
//this constructor

package java_package;

public class java_class
{
	int i=10;
	
    java_class()
    {  
        i=i+1;
    	System.out.print("value of i= ");
    	System.out.println(i);
    }
	
	java_class(int j)
	{
		this();        //this() is used to call constructor in same class
		i=i-1;
		System.out.print("value of i=");
		System.out.println(i);
	}
	
		
	
}
