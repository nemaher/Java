import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class WordCount implements Runnable
{
   private Counter c;
   private String filename;
   
   //Constructor to set up thread
   public WordCount(Counter c, String file)
   {
      this.filename = file;
      this.c = c;
   }

   
   public void run()
   {
      try
      {
    	 File f = new File(filename);
         Scanner file = new Scanner(f);

         while (file.hasNext())
         {
            file.next();
            c.increment();
         }
         
      }
      catch (FileNotFoundException e)
      {
         System.out.println("File Not Found");
      }
   }
}


