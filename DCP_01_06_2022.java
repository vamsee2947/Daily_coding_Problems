//Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).

import java.util.*;

public class Main {

	
	static boolean areBracketsBalanced(String s)
	{
	
		Stack<Character> stack
			= new Stack<Character>();

		
		for (int i = 0; i < s.length(); i++)
		{
			char x = s.charAt(i);

			if (x == '(' || x == '[' || x == '{')
			{
				
				stack.push(x);
			}

			if (stack.isEmpty())
				return false;
			char c;
			switch (x) {
			case '}':
				c = stack.pop();
				if (c == '(' || c == '[')
					return false;
				break;
			case ')':
				c = stack.pop();
				if (c == '{' || c == '[')
					return false;
				break;
			case ']':
				c = stack.pop();
				if (c == '(' || c == '{')
					return false;
				break;
			}
		}

		return (stack.isEmpty());
	}

	public static void main(String[] args)
	{
		String expr = "([{])";

			System.out.println(areBracketsBalanced(expr));
	}
}
