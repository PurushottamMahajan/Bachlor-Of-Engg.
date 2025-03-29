package Searching;
import java.util.*;
public class Search2D
{
	public static void main(String a[])
	{
		//Array  is sorted row and colmn wise
		int arr[][]={
			{25,30,35},{28,31,37},{38,39,40}
			};

			System.out.print(Arrays.toString(search(arr,37)));
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
