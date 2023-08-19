package java_package;

public class java_class
{
    int ID;
    String name;
    
    public void student1()
    {
    	ID=1;
    	name= "Geeta";
    	System.out.println(ID);
    	System.out.println(name);
    	
    }
    
    public void student2()
    {
    	ID=2;
    	name="radha";
    	System.out.println(ID);
    	System.out.println(name);
    }
    
    public void student3()
    {
    	ID=3;
    	name="sita";
    	System.out.println(ID);
    	System.out.println(name);
    		
    }
    
    public static void main(String[]args)
    {
    	java_class ref=new java_class();
    	ref.student1();
    	ref.student2();
    	ref.student3();
    	
    }
}





