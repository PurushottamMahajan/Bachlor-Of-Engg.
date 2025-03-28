package codes;
import java.util.*;
class Search2D
{
	public static void main(String a[])
	{
		int arr[][]={
			{10,11,12},{13,14,15},{16,17,18}
			};

			System.out.print(Arrays.toString(search(arr,1)));
	}
	 static int[] search(int arr[][],int target)
	{
		int r=0;
		int c=arr.length-1;

		while(r<arr.length   &&  c>=0)
		{
			if(arr[r][c]==target)
				return new int[]{r,c};
			else if (arr[r][c]<target)
				r++;
			else if (arr[r][c]>target)
				c--;
		}
		return new  int[]{-1,-1};
	}

}
