public class Counter {
private int count;

	public Counter()
	{
		count = 0;
	}
	public synchronized void increment()
	{
		count++;
	}
	public String toString()
	{
		return "Count is " + count;
	}
}
