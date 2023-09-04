package DataStructures;

public class queue {

	private Object[] queue;
	int size;
	int front;
	int rear;
	public queue(int size)
	{
		this.size=size;
		front=-1;
		rear=size-1;
	}
	
	public void insert(Object val)
	{
		if(front==rear && rear==size-1) {
			System.out.println("queue is full");
		}
		else {front++;
		queue[front]=val;
		}
		
	}
	public void delete()
	{
		if(front==-1 && rear==size-1)
		{
			System.out.println("queue is empty");
		}
		else
		{
			rear=rear-1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue q=new queue(5);
		
		

	}

}
