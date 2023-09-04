package DataStructures;
 class Nodelinks{
	Object item;
	Nodelinks next;
}

public class Linkedlist {
	private Nodelinks head=null;
	private  int size=0;
	Linkedlist()
	{
		this.head=null;
		this.size=0;
	}
	public void insertNode(Object item) {
		Nodelinks node=new Nodelinks();
		node.item=item;
		node.next=null;
		if(head==null)
		{
			head=node;
			size=size+1;
		}
		else if(head.next==null)
		{
			head.next=node;
			size=size+1;
		}
		else {
			Nodelinks temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
			size=size+1;
//			System.out.println("Inserted");
		}
		System.out.println("Inserted");
	}

	public void  insertnodeatfirst(Object item)
	{
		Nodelinks node=new Nodelinks();
		Nodelinks temp=head;
		node.item=item;
		 if(head==null)
		{
				node.next=null;
				head=node;
				size=size+1;
		}
		 else if(temp!=null) {
			node.next=head;
			head=node;
			size=size+1;
		}
		
	}
	public void insertatposition(int position,Object item) {
		Nodelinks temp=head;
		Nodelinks node=new Nodelinks();
		node.item=item;
		if(head==null && position>0)
		{
			System.out.println("Insertion is not possible");
		}
		else if(head.next!=null && position<=size) {
		for(int j=0;j<position-1;j++)
		{
			temp=temp.next;
		}
		node.next=temp.next;
		temp.next=node;
		size=size+1;
		}
		else if(head.next==null && position<=1)
		{
			if(position==0)
			{
				node.next=head;
				head=node;
			}
			if(position==1)
			{
				head.next=node;
				node.next=null;
			}
		}
	}
	void display()
	{
		Nodelinks temp=head;
		if(temp==null)
		{
			System.out.println("empty");
		}
		else {
			while(temp!=null)
			{
				System.out.println(temp.item);
				temp=temp.next;
			}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist list=new Linkedlist();
		list.display();
		list.insertNode("Gaya");
		list.insertatposition (1, "Indu");
		list.insertnodeatfirst("afi");
		list.insertatposition(1,"mani");
		list.display();

	}

}
