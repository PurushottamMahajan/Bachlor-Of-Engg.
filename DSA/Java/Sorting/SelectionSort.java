package codes;



class SelectionSort {
   public static void printArray(int arr[]) {
       for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }


   public static void main(String args[]) {
       int arr[] = {7, 8, 1, 3, 2};


       //selection sort
       for(int i=0; i<arr.length-1; i++) {
           int smallest = i;
           for(int j=i+1; j<arr.length; j++) {
               if(arr[j] < arr[smallest]) {
                   smallest = j;
               }
           }
           //swap
           int temp = arr[smallest];
           arr[smallest] = arr[i];
           arr[i] = temp;
       }


       printArray(arr);
       int arr1[] = {7, 8, 1, 3, 2};
       selection(arr1);
       printArray(arr1);

   }
   static void selection(int[] arr) {
           for (int i = 0; i < arr.length; i++) {
               // find the max item in the remaining array and swap with correct index
               int last = arr.length - i - 1;
               int maxIndex = getMaxIndex(arr, 0, last);
               swap(arr, maxIndex, last);
           }
       }

       static void swap(int[] arr, int first, int second) {
           int temp = arr[first];
           arr[first] = arr[second];
           arr[second] = temp;
       }

       static int getMaxIndex(int[] arr, int start, int end) {
           int max = start;
           for (int i = start; i <= end; i++) {
               if (arr[max] < arr[i]) {
                   max = i;
               }
           }
           return max;
       }

}
