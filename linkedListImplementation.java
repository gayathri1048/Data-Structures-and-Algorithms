package DataStructures;
class Node{
	public Object item;
	public Node next;
	
}
public class linkedListImplementation {
	private int size=0;
	private Node head;
	public linkedListImplementation() {
		this.size=0;
		this.head=null;
	}

	public void insertNode(String i) {
		Node node=new Node();
		node.item=i;
		Node current=this.head;
		if(this.head==null)
		{
			this.head=node;
			this.head.next=null;
			this.size=1;
//			System.out.println(this.head.item.toString());
			
		}
		else {
			while(current.next!=null)
			{
				current=current.next;
				
			}
			current.next=node;
			node.next=null;
			this.size+=1;
//			System.out.println(node.item);
			
			
			
		}
	}
	public void addInMiddle(String i,int position)
	{
		Node node=new Node();
		node.item=i;
		Node current=head;
		if(head.next!=null && position<=size)
		{
			for(int j=0;j<position-1;j++)
			{
				current=current.next;
			}
			node.next=current.next;
			current.next=node;
			this.size+=1;
		}
		
	}
	public void addAtStarting(String i)
	{
		Node node=new Node();
		node.item=i;
		node.next=head;
		head=node;
		this.size +=1;
//		System.out.println(head.item.toString());
	}
	public void deleteAtStarting()
	{
		if(this.head==null)
		{
			System.out.println("Linked list is empty");
		}
		else if(head.next!=null) {
		head=head.next;
		this.size -=1;
		}
//		if(this.head==null)
//			{
//				System.out.println("Linked list is empty");
//			}
		else if(this.head.next==null)
		{
			head=null;
			this.size -=1;
		}
		
	}
	
	public void deletionAtEnding()
	{
		Node current=new Node();
		current=head;
		Node temp=new Node();
		if(head==null)
		{
			System.out.println("Linked list is empty");
		}
		else if(head.next==null)
	    {
		   head=null;
		   this.size -=1;
	    }
		else if(head.next!=null)
		{
			while(current.next!=null)
			{
				temp=current;
				current=current.next;
			}
			temp.next=null;
			this.size -=1;
		}
		
		
	}
	public void deletionAtPosition(int pos)
	{
		Node current=this.head;
		Node temp=new Node();
		 if(head==null)
		{
				System.out.println("Linked list is empty");
		}
		 
		 else if(pos==0)
		{
			head=head.next;
			this.size -=1;
		}
		 else if(head.next==null && pos>=1)
		 {
			System.out.println("There is only one element");
		 }
//		 else if(head==null)
//		{
//			System.out.println("Linked list is empty");
//		}
	
		else if(head.next!=null && pos<=size) {
		for(int j=0;j<pos;j++)
		{
			temp=current;
			current=current.next;
		}
		temp.next=current.next;
		this.size -=1;
		}
//		else if(pos==0)
//		{
//			head=head.next;
//			this.size -=1;
//		}
//		if(head==null)
//			{
//				System.out.println("Linked list is empty");
//			}
//		
		
	}
	public void find(String value)
	{
		Node current=this.head;
		boolean flag=false;
		for(int i=0;i<size;i++)
		{
			if(current.item.equals(value))
			{
				System.out.println("Element present at index: "+i);
				flag=true;
//				break;
			}
			current=current.next;
		}
		if(!flag)
		{
			System.out.println("Element is not present in the linked list");
		}
	}
	public void dispaly()
	{
		
		Node current=this.head;
		if(head!=null) {
		for(int i=0;i<size;i++)
		{
			System.out.println(current.item);
			current=current.next;
		}
		}
		else
		{
			System.out.println("Linked list is empty");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stthis.ub
		linkedListImplementation list=new linkedListImplementation();
		list.insertNode("indu");
		list.insertNode("afifa");
		list.addAtStarting("gayathri");
		list.addInMiddle("mani",2);
		list.deleteAtStarting();
		list.dispaly();
		
	}

}
