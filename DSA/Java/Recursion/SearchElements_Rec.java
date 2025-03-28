package codes;
import java.util.ArrayList;

public class SearchElements_Rec {
    public static void main(String[] args) {
        System.out.println(find(new int[]{1,2,3,14,5,60,7},90,0));
        System.out.println(findIndex(new int[]{1,2,3,14,5,60,7},90,0));
        
        ArrayList<Integer>list =findIndex(new int[]{1,4,3,14,4,60,7}, 4, 0, new ArrayList<Integer>()) ;
         System.out.println(list);

         ArrayList<Integer>list2 =findIndex2(new int[]{1,4,3,14,4,60,7}, 4, 0) ;
         System.out.println(list2);
    }
    static boolean find(int arr[],int target,int i)
    {
        if(arr.length==i)
        return false;

        return (arr[i]==target || find(arr,target,i+1));
    }
    static int findIndex(int arr[] , int target,int i)
    {
        if(arr.length==i)
        return -1;
        
        if(arr[i]==target)
        return i;
        else
        return findIndex(arr, target, i+1);

    }
    static ArrayList<Integer> findIndex(int arr[] , int target,int i,ArrayList<Integer>list)
    {
        if(arr.length==i)
        return list;
        
        if(arr[i]==target)
        list.add(i);
        return findIndex(arr, target, i+1,list);

    }
    static ArrayList<Integer> findIndex2(int arr[] , int target,int i)
    {
        ArrayList<Integer>list = new ArrayList<Integer>();
        if(arr.length==i)
        return list;
        
        if(arr[i]==target)
            list.add(i);
        ArrayList<Integer>ans = findIndex2(arr, target, i+1);
        list.addAll(ans);
        return list;
    }
}
