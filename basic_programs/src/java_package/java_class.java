//reverse string

package java_package;

public class java_class
{
  

      public static void main(String[]args)
      {  
       int i;
	   String s= "Welcome in java world";
	   String rs="";
	   
	   for(i=s.length()-1;i>=0;i--)
	   {
		   rs=rs+s.charAt(i);
	   }
	   
	   System.out.println("Original String="+""+ s);
	   System.out.println("Reverse String="+""+ rs);
	   
   }
}
