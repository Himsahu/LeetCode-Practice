//https://leetcode.com/problems/reverse-words-in-a-string-iii/

public class ReverseFullString {
	public static String reverseWords(String s) {
        
		String [] split = s.split(" ");
        StringBuilder rev = new StringBuilder();
        for(String word : split){
            rev.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        return rev.toString().trim();
    }
	
	public static void main(String[] args)
	{
		String str = "Let's take LeetCode contest";
		System.out.println(reverseWords(str));
	}
}
