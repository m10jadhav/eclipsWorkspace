package java_package;

public class Testing1
{
	public void test()
	{
		System.out.println("test method");
	}
    public void test(int i,String s)
    {
    	System.out.println("test1 method");
    }
    	public void test(int i,int j,String s)
    	{
    		System.out.println("test2 method");
    	
    	}
    	public static void main(String[]args)
    	{
    		Testing1 test=new Testing1();
    		test.test();
    		test.test(1,"str");
    		test.test(1,2,"qwe");
    	}
}
