

package java_package;

public class sub_class extends java_class     //inheritance concept used to extends java_class
{
  public void options()
  {   System.out.println();
	  System.out.print("Deposit         ");
	  System.out.println("     fast cash");
	  System.out.print("transfer        ");
	  System.out.println("Cash withdrawl");
	  System.out.print("Pin change      ");
	  System.out.println("Balance inquir");
	  System.out.print("other           ");
	  System.out.println("Mini statement");
  }
  public void end()
  {   
	  System.out.println();
	  System.out.println("End process");
  }
	public static void main(String[]args)
	{
		sub_class ref= new sub_class();
		ref.ATM();
		ref.options();
		ref.end();
	}
	
}
