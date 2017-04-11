package threadedFibonacci;
import java.util.Scanner;

public class FibMultiThreading extends Thread {
    private int x;
    public int answer;
 
    //sets up the Thread
    public FibMultiThreading(int x) {
        this.x = x;
    }
 
    //calculates the fib number
    public void run() {
        if (x == 0 || x == 1){ 
            answer = 0;
        }else if( x == 2 || x == 3 ) {
            answer = 1;
        }else {
            try {
            	//Starts each of the fib numbers on separate threads
                FibMultiThreading f1 = new FibMultiThreading(x-1);
                FibMultiThreading f2 = new FibMultiThreading(x-2);
                f1.start();
                f2.start();
                
                //joins the threads together when they are done calculating
                f1.join();
                f2.join();
                answer = f1.answer + f2.answer;
            }catch(InterruptedException ex) { 
                ex.printStackTrace();
            }
        }
    }
 
    public static void main(String[] args){
        try {
        	System.out.println("Enter a number to get is Fibonacci number.");
        	Scanner keyboard = new Scanner(System.in);        	
            int inputNum = keyboard.nextInt();
            
            //starts the thread to calculate the fib number
            FibMultiThreading f = new FibMultiThreading(inputNum);
            f.start();
            f.join();
            System.out.println("Fibonacci number at position "+inputNum+" is: "+f.answer);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
 
}
