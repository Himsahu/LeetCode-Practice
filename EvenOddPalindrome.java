public class EvenOddPalindrome {
	
	
	public static void tocheck(String str)
	{
		int start = 0;
		int end = str.length();
		String str1 = "";
		String str2 = "";
		
		while(start<end)
		{
			if(start%2==0)
				str1+=str.charAt(start);
			else
				str2+=str.charAt(start);
			
			start++;
		}
		
		System.out.println(str1);
		System.out.println(str2);
		
		if(str1.equals(reverse(str1)) && str2.equals(reverse(str2)))
			System.out.println("True");
		
		else
			System.out.println("False");
	}
	
	static String reverse(String s)
	{
		String s1 = "";
		int i = s.length();
		
		while(i>0)
		{
			s1 +=s.charAt(i-1);
			i--;
		}
		return s1;
	}
	
	public static void main(String [] args)
	{
		String str = "abzzab";
		tocheck(str);
	}
}
