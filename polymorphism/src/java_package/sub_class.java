
// polymorphism (metho overriding)

package java_package;

public class sub_class extends java_class
{
	public void shape(int i,int j )
	{
		int a;
		a=i*j;
		System.out.println("area of square");
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		sub_class ref = new sub_class();
		ref.shape("area");
		ref.shape(10,10);
	}
}
