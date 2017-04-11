
//Use this class to calculate the mechanical work done.
import java.util.Scanner;

import javax.swing.text.Document;

public class MechanicalWork {
    public static void main(String[] args) {
    	
    	Scanner keyboard = new Scanner(System.in);
    	
        //Take in a number that tells how many dimensions the force is being applied in.
    	System.out.println("Enter dimensions: ");
    	int numDimen = keyboard.nextInt();
    	
        //Take in a number that tells how many different forces are being applied.
    	System.out.println("Enter amount of force vectors: ");
    	int numForces = keyboard.nextInt();
    	Vector forces[] = new Vector[numForces];
    	
        //Read in enough doubles for all of the force vectors.
    	System.out.println("Enter the force vectors: ");
    	for(int i = 0; i < numForces; i++)
    	{
    		double[] arr = new double[numDimen];
    		for(int j = 0; j < numDimen; j++)
    		{
    			arr[j] = keyboard.nextDouble();
    		}
    		forces[i] = new Vector(arr);
    	}

        //Create a single force vector by totaling up all of the force vectors given.
        Vector force = new Vector(numDimen);
        for(int i = 0; i < numForces; i++)
        {
        	force = force.plus(forces[i]);
        }
        //Take in a distance vector in the same amount of dimensions.
        System.out.println("Enter displacement vector: ");
        Vector dist;
        double[] arr = new double[numDimen];
        for(int i = 0; i < numDimen; i++)
        {
        	arr[i] = keyboard.nextDouble();
        }
        dist = new Vector(arr);
        
        //Calculate the mechanical work done by taking the dot product of the distance vector with
        //the total force vector.
        System.out.println("The mechanical work that was done: " + force.dotProduct(dist));;
        
    }
}

