//set collection framework

package java_package;

import java.util.HashSet;
import java.util.Iterator;

public class java_class1
{
public static void main(String []args)
{   
    HashSet<Object>	a=new HashSet<Object>();
 	
    a.add(null);
    a.add(null);
    a.add(10);
    a.add("google");
    
    Iterator<Object> b=a.iterator();
    while(b.hasNext())
    {
    	System.out.println(b.next());
    }
}
}