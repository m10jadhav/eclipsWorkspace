
//nested for loop


package java_package;

public class java_class2
{
   public static void main(String[]args)
   {
	   int i;
	   int j;
	   for(i=0; i<5; i++)
	   {
		   System.out.print("Increment ");
		   System.out.println(i);
		   
		   for(j=9; j>6;j--)
		   {
			   System.out.print("       Decrement  ");
			   System.out.println(j);
		   }
	  }
   }
} 
