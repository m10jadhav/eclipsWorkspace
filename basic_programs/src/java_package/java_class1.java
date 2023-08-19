//fibonacci Series >>>>>>0,1,1,2,3,5,8,13,21,34,55,89,144......
                         //n3=n1+n2
package java_package;

public class java_class1
{ 
  public static void main(String[]args)
  {   int i;
	  int n1=0;
	  int n2=1;
	  int n3;
	  System.out.println("fibonacci series:");
	  System.out.print(n1+","+n2);
	 
	  for(i=2;i<=11;i++)         
	  {	  
	  n3=n1+n2;                //n1=0; n2=1; n3=1
	  System.out.print(","+""+n3);     
	  n1=n2;                   //n1=n2=1; n2=n3=1
	  n2=n3;
	 
	  }
	  
  }
}