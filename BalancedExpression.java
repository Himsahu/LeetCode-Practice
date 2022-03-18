import java.util.*;
public class BalancedExpression {
	
	
	static void find(String str)
	{
		Stack <Character> st = new Stack<>();
		char [] s = str.toCharArray();
		
		for(char ch : s)
		{
			if(ch==')')
			{
				char top = st.peek();
				st.pop();
				
				boolean flag = true;
				
				while( top != '(')
				{
					if(top=='+'||top=='-'||top=='*'||top=='/')
					{
						flag = false;
					}
					
					top = st.peek();
					st.pop();
				}
			}
				
				
		}
	}
	
	public static void main(String [] args)
	{
		String str = "((a+b))";
		find(str);
	}
}
