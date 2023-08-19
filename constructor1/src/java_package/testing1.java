package java_package;

public class testing1 
{
	
	    int ID;
	    String name;
	    
	    testing1(int i, String n)
	    {
	    	this.ID=i;
	    	this.name=n;
	    	System.out.print(ID);
	    	System.out.println(name);
	    }
	    
	    public static void main(String[]args)
	    {
	    	testing1 ref=new testing1(1,"geeta");
	        testing1 ref1=new testing1(2,"radha");
	    	testing1 ref2=new testing1(3,"sita");
	    	
	    }
	
}
