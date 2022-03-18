import java.util.*;

public class SimplifyPath {
	
	 public static String simplifyPath(String path) {
	        
		 Deque<String> dq = new ArrayDeque<>();
	       StringBuilder sb = new StringBuilder();
	       
	       path = path+"/";
	       
	       for(int i =0;i<path.length();i++)
	       {
	           char c = path.charAt(i);
	           if(c=='/')
	           {
	               String s = sb.toString();
	               
	               if(s.length()==0||s.equals(".")){
	                   sb.setLength(0);
	                   continue;
	               }
	               
	               else if(s.equals(".."))
	               {
	                   if(!dq.isEmpty())
	                       dq.removeLast();
	               }
	               
	               else{
	                   dq.addLast(s);
	               }
	               sb.setLength(0);
	           }
	           else{
	               sb.append(c);
	           }
	       }
	       
	       StringBuilder f = new StringBuilder();
	       if(dq.isEmpty())
	       {
	           f.append('/');
	       }
	       
	       while(!dq.isEmpty()){
	           f.append('/');
	           f.append(dq.removeFirst());
	       }
	       
	       return f.toString();

	}
	 
	public static void main(String [] args)
	{
		String path = "/../";
		
		System.out.println(simplifyPath(path));
	}
}
