public class Move_All_Zeros_to_End 
{
	public static void main(String args[])
	{
		int inspos=0;
		int temp;
		int arr[]= {1,0,2,4,0};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				temp=arr[i];
				arr[i]=arr[inspos];
				arr[inspos]=temp;
				inspos++;
			}
		}
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}			
}
