//Find occurrences of characters in a string

package java_package;

public class java_class8
{
	public static void main(String args[])
	{
	String s = " naAAaaaajtamnjudra";
	
	char c = 'a'; // Character to search is 'a'.
	int count = 0;
	for (int i = 0; i < s.length(); i++)
	{
	if (s.charAt(i) == c)
	count++;
	}
	System.out.println("The Character '" + c + "' appears " + count + " times.");


	}
	}
