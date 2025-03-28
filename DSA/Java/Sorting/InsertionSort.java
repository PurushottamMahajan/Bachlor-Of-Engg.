package codes;



class InsertionSort {
   public static void printArray(int arr[]) {
       for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }


   public static void main(String args[]) {
       int arr[] = {1,1,1,7, -8, 1, -3, 2};


       sort1(arr);
       sort2(arr);
   }
   static void sort1(int arr[])
   {
	   //insertion sort
	          for(int i=1; i<arr.length; i++) {
	              int current = arr[i];
	              int j = i - 1;
	                  while(j >= 0 && arr[j] > current) {
	                      //Keep swapping
	                      arr[j+1] = arr[j];
	                      j--;
	                  }
	              arr[j+1] = current;
	          }
       printArray(arr);
   }
   static void swap(int arr[],int i,int j)
   {
	   int t=arr[i];
	   arr[i]=arr[j];
	   arr[j]=t;

   }
   static void sort2(int arr[])
      {
   	   //insertion sort   for sorting the array in descending order just reverse the condition//
   	          for(int i=1; i<arr.length-1; i++) {

   	              for(int j=i+1;j >0 ;j--) {
   	                  //Keep swapping
   	                  if(arr[j] < arr[j-1])
   	                    swap(arr,j,j-1);
   	                  else break;
   	               }
   	          }
          printArray(arr);
   }
}
