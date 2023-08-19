//this/super keyword

package java_package;

public class newclass extends testjava
{
     int i=10;
	 
 
  void output(int j)
  {   int i=25;
      System.out.println("value of i");
	  System.out.println(i);
	  System.out.println(this.i);
	  System.out.println(super.i);
  }
  public static void main(String[]args)
  {
	  newclass ref =new newclass();
	  ref.output(1);
  }
}
