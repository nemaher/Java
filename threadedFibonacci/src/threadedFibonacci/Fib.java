package threadedFibonacci;
import java.util.Scanner;

public class Fib extends Thread
{
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int x = 0;
		System.out.println("Enter a positive number to get its Fibionacci number.");
		x = keyboard.nextInt();
		
		System.out.println(fib(x));
	}
	
	public static int fib(int n)
	{		
		//fibinachi sequence
		if(n == 1)
		{
			return 0;
		}
		else if(n == 2)
		{
			return 1;
		}
		else if (n == 3)
		{
			return 1;
		}
		else
		{
			return fib(n-1) + fib(n-2);
		}
	}
}
