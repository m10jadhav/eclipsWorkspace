//mirror image pyramid

package java_package;

public class java_class9
{
  public static void main(String[]args)      //i=1  j=5
  {   int i,j,k;
	  for( i=1;i<=6;i++)
	  {
		  for(j=5;j>=i;j--)
		  {
		  System.out.print("* ");
		  }
	 for( k=1;k<=i;k++)
	  {
		  System.out.print(" ");
		 // for (k=5;k<=i;k--)
		  {
			  System.out.print("*");
		  }
	  }
	  }
	  System.out.println(" ");
  }
}
