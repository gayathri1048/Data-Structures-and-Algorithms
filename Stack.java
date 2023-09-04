package DataStructures;

public class Stack {
	private Object[] stackarray;
	int size;
	private int top;
	public Stack(int size)
	{
		this.size=size;
		this.top=-1;
		stackarray=new Object[size];
		
	}
	public void push(Object value)
	{
		if(top==size-1)
		{
			System.out.println("Stack is full");
		}
		else {top++;
		stackarray[top]=value;
		}
	}
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("Element deleted is: "+stackarray[top--]);
			
		}
	}
	public void display()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(stackarray[i]);
		}
	}
	public static void main(String[] args)
	{
		Stack s=new Stack(5);
//		s.pop();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.display();
		s.pop();
		s.pop();

		
		
	}

}
