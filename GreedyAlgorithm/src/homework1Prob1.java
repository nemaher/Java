import java.util.Scanner;


public class homework1Prob1 
{
	public static void main(String[] args)
	{
		int amount, originalAmount, quarters, dimes, nickels, pennies;
		
		System.out.println("Enter a price of item");
		System.out.println("(from 25 cents to a dollar(100 cents), in 5-cent increments): ");
		
		Scanner keyboard = new Scanner(System.in);
		amount = keyboard.nextInt();
		
		originalAmount = amount;
		amount = 100 - amount;
		
		quarters = amount / 25;
		amount = amount % 25;
		dimes = amount / 10;
		amount = amount % 10;
		nickels = amount / 5;
		amount = amount % 5;
		
		System.out.println("You bought an item for " + originalAmount + " cents and gave me a dollar, so your change is:");
		System.out.println(quarters + " Quarter(s)");
		System.out.println(dimes + " Dime(s)");
		System.out.println(nickels + " Nickel(s)");
	}
}
