package DataStructures;

public class linearSearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,8,2,10,15,5};
		int search=10;
		int j=0;
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				j=-1;
				System.out.println("Find: "+arr[i]);
				break;
			}
		}
		if(j!=-1)
		{
			System.out.println("Does not find the vaue: "+search);
		}

	}


}
