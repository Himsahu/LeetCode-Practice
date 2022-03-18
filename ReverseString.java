//https://leetcode.com/problems/reverse-string/
public class ReverseString {
	public static void reverseString(char[] s) {
		int start = 0;
        int end = s.length-1;
        
        while (start<end)
        {
            s[start]^=s[end];
            s[end]^=s[start];
            s[start]^=s[end];
            
            ++start;
            --end;
        }
        for(int i=0;i<s.length;i++)
        	System.out.println(s[i]);
    }
	
	public static void main (String [] args)
	{
		char [] s = {'h','e','l','l','o'};
		reverseString(s);
			}

}
