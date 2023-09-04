package DataStructures;
class Nodetree{
	int data;
	Nodetree right;
	Nodetree left;
	Nodetree root;
	public Nodetree(int value)
	{
		this.data=value;
		right=null;
		left=null;
	}
}
public class binarytree {

	public Nodetree root;
	public void insert(int data)
	{
		if(root==null)
		{
			root=new Nodetree(data);
			return;
		}
		Nodetree current=root;
		 while (true) {
		        if (data < current.data) {
		            if (current.left == null) {
		                current.left = new Nodetree(data);
		                break;
		            } else {
		                current = current.left;
		            }
		        } else if (data > current.data) {
		            if (current.right == null) {
		                current.right = new Nodetree(data);
		                break;
		            } else {
		                current = current.right;
		            }
		        } else {
		                   return;
		        }
		    }
		}
	public int max() {
		Nodetree maxval=root;
		while(maxval.right!=null)
		{
			maxval=maxval.right;
		}
		return maxval.data;
	}
	public int min() {
		Nodetree minval=root;
		while(minval.left!=null)
		{
			minval=minval.left;
		}
		return minval.data;
	}
	public int getHeight(Nodetree n) {
		if(n==null)
		{
			return 0;
		}
		int leftHeight=getHeight(n.left);
		int rightHeight=getHeight(n.right);
		return Math.max(leftHeight, rightHeight)+1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binarytree bst=new binarytree();
		bst.insert(10);
		bst.insert(20);
		bst.insert(30);
		int max=bst.max();
		int min=bst.min();
		System.out.println(min+" "+max);
		

	}

}
