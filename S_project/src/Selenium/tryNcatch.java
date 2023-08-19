//try N catch block----finally block

package Selenium;

public class tryNcatch {
public static void main(String[] args) {
	int a,b,c;
	a=10;
	b=0;
	try {
		c=a/b;
	   System.out.println(c);
	}
	catch(ArithmeticException E) {
		System.out.println("it gives Arithmatic Exception");
	}
   finally {
		System.out.println("program must be executed");

       }
	System.out.println("program continue");
	}
}

