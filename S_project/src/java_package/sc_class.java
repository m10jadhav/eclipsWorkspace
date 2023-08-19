//scanner class----->>>>used to access input from user in console

package java_package;

import java.util.Scanner;

public class sc_class {
	static int a,b;
	
	public void compare(int a,int b){
		if(a<b) {
			System.out.println("'a' is smaller than 'b'");
		}else if(a>b) {
			System.out.println("'a' is greater than 'b'");
		}else{
			System.out.println("'a' is equal to 'b'");
        }
	}
	public static void main(String[] args) {
		int i,j;
		Scanner s= new Scanner(System.in);
	    System.out.println("Enter value of a=");
		a=s.nextInt();
		i=a;
		System.out.println("Enter value of b=");
		b=s.nextInt();
		j=b;
		
		sc_class ref=new sc_class();
		ref.compare(i,j);
	}
}
