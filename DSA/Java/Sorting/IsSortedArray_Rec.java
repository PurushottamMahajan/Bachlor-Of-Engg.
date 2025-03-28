package codes;
import java.util.*;
class IsSortedArray_Rec
{
	public static void main(String arfs[])
	{
		int [] n = new int [5];

		System.out.println("Enter an array");
		try (Scanner in = new Scanner(System.in)) {
			for(int i =0;i<n.length;i++)
			{
				n[i]=in.nextInt();
			}
		}
		if(isSorted(n,0))
		System.out.println("Array is sorted");
		else
		System.out.println("Array is not sorted");



	}
	public static boolean isSorted(int a[],int i)
	{
		if(i==a.length-1)
		return true;

		if(a[i]>=a[i+1])
			return false;
		return isSorted(a,i+1);
	}

}