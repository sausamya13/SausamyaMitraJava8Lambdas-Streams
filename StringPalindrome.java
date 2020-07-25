import java.util.Scanner;
public class StringPalindrome
{
	
	private static  boolean isItPalindrome(String str)
		{
			String rev="";
			int length=str.length();
			for(int i=length-1;i>=0;i--)
			{
				rev=rev+str.charAt(i);
			}
			if(str.equals(rev))
				return true;
			else
				return  false;
		}
		public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String  inputString=sc.nextLine();
		if (isItPalindrome(inputString))
		{
			System.out.println(inputString+" is a palindrome");
		}
		else
		{
	       System.out.println(inputString+" is not a palindrome");
	   }
	}
}