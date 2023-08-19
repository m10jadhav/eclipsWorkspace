//print pattern pyramid 

package java_package;

public class java_class8 
{
	public static void main(String[]args)
	{   int i,j,k;                                            
		for( i=1;i<=5;i++)                                     
		{
		  for( j=4;j>=i;j--)
			System.out.print(" ");
		 
		    for( k=1; k<=i ;k++)
		    {
		       System.out.print("* ");
		     }

	        System.out.println(" ");

		}

}
 

}


