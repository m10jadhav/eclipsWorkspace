//String

package java_package;

public class java_class
{
    public static void main(String[]args)
	  { int i;
		String a="first name";                  //String literal
		String b=new String("LAST NAME");       //String object
		String c="";
		String d="";
		System.out.println(a);
		System.out.println(b);
        System.out.println(a+": "+"MONIKA");
		System.out.println(b+": "+"JADHAV");
		System.out.println(a+"  "+b);

		System.out.println(a.length());
		System.out.println(b.length());
		System.out.println(a.charAt(6));
		System.out.println(b.charAt(3));
		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());
		System.out.println(a.equals(b));
		System.out.println(a.isEmpty());
		System.out.println(b.isEmpty());
		System.out.println(a.isBlank());
		System.out.println(b.isBlank());
		System.out.println(a.trim());
		System.out.println(b.trim());
		
		for(i=a.length()-1;i>=0;i--)
		{
			 c= c+a.charAt(i);
		}
	System.out.println(c);
	
	  for(i=b.length()-1;i>=0;i--)
	  {
	  d=d+b.charAt(i);
	  }
	  
	  System.out.println(d);
	  }
    
    
}








