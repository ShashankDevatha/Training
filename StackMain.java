package Stack;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		int sum=0;
		MyStack stk= new MyStack();
		stk.push(10);
		stk.push(4);
		stk.push(-1);
		stk.push(4);
		
	    try {
	    	int x;
	    	x = stk.pop();
	    	sum=sum+x;
	    }
	    catch(UnderflowException ex)
	    {
	    	ex.printStackTrace();
	    }

	}
		catch(OverflowException ex)
		{
			ex.printStackTrace();
		}
	}
	}
