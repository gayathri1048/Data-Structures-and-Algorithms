package DataStructures;

public class slectionSort {

	public static int[] print(int arr[])
	{
		int n=arr.length;
//		int temp=arr[0];
		for(int i=0;i<n;i++) {
			int temp=i;
		for(int j=i;j<n;j++)
		{
			if(arr[temp]>arr[j])
			{
				temp=j;
//				temp=arr[j];
			}
		}
		int temp1=arr[temp];
		arr[temp]=arr[i];
		arr[i]=temp1;
		}
		return arr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {6,5,3,2,7,3,4};
		int res[] = print(arr);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
	}

}
