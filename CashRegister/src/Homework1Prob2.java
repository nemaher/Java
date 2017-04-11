import java.util.Scanner;

public class Homework1Prob2 
{
	public static void main(String[] args)
	{
		int amountGiven, 
			originalAmount, 
			itemAmount, 
			quarters, 
			dimes, 
			nickels, 
			quartersRecived, 
			dollarsRecived, 
			fiveDollarsRecived;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a price of item");
		System.out.println("(from 25 cents to 500 cents, in 5-cent increments): ");
		itemAmount = keyboard.nextInt();
		System.out.println("Enter amount of Quarters given to machine: ");
		quartersRecived = keyboard.nextInt() * 25;
		System.out.println("Enter number of dollars given to machine: ");
		dollarsRecived = keyboard.nextInt() * 100;
		System.out.println("Enter number of 5 dollar bills given to machine: ");
		fiveDollarsRecived = keyboard.nextInt() * 500;
		
		amountGiven = quartersRecived + dollarsRecived + fiveDollarsRecived;
		originalAmount = amountGiven;
		amountGiven = amountGiven - itemAmount;
		
		quarters = amountGiven / 25;
		amountGiven = amountGiven % 25;
		dimes = amountGiven / 10;
		amountGiven = amountGiven % 10;
		nickels = amountGiven / 5;
		amountGiven = amountGiven % 5;
		
		System.out.println("You bought an item for " + itemAmount + 
						   " cents and gave me " + originalAmount +
						   " cents, so your change is:");
		
		System.out.println(quarters + " Quarter(s)");
		System.out.println(dimes + " Dime(s)");
		System.out.println(nickels + " Nickel(s)");
	}
}