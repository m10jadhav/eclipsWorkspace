// List example   collection framework

package java_package;     //By using collection 
                          //framework we can stroe
import java.util.ArrayList;
import java.util.Iterator;

public class java_class
{

	public static void main(String[]args)
	{
		
		
		 ArrayList<Object> a =new ArrayList<Object>();
		a.add(null);
		a.add(null);
		a.add("Facebook");
		a.add(1234);
		a.add(1234);
		
	Iterator<Object> b =a.iterator();
	
	while(b.hasNext())
	{
		System.out.println(b.next());
	}
		
	}

	
	
		
	}

