//swap two number without temp variable


package java_package;

public class java_class4
{    int n1,n2;
     java_class4(int n1,int n2)
     {                                   //n1=10, n2=5            
    	 n1=n1+n2;                       //n1=10+5=15
    	 n2=n1-n2;                       //n2=15-5=10........n2=10
         n1=n1-n2;                       //n1=15-10=5........n1=5
         System.out.println( "number after swap "+""+n1+","+n2);
     }
     
     public static void main(String [] args)
     {
    	 java_class4 ref=new java_class4(10,5);
    	 java_class4 ref1=new java_class4(25,10);
    	 java_class4 ref2=new java_class4(57,30);
     }
     
}
