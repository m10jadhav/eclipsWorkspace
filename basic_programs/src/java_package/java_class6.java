//even and odd number by using constructor

package java_package;

public class java_class6
{   
	int i,j;     
	 java_class6()
      {                            //if i=10; j=10%2=0 then number is even
	     for(i=0;i<=20;i++)
	      {                        //if i=13; j=13%2=6.5 which is not equal 
	        j=i%2;                 // to 0 hence number is odd
		     if(j==0)
		     {   
			      System.out.println("even number :"+""+i);
		     }
		     else
		       {  
		    	 System.out.println("odd number : "+""+i);
		       }
	     }
   }
	
	public static void main(String []args)
  {
 
	 java_class6 ref=new java_class6();
  
  
  }









}




