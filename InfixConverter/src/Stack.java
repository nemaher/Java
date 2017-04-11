
public class Stack<T> {
	//You will need to have some sort of private variables to store the stack itself here.
    //If you use a linked implementation include the node in the submission.
	//Page 205 WalkThrough
	protected LLNode<T> top;
    public Stack()
    {
       //Fill in your code here.
    	top = null;
    }
    public void pop()
    {
       //Fill in your code here.
    	if(!isEmpty())
    	{
    	top = top.getLink();
    	}
    	else
    	{
    		throw new IllegalArgumentException("Can not pop off an empty stack.");
    	}
    }
    public T top()
    {
      //Fill in your code here.
    	if(!isEmpty())
    	{
    		return top.getInfo();
    	}
    	else
    	{
    		throw new IllegalArgumentException("Can not get top of an empty stack.");
    	}
    	
    }

    
    public void push(T element)
    {
       LLNode<T> newNode = new LLNode<T>(element);
       newNode.setLink(top);
       top = newNode;
    }
    
    //You are welcome to add any other private functions.
    public boolean isEmpty()
    {
    	return (top == null);
    }
    
}
