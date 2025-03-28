package codes;
import java.util.*;

class CyclicSort {
	public static void main(String args[]) {
		int arr[] = {4,5,3,2};
		sort1(arr);
		printArray(arr);
		int arr1[] = {8,9,14,13,12,10,11};
		sort1(arr1);
		printArray(arr1);


   }
   public static void printArray(int arr[]) {

       for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }
   static void sort(int arr[])
      {
   	   int min=Arrays.stream(arr).min().getAsInt();
   	   for(int i=0;i<arr.length-1;)
   	   {
   		   if(i==(arr[i]-min))
   		   {
   			   i++;
   		   }
   		   else
   		   {
   			   swap(arr,i,arr[i]-1);
   		 }
   	 }
  }


   static void sort1(int arr[])
   {
	   int min=Arrays.stream(arr).min().getAsInt();
	   for (int i = 0; i < arr.length; )
	   {
	   	int correctIndex = arr[i] - min;
	   	if (correctIndex >= 0 && correctIndex < arr.length && arr[i] != arr[correctIndex]) {
		   swap(arr, i, correctIndex);
	    }
	   	else {
		   i++;
	}
   }
}
   static void sort2(int arr[])
   {
	int min=Arrays.stream(arr).min().getAsInt();
	int i=0;
	while(i<arr.length)
	{
		int correctIndex=arr[i]-min;
		if(correctIndex >= 0 && correctIndex < arr.length &&arr[i]!=arr[correctIndex])
			swap(arr,i,correctIndex);
		else
			i++;
	}

}

	static void swap(int arr[],int i,int j)
   {
	   int t=arr[i];
	   arr[i]=arr[j];
	   arr[j]=t;

   }
}
