//parameterized method

package java_package;

public class java_class
{
	public void triangle (int i, int j)     //parameterized method
	{
		System.out.print("area of triangle= ");
		int a;
		a=i*j/2;
		System.out.println(a);
		}
	public void square (int k)
	{
		System.out.print("area of square= ");
		int a;
		a=k*k;
		System.out.println(a);
		
	}
	
    public static void main (String[]args)
    {
        java_class ref= new java_class();
    	ref.triangle(10 ,20);               //method call with parameter  
        ref.square(10);
    
    }
    
}
