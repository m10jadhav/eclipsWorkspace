package java_practice;

public class Fibonacci_series {
	public static void main(String arg[]) {
		int i;
		int n1=0;
		int n2=1;
		int n3;
		System.out.println("Fibonacci series");
		System.out.print(n1+","+n2);
		for(i=2;i<=11;i++)
		{
			n3=n1+n2;
			System.out.print(","+n3);
			n1=n2;
			n2=n3;
			
		}
		
		
	}

}
