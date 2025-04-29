package Sorting;
import java.util.Arrays;

public class SelectionSortRec {
    public static void main(String[] args) {
        int arr[]=new int[]{4,3,2,1};
        Selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection(int [] arr,int r,int c,int max)
    {
        if(r==0)return;

        if(c<r)
        {
            if(arr[c]>arr[max])
            {
                Selection(arr, r, c+1,c);
            }
            else
                Selection(arr, r, c+1,max);
        } 
        else
        {
            int t=arr[max];
            arr[max]=arr[r-1];
            arr[r-1 ]=t; 
            Selection(arr, r-1, 0,0);
        }
         
    }
}
