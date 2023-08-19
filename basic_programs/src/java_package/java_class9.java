//find count of uppercase and lowercase count

package java_package;

public class java_class9
{
	
	public static void main(String[] args)
	{
	String s = "AbRaaatMopJOlhvgFRt";
	int uppercase = 0;
	int lowercase = 0;
	char[] ch = s.toCharArray();
	for (char chh : ch)
	{
	if (chh >= 'A' && chh <= 'Z')
	{
	uppercase++;
	} else if (chh >= 'a' && chh <= 'z')
	{
	lowercase++;
	}
	}
	System.out.println("Count of Uppercase letter are :" + uppercase); 
    System.out.println("count of lowercase are: "+""+lowercase);
}}
