package java_package1;

public class java_class1 extends java_class
{
	 public void add()
	   {
		   int i,j,k;
		   i=15; j=10;
		   k=i+j;
		   System.out.println("value of k"+" "+k);
	   }
		
	 public void sub()
	   {
		   int l,m,n;
		   l=25; m=10;
		   n=l-m;
		   System.out.println("value of n"+" "+n);
	   }
		
	 public static void  main(String[]args)
		{
			java_class1 ref=new java_class1();
			ref.add();
			ref.sub();
			
			java_class ref1=new java_class1();
		    ref1.add();	
		}
}
