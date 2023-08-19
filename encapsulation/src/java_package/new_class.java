//encapsulation output


package java_package;

public class new_class 
{
   public static void main(String[]args)
   {  
	   System.out.print("Roll no: ");
       java_class ref=new java_class();
	    ref.setRollno(15);
	    
	    ref.setName("RAM");
	   
	   System.out.println(ref.getRollno());
	   System.out.print("Name: ");
	   System.out.println(ref.getName());
	   
   }
}
