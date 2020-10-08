/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int  cases = Integer.parseInt(br.readLine());
		while(cases-- >0){
		    String str = br.readLine();
		    Stack<Integer> stack = new Stack<>();
		    stack.push(-1);
		    int max = 0;
		    for(int i=0;i<str.length();i++)
		    {
		        char c = str.charAt(i);
		        if(c=='(')
		        stack.push(i);
		        if(str.charAt(i)==')')
		        {
		            stack.pop();
		            if(stack.isEmpty())
		            stack.push(i);
		            else
		            max = Math.max(max,i-stack.peek());
		        }
		    }
		    System.out.println(max);
		}
	}
}
