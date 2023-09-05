package java_practice;

public class Reverse_string {
	
	public static void main(String arg[]){
		
	String str="monika jadhav";
	System.out.println("original String = "+""+str);
	char ch[]=str.toCharArray();
	String rev="";
	for (int i=ch.length-1;i>=0;i--)
	{
		rev+=ch[i];
	}
	System.out.println("reverse string = "+""+ rev);
	}

}
