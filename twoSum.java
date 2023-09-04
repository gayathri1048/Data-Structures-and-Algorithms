package DataStructures;
import java.util.*;
public class twoSum {
	int[] TwoSum(int nums[],int target)
	{
		
		for(int i=0;i<=nums.length-1;i++)
		{
			for(int j=i+1;j<nums.length-1;j++)
			{
				if((nums[i]+nums[j])==target)
				{
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		twoSum s=new twoSum();
		int[] in=new int[2];
		int[] arr= {1,3,4,5,8,9};
		System.out.println("Enter target : ");
		int target=sc.nextInt();
		in=s.TwoSum(arr,target);
		if(in[0]==-1)
		{
		    throw new IllegalArgumentException("No two numbers add upto the target "+target);
		}
		else {
			for(int i=0;i<2;i++)
			{
				System.out.println(in[i]+" "+arr[in[i]]);
			}
		}

	}

}
