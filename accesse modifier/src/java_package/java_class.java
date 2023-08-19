
//access modifier

//final keyword 

package java_package;

final class java_class
{
   final int i=50;
   
   int j=20;
                     
    void equation()    // default method 
   {    System.out.print("value of i = ");
    	System.out.println(i);
	     j=j+1;
	    final int a	=i+j;
	    System.out.print("value of a= ");
	    System.out.println(a);  
   }
	
		public static void main(String[]args)
		{
			java_class ref=new java_class();
			ref.equation();
			
		}
   
	
}
