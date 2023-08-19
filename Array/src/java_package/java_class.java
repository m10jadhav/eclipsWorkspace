//Arrays 

package java_package;

import java.util.Arrays;

public class java_class
{
  public static void main(String []args)
  {   int i;
	  int a[]=new int[] {10,22,36,4};  //array declaration and store values in array
	  int b[]=new int[] {52,68,72,4};
	  int c[]=new int[] {0,0,0,0};
	    
	  System.out.println("lenght of a[]:"+""+a.length);
	  System.out.println("lenght of b[]:"+""+b.length);
	  System.out.println("Addition of a[]+b[]=c[]:");
	  for(i=0;i<=3;i++)                   //Addition of a[]+b[]
	  {
		  c[i]=a[i]+b[i];
          System.out.println(c[i]);       //a[]+b[]=c[]
          }
	     System.out.println("addition c[]:"+""+Arrays.toString(c));
	     
	     c[1]=a[2]+b[3];                 //addition by index
	     System.out.println("addition of two index:"+""+c[1]);


      for(i=3;i>=0;i--)                  //reverse a[] and reverse b[]
       {
 	     System.out.println("Reverse array a[]: ");

    	  for(i=3;i>=0;i--)               //reverse a[]
       {
    	   c[3-i]=a[i];
          System.out.println(c[3-i]);
       }
 	     System.out.println("Reverse array a[]:"+""+Arrays.toString(c));
	     System.out.println("reverse array b[]:");
         for(i=3;i>=0;i--)                //reverse b[]
 	     {
 	    	 c[3-i]=b[i];
 		     System.out.println(c[3-i]);
 		  }	   
         System.out.println("Reverse b[]:"+""+Arrays.toString(c));
       }
        for(i=0;i<=3;i++)                  //comparison between a[] and b[]
        {
         if(a[i]==b[i])
         {
    	     System.out.println("matching number");

         }
         else
         {
    	     System.out.println("Not matching");

         }
        }
         


	
	  
  }
}
