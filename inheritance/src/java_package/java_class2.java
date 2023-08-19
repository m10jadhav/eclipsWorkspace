package java_package;

public class java_class2 extends java_class1
{
	public void divide()
	 {
		 int a=20;
		 System.out.println(a);
		 int b=10;
		 System.out.println(b);
		 int div;
		 div=a/b;                           //divide
		 System.out.print("div="+""+div);
		// System.out.println(div);
		 }
	   public static void main(String[]args)
	 {
		java_class2 ref=new java_class2();
		//ref.sum();
		ref.sub();
		ref.multi();
		ref.divide();
		ref.sum();
	 }
	}


