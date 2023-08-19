package basic;

public class Basic_class
{   int i=50;                           /*instatnce variable*/
	static int a=10;                    /*static variable*/
	static int b=20;
	
  public void test() {                 /*non-static method*/ /*non paramaterised method*/
	  int c=33;                        /*local variable*/
	 
	  System.out.println(c);
	  
	    }
  public void test(int a) {           /*parameterized method*/
	  int j=11;
	  int k=a+j;
	  System.out.println(k);
	  
  }
  public static void test1()          /*static method*/
  {
	  int d;
	  d=a+b;
	  System.out.println(d);
	 
  }
  public static void main(String [] args ) {        /*main method*/
	  test1();                                      /*static method call*/
	  Basic_class ref=new Basic_class();            /*object creation*/
	   ref.test(10);                                  /*non-static method call*/
	  System.out.println(ref.i);
	  
	  
  }
	
	
}
