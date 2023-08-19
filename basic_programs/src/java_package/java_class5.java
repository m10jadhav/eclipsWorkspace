//print result by using constructor


package java_package;

public class java_class5 {
	
	int r,result;
	java_class5(int r)
	{
	  result=r;
	  if(result>=70)
	  {
		System.out.println("Percentage "+""+ result +""+" : Result distingstion") ;
	  }
	  else if(result>=60)
	  {
	    System.out.println("Percentage "+""+ result +""+" : Result first class");
	  }
	  else if(result>=35)
	  {
	    System.out.println("Percentage "+""+ result +""+" : Result pass");
	  }
	  else
	  {
	    System.out.println("Percentage "+""+ result +""+" : Result failed");
	  }
	  }
		  
	public static void main(String[]args)
	{
	java_class5 ref=new java_class5(29);
	java_class5 ref1=new java_class5(40);
	java_class5 ref2=new java_class5(55);
	java_class5 ref3=new java_class5(68);
	java_class5 ref4=new java_class5(75);
	}

}
