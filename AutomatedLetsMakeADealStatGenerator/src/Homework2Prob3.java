import java.util.Random;
import java.util.Scanner;
public class Homework2Prob3 
{

public static void main(String[] args) 
	{
	 Scanner keyboard = new Scanner (System.in);
	 Random generator = new Random();
	 
	// Initialize Variables
	 	int prizeDoor;
	 	int chosenDoor;
	 	boolean y = false;
	 	boolean n = false;
	 	boolean win = false;
	 	boolean lost = false;
	 	double switchWin = 0;
	 	double switchLost = 0;
	 	double stayWin = 0;
	 	double stayLost = 0;
	 	double averageStay = 0;
	 	double averageSwitch = 0;
	 	
	 	System.out.println("How many simulations do you want?");
	 	double simulations = keyboard.nextInt();
	 	
	 for(int count = 0; count< simulations; count++)
	 {
	 	//Start of Game
	 	prizeDoor = generator.nextInt(3)+1;
	 	System.out.println("Welcome to Lets Make a Deal!!!");
	 	System.out.println("Do you chose door number 1, 2, or 3?");
	 	chosenDoor = generator.nextInt(3)+1;
	 	
	 	if ((chosenDoor  == 1) && (prizeDoor == 1))
	 	{
	 		prizeDoor = generator.nextInt(2)+1;
	 		System.out.println("Door 3 was empty... Do you want to swith doors? Y/N");
	 		int userReply = generator.nextInt(2)+1;
	 		
	 		if (userReply == 1)
	 		{
	 			y = true;
	 			
	 			if (prizeDoor == 1)
	 			{
	 				System.out.println("You Win a Car!!!!");
	 				win = true;
	 			}
	 			else
	 			{
	 				System.out.println("Door is empty you lost.");
	 				lost = true;
	 			}
	 		}
	 		else
	 		{
	 			n = true;
	 			
	 			if (prizeDoor == 1)
	 			{
	 				System.out.println("You Win a Car!!!!");
	 				win = true;
	 			}
	 			else
	 			{
	 				System.out.println("Door is empty you lost.");
	 				lost = true;
	 			}
	 		}
	 		
	 		
	 	}
	 	else if((chosenDoor == 2) && (prizeDoor == 2))
	 	{
	 		prizeDoor = generator.nextInt(2)+1;
	 		System.out.println("Door 1 was empty... Do you want to swith doors? Y/N");
	 		int userReply = generator.nextInt(2)+1;
	 		
	 		if (userReply == 1)
	 		{
	 			y = true;
	 			
	 			if (prizeDoor == 1)
	 			{
	 				System.out.println("You Win a Car!!!!");
	 				win = true;
	 			}
	 			else
	 			{
	 				System.out.println("Door is empty you lost.");
	 				lost = true;
	 			}
	 		}
	 		else
	 		{
	 			n = true;
	 			
	 			if (prizeDoor == 1)
	 			{
	 				System.out.println("You Win a Car!!!!");
	 				win = true;
	 			}
	 			else
	 			{
	 				System.out.println("Door is empty you lost.");
	 				lost = true;
	 			}
	 		}
	 	}
	 		
	 	else
		 	{
		 		prizeDoor = generator.nextInt(2)+1;
		 		System.out.println("Door 2 was empty... Do you want to swith doors? Y/N");
		 		 int userReply = generator.nextInt(2)+1;
		 		
		 		if (userReply == 1)
		 		{
		 			y = true;
		 			
		 			if (prizeDoor == 1)
		 			{
		 				System.out.println("You Win a Car!!!!");
		 				win = true;
		 			}
		 			else
		 			{
		 				System.out.println("Door is empty you lost.");
		 				lost = true;
		 			}
		 		}
		 		else
		 		{
		 			n = true;
		 			
		 			if (prizeDoor == 1)
		 			{
		 				System.out.println("You Win a Car!!!!");
		 				win = true;
		 			}
		 			else
		 			{
		 				System.out.println("Door is empty you lost.");
		 				lost = true;
		 			}
		 		}
		 	
		 	}
	 if((y) && (win))
	 	{
	 		switchWin++;
	 	}
	 	else if((y) && (lost))
	 	{
	 		switchLost++;
	 	}
	 	else if((n) && (win))
	 	{
	 		stayWin++;
	 	}
	 	else if ((n) && (lost))
	 	{
	 		stayLost++;
	 	}
	 }
	 averageStay = (stayWin / simulations);
	 averageSwitch = (switchWin / simulations);
	 
	 System.out.println(averageStay);
	 System.out.println(averageSwitch);
	}
}