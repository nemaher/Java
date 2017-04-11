import java.io.File;
import java.util.Scanner;

public class Homework3Problem2 
{
	public static void main(String[] args)
	{
		try
		{
			File f = new File("in.txt");
			Scanner input = new Scanner(f);
			
			String Prime = input.nextLine();
			//System.out.println(Prime);
			String[] stringArray = Prime.split(" ");//after part 1 it stores an array into a string. I will split the spaces to make a new array
			int[] intArray = new int[stringArray.length];
			
			for (int i = 0; i < stringArray.length; i++) 
			{
				intArray[i] = Integer.parseInt(stringArray[i]);
			} 
			
            /*for(int i=0; i < intArray.length; i++)
            {
                System.out.print(intArray[i] + " ");
            }*/
			
			System.out.println("Enter a number to see if it is prime.");
			Scanner keyboard = new Scanner(System.in);
			int num = Integer.parseInt(keyboard.nextLine());
			
				int lo = 0;
				int Arraylength = intArray.length - 1;
				int hi = Arraylength;
				boolean done = false;
				int constantHi = intArray[hi];
				//System.out.println(constantHi);
				while(!done)
				{
					int mid = lo + (hi - lo) / 2;
					//System.out.println(intArray[hi]);
					if(num > constantHi)
					{
						System.out.println("Current file not large enough for " + num + ". Enter another number.");
						num = keyboard.nextInt();
						hi = Arraylength;
						lo = 0;
					}
					else if(num < 1)
					{
						System.out.println("Bye.");
						done = true;
					}
					else if(num == intArray[mid])
					{
						//System.out.println("3 "+lo +" "+ mid+" "+hi);
						System.out.println(num + " is a prime number. Enter another number.");
						num = keyboard.nextInt();
						hi = Arraylength;
						lo = 0;
					}
					else if ( lo >= hi)
					{
						System.out.println(num + " is NOT a prime number. Enter another number.");
						num = keyboard.nextInt();
						hi = Arraylength;
						lo = 0;
					}
					else if(num < intArray[mid]) 
					{
						hi = mid - 1;
						//System.out.println("1 "+lo +" "+ mid+" "+hi);
					}
					else if(num > intArray[mid])
					{
						lo = mid + 1;
						//System.out.println("2 "+lo +" "+ mid+" "+hi);
					}
				}
		}
		catch(Exception e)
		{
			//System.out.println("Here");
			System.out.println(e.getMessage());
		}
	}
}
