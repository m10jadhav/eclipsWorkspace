//factorial number 1!,2!,3!,4!,5!....
                                                            //4!=4*3*2*1=24
package java_package;                                       //5!=5*4*3*2*1=120
                                                            //6!=6*52*1=*4*3*720
public class java_class3
{     int i;                     
	  java_class3(int i)        //Parameterized constructor
	   {   int j,k=1;
		for(j=1;j<=i;j++)
		{
			k=k*j;
		}
		System.out.print("factrorial of "+""+i+"  is:  ");
		System.out.println(k);
		
	}
	
	 public static void main(String []args)
  {
	 
	 java_class3 ref=new java_class3(4);  //constructor call
	 java_class3 ref1=new java_class3(5);
	 java_class3 ref2=new java_class3(6);
	 
  }
}
