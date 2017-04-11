import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
public class Homework3Problem1 {
		
		public static void main(String[] args)
		{
			try
			{
				PrintWriter output = new PrintWriter("file.txt","UTF-8");
				
				Scanner keyboard = new Scanner(System.in);
				System.out.println("Enter a Number greater than 1");
				int size = Integer.parseInt(keyboard.nextLine());
				boolean[] a = new boolean [size+2];
				
				for(int i = 0; i < size + 1; i++)
				{
					a[i] = true;
					//System.out.println(i+ " "+a[i]);
				}
				
				a[0] = false;
				a[1] = false;
				
				
				for(int i = 2; i < Math.sqrt(size); i++)
				{
					
					if(a[i] == true)
					{
						for(int j = (i*i); j < size + 2; j = j + i)
						{
							
							a[j] = false;
							//System.out.println(j+" "+ a[j]);
						}
					}
				}
				
				for(int i = 0; i < size; i++)
				{
					if(a[i])
					{
						//System.out.println(i);
						output.print(i + " ");
					}
				}
				
				output.close();
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
}
