//reverse number

package java_package;

public class java_class7
{  
  
 public static void main(String []args)
  {   int i,r; int rev=0;
	  int n=121;
	  int m = 0;
	 int temp=n;
	  System.out.print("Reverse number of "+""+n+" is: ");
      for(i=1;i<=3;i++)
      {
	   m=n%10;
	  // System.out.print(m);
	   rev=rev*10+m;
       r=n/10;
        n=r;
      }
     System.out.println(rev);
      
     if (rev == temp)
   {
    	System.out.println("number is palindrome");
    }else
    {
  	  System.out.print(" number not palindrome");
     }
      
    }
}
 

