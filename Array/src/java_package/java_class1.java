//multi dimensional arrays
                              //  a[][]              b[][]       
package java_package;         // 1  20  30       //11  20  33
                              //40  11  60       //44  11  66
import java.util.Arrays;      //70  80   1       //70  88  11  

public class java_class1       

{
   public static void main(String args[])
   {   int i,j;
	   int a[][]=new int[][] {{1,20,30},{40,11,60},{70,80,1}};
	   int b[][]=new int[][] {{11,20,33},{44,11,66},{70,88,11}};
	   int c[][]=new int[3][3];
	   int d[][]=new int[3][3];
	   System.out.println("a[3][3]:"+""+Arrays.deepToString(a));
	   System.out.println("b[3][3]:"+""+Arrays.deepToString(b));
	   System.out.println("lenght of a[][]:"+""+a.length);
	   System.out.println("lenght of b[][]:"+""+b.length);
	   c[0][0]=a[2][0]+b[1][0];
	   System.out.println("c[0][0]:"+""+Arrays.deepToString(c));

     for(i=0;i<=2;i++)
	   {
		 for(j=0;j<=2;j++)
		   {
			 c[i][j]=a[i][j]+b[i][j];
			// System.out.println(Arrays.deepToString(c));
            }
		// System.out.println(Arrays.deepToString(c));
        }
	      System.out.println("c[][]:"+""+Arrays.deepToString(c));
           System.out.println("compare a[][]==b[][]");

     for(i=0;i<=2;i++)
       {
		for(j=0;j<=2;j++) 
    	 {
           if(a[i][j]==b[i][j])
           {
		      d[i][j]=1;
				 System.out.println(Arrays.deepToString(d));
           }
			 //System.out.println(Arrays.deepToString(d));
           else
          {
		    d[i][j]=0;
			//System.out.println(Arrays.deepToString(c));
         }
    	}
      }
   }
 }



   









