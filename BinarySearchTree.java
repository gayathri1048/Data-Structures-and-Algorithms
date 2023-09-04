package DataStructures;
class NodeBin {
	NodeBin left,right;
	int data;
	public NodeBin(int data)
	{
		this.data=data;
		left=right=null;
	}
}
public class BinarySearchTree {

	NodeBin root;
	public int value;
	public BinarySearchTree()
	{
		this.root=null;
	}
	
	void insert(int data)
	{
		root=insertRecursive(root,data);
	}
	NodeBin insertRecursive(NodeBin root,int data)
	{
		if(root==null)
		{
			root=new NodeBin(data);
			return root;
			
		}
		if(data<=root.data)
		{
			root.left=insertRecursive(root.left,data);
		}
		else if(data>root.data)
		{
			root.right=insertRecursive(root.right,data);
		}
		return root;
		
	}
	void preorder(NodeBin root)
	{
		if(root!=null)
		{
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
//		else if(root==null)
//		{
//			System.out.println("tree is empty");
//		}
	}
	void postorder(NodeBin root)
	{
		if(root!=null) {
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
		}
	}
	void inorder(NodeBin root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
	public boolean search(int data,NodeBin current)
	{
		if(current==null)
		{
			return false;
			
		}
		if(current.data==data)
		{
			return true;
		}
		else {
			if(data<current.data)
			{
				return search(data,current.left);
			}
			else if(data>current.data) {
				return search(data,current.right);
			}
			return true;
		}
		
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(5);
		bst.insert(3);
		bst.insert(15);
		bst.insert(4);
		bst.insert(2);
		bst.preorder(bst.root);
		System.out.println();
		bst.postorder(bst.root);
		System.out.println();
		bst.inorder(bst.root);
		System.out.println();
		boolean status=bst.search(23,bst.root);
		if(status)
		{
			System.out.println("Element is found");
		}
		else
		{
			System.out.println("Element is not found");
		}
	}
	

}
