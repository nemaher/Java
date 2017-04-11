import java.util.Scanner;
import java.io.File;

public class Homework2 {

	public static void main(String[] args)
	{
		try//Makes sure file is imported in correctly
		{	
			File f = new File("in.txt");
			Scanner input = new Scanner(f);
			
			int size = Integer.parseInt(input.nextLine());
			System.out.println(size);
			String Maze = "";
			int startRow = 0;
			int startCol = 0;
			boolean[] done = new boolean [1];//Checks if maze is solved so it can reduce extra runtime
			done[0] = false;//needs to be a boolean array so it check same place in memory

			char[][] maze = new char[size][size];
				for(int row=0;row<size;row++)
				{
					Maze = input.nextLine();//New string that gets lines form in.txt
					for(int col=0;col<size;col++)
					{
						maze[row][col] = Maze.charAt(col);//sets up the 2d array
						if(maze[row][col] == '0')//finds start of maze
						{
							startRow = row;
							startCol = col;
						}
						System.out.print(maze[row][col]);//prints uncompleted maze
					}
					System.out.println("");
				}
				System.out.println("");
				solve(maze,startRow,startCol, size, done);		
		}
		
		catch(Exception e)
		{
			//System.out.println("Here");
			System.out.println(e.getMessage());
		}
	}
	
	public static void solve(char[][] maze, int row, int col,int size, boolean[] done)
	{
		if(done[0] == false)//if the maze isn't done tells you where the computer is
		{
			System.out.println("Currently at " + row + "," + col);
		}
		
		if(col < size - 1)
		{
			if((maze[row][col + 1] == '1' || maze[row][col + 1] == '2') && done[0] == false)//right
			{
				System.out.println("Going Right");
				maze[row][col] = '0';
				solve(maze, row, col + 1,size,done);
			}
		}
		
		if(row < size - 1)
		{
			if((maze[row + 1][col] == '1' || maze[row + 1][col] == '2') && done[0] == false)//down
			{
				System.out.println("Going Down");
				maze[row][col] = '0';
				solve(maze, row + 1, col,size,done);
			}
		}
		
		if(col > 0)
		{
			if((maze[row][col - 1] == '1' || maze[row][col - 1] == '2') && done[0] == false)//left
			{
				System.out.println("Going Left");
				maze[row][col] = '0';
				solve(maze, row, col - 1,size,done);
			}
		}
		
		if(row > 0)
		{
	        if((maze[row - 1][col] == '1' || maze[row - 1][col] == '2') && done[0] == false)//up
			{
	        	System.out.println("Going Up");
				maze[row][col] = '0';
				solve(maze, row - 1, col, size,done);
			} 
		}
		
		if(maze[row][col] == '2' && done[0] == false)//maze is done when it finds 2
		{
			System.out.println("Finshed Maze:");
			maze[row][col] = '0';
			finished(maze, col, row, size, done);
			solve(maze, row, col, size, done);
		}
		
		else if (done[0] == false)//when maze finds dead end tells you the computer is backtracking
		{
			System.out.println("Back " + col + "," + row);
			maze[row][col] = '1';
		}
	}
	
	public static void finished(char[][] maze, int col, int row, int size, boolean[] done)
	{
			for(int finrow = 0; finrow<size; finrow++)//prints finished maze
			{
			    for(int fincol = 0; fincol<size; fincol++)
			    {
			        System.out.print(maze[finrow][fincol]);
			    }
			    System.out.println();
			}

		done[0] = true;//lets computer know maze is done
		solve(maze, row, col, size, done);
		
	}
}	
	
