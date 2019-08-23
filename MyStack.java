package Stack;

public class MyStack {
	int top=-1;
	int stack[]=new int[100];
	
	/*Exception()
	{
		Exception ex= new Exception()
	    throw ex;
	}*/
	
	public void push(int x) throws OverflowException
	{
		if(top>10-1)
		{
		OverflowException ex = new OverflowException("Cannot handle due to overflow");
		throw ex;
		}
		else
		{
			stack[++top]=x;
		}
	}
	public int pop() throws UnderflowException 
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else
		{
			UnderflowException ex=new UnderflowException();
			throw ex;
		}
	}

}
