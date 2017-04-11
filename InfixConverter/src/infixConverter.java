import java.util.Scanner;

public class infixConverter {
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter a infix-fix equation to turn it to a post-fix equation.");
	
	String forward = keyboard.nextLine();
	forward = forward.replaceAll("\\s", "");
	Stack<Character> s = new Stack();

		String outputString = "";
		
		for (int i = 0; i < forward.length(); i++)
		{
			char curChar = forward.charAt(i);
			//System.out.println(isOperator(curChar));
			
			if(isOperator(curChar))
			{
				outputString = outputString + " ";
				if(!s.isEmpty())
				{
					if(addsub(curChar) && addsub(s.top()))
					{
						outputString = outputString + s.top();
						s.pop();
						outputString = outputString + " ";
						
					}
					else if(multdiv(curChar) && multdiv(s.top()))
					{		
						outputString = outputString + s.top();
						s.pop();
						outputString = outputString + " ";	
					}
					else if (addsub(curChar) && multdiv(s.top()))
					{
						outputString = outputString + s.top();
						s.pop();
						outputString = outputString + " ";
						
					}
					else if(multdiv(curChar) && addsub(s.top()))
					{
						//outputString = outputString + " ";
					}
					
				}
				s.push(forward.charAt(i));
			}
			else if (leftparen(curChar))
			{
				s.push(forward.charAt(i));
			}
			else if(rightparen(curChar))
			{
				do{
					outputString = outputString + " ";
					outputString = outputString + s.top();
					s.pop();
				}while(!leftparen(s.top()));
			}
			else
			{
				outputString = outputString + curChar;
			}
		}
		
		while(!s.isEmpty())
		{
			outputString = outputString + " ";
			outputString = outputString + s.top();
			s.pop();
		}
		
		outputString = outputString.replaceAll("[()]","");

		System.out.println(outputString);
	}
	
	    public static boolean isOperator(char op)
	    {
	        switch(op)
	        {
	            case '+':
	                return true;
	            case '-':
	                return true;
	            case '/':
	                return true;
	            case '*':
	                return true;
	            /*case '(':
	            	return true;
	            case ')':
	            	return true;*/
	            default:
	                return false;
	        }
	    }
		public static boolean addsub(char op)
		{
			switch(op)
			{
			case '+':
				return true;
			case '-':
				return true;
			default:
				return false;
			}
		}
		public static boolean multdiv(char op)
		{
			switch(op)
			{
			case '*':
				return true;
			case '/':
				return true;
			default:
				return false;
			}
		}
		public static boolean rightparen(char op)
		{
			switch(op)
			{
			case ')':
				return true;
			default:
				return false;
			}
		}
		public static boolean leftparen(char op)
		{
			switch(op)
			{
				case '(':
					return true;
				default:
					return false;
			}
		}
}