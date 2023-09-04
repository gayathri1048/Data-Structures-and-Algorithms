package DataStructures;

public class binarySearch {

	public static int binary(int arr[],int search,int start,int end)
	{
//		int start=0;
//		int end=arr.length-1;
		int mid=(start+end)/2;
		int val=-1;
//		while(start<=end) {
//			mid=(start+end)/2;
		if(search==arr[mid]) {
			val=mid;
//			System.out.println("Element is present at: "+mid);
//			break;
			return mid;
		}
		else if(search<arr[mid])
		{
			end=mid-1;
//			return binary(arr,search,start,end);
			
			
		}
		else if(search>arr[mid])
		{
			start=mid+1;
//			return binary(arr,search,start,end);
		}
		
//		if(val==0)
//		{
//			System.out.println("Elemnt is not found");
//		}
		return binary(arr,search,start,end);
		
		
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int arr[]= {1,2,5,8,10,15};
				int search=10;
				int pos=-1;
				int start=0;
				int end=arr.length-1;
				pos=binary(arr,search,start,end);
				

	}

}
