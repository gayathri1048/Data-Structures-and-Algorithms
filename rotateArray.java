package DataStructures;
import java.util.*;
import java.io.*;
public class rotateArray {

	public static void rotate(int arr[],int N,int D)
	{
//		int j=1;
		int temp;
		for(int i=0,j=1;i<N&&j<=D;i++,j++)
		{
			temp=arr[0];
			for(int k=1;k<N;k++)
			{
				arr[k-1]=arr[k];
			}
			arr[N-1]=temp;
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int t;
		int N=0,D;
		int arr1[]=new int[N];
		Scanner sc=new Scanner(System.in);
//		ArrayList<int> arr=new ArrayList<int>();
		
//		sc.useDelimiter(" ");
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//	    t=br.read();
		t=sc.nextInt();
		while(t>=1)
		{
			N=sc.nextInt();
			String[] arr=new String[N];
			 arr1=new int[N];
			arr=br.readLine().split(" ");
			for(int i=0;i<N;i++)
			{
				arr1[i]=Integer.parseInt(arr[i]);
			}
			D=sc.nextInt();
			
			rotate(arr1,N,D);
			for(int k=0;k<N;k++)
			{
				System.out.print(arr1[k]+" ");
			}
			
			
			t++;
			
		}

	}

}
