package DataStructures;
import java.util.Stack;
public class queueUsingStacks<T> {
	private Stack<T> insertionStack;
	private Stack<T> deletionStack;
	public queueUsingStacks()
	{
		insertionStack=new Stack<>();
		deletionStack=new Stack<>();
	}
	public void enqueue(T item)
	{
		insertionStack.push(item);
	}
	public T dequeue() {
		if(deletionStack.isEmpty()) {
			while(!insertionStack.isEmpty())
			{
				deletionStack.push(insertionStack.pop());
			}
		}
		return deletionStack.pop();
	}
	public T peek()
	{
		if(deletionStack.isEmpty())
		{
			while(!insertionStack.isEmpty())
			{
				deletionStack.push(insertionStack.pop());
			}
		}
		return deletionStack.peek();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queueUsingStacks queue =new queueUsingStacks();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		System.out.println(queue.dequeue());
		System.out.println(queue.peek());
		

	}

}
