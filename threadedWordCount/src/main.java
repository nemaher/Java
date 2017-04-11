public class main
{
  public static void main(String args[])throws InterruptedException
   {
	  	 Counter c = new Counter();
         Runnable r1 = new WordCount(c,"file1.txt");
         Runnable r2 = new WordCount(c,"file2.txt");
         
         Thread t1 = new Thread(r1);
         Thread t2 = new Thread(r2);
         
         t1.start();
         t2.start();         
         t1.join();
         t2.join();
         
         System.out.println(c + " Words.");
   }
}
