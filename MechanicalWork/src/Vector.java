public class Vector {
    private int Work = 0;
    private double[] array;   // M size Array

    
    // create a M size vector of 0's
    public Vector(int Work) {
        this.Work = Work;
        array = new double[Work];
    }

    // create matrix based on 2d array
    public Vector(double[] d) {
        Work = d.length;
        array = new double[Work];
        for(int i = 0; i < Work; i++)
        {
        	array[i] = d[i];
        }
    }

    // copy constructor
    private Vector(Vector A) { this(A.array); }


    // create and return the transpose of the invoking matrix


    // return C = A + B
    // Example <1.0, 2.0> + <3.0 , 4.0> = <4.0, 6.0>
    //If the sizes do not match throw a run time exception
    public Vector plus(Vector B) {
     if(Work == B.Work)
     {
    	 double[] newArr = new double[Work];
    	 for(int i = 0; i < Work; i++)
    	 {
    		 newArr[i] = array[i] + B.array[i];
    	 }
    	 return new Vector(newArr);
     }
     else
     {
    	 throw new RuntimeException("Sizes do not match");
     }
    }


    // return C = A - B
     //If the sizes do not match throw a run time exception
    public Vector minus(Vector B) {
        if(Work == B.Work)
        {
        	double[] newArr = new double[Work];
        	for(int i = 0; i < Work; i++)
        	{
        		newArr[i] = array [i] - B.array[i];
        	}
        	return new Vector(newArr);
        }
        else
        {
        	throw new RuntimeException("Sizes do not match");
        }
    }

    // does A = B exactly?
    public boolean eq(Vector B) {
        if(Work == B.Work)
        {
        	for(int i = 0; i<Work; i++)
        	{
        		if(array[i] != B.array[i])
        		{
        			return false;
        		}
        	}
        	return true;
        }
        return false;
    }

    // return C = A * B
    //Example <1.0, 2.0, 3.0> * <4.0, 5.0, 6.0> = 32.0
     //If the sizes do not match throw a run time exception
    public double dotProduct(Vector B) {
        if(Work == B.Work)
        {
        	double ret = 0;
        	for(int i = 0; i < Work; i++)
        	{
        		ret += array[i] * B.array[i];
        	}
        	return ret;
        }
        else
        {
        	throw new RuntimeException("Sizes do not match");
        }
    }



    //Generate a string for the vector for example "<1.0, 3.0, 4.0>"
    public String toString()
    {
        String ret = "<";
        for(int i = 0; i < Work; i++)
        {
        	ret += array[i];
        	if(i != Work - 1)
        	{
        		ret += ",";
        	}
        }
        ret += ">";
        return ret;
    }
    
    // print Vector to standard output using toString().
    public void show() {
        System.out.println(toString());
    }


}
