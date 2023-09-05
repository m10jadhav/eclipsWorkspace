//palidrom number=if we reverse any string or any number if string and number remains same then it is palidrom string or palidrome number

package java_package;

public class java_class2
{   String s;
    int num,m,temp, i,k,rev=0;
	String rs="";
	java_class2(String s)
	{	System.out.println("string s:"+""+s);
		for(i=s.length()-1;i>=0;i--)
		{
			rs=rs+s.charAt(i);
		}
		System.out.println("reverse string rs:"+""+rs); 

		if(s.equals(rs))
		{
			System.out.println("string is palidrom");
		}
		else
		{
			System.out.println("not palidrome");
			
		}
	}
	java_class2(int num)
	{   System.out.print("reverse num of "+ num + " is "   );
	    temp=num;
	   while(k>0) 
		{
		m=num%10;
		System.out.print(m);
		rev=rev*10+m;
		k=num/10;
		num=k;
	} 
		System.out.println(rev);
	   
	   if(temp==rev)
	   {
		  System.out.println(" number is palidrom");
		}else 
		{
		System.out.println(" number not palidrome");
		}
	} 
	public static void main(String []args) 
      {
          java_class2 ref=new java_class2("MADAM");
          java_class2 ref1=new java_class2("RADAR");
          java_class2 ref3=new java_class2("Sita");
          java_class2 ref2=new java_class2(141);
          java_class2 ref4=new java_class2(545);
          java_class2 ref5=new java_class2(123);
      }
}
