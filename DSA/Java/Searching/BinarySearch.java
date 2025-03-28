package codes;
class BinarySearch
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println(BS(arr,0,arr.length-1,0));
        int arr1[]={1,2,3,11,5,6,7,8,9,11,11,12,13,14,15};
        System.out.println(BS2(arr1,11,0,arr1.length-1));
    }
    static int BS(int []arr,int l,int r,int target)
    {
        if(l>r)return -1;

        int m=l+(r-l)/2;

        if(arr[m]==target)return m;

        if(target<arr[m]) r=m-1;
        else l=m+1;

        return BS(arr,l,r,target);
    }
    static int BS2(int arr[] ,int target ,int s,int e)
    {
        int m=s+(e-s)/2; 

        if(s>e)return -1;
        
        if(arr[m]==target)
        return m;

        if(arr[s]<=arr[m])
        {
            if(target >=arr[s] && target <= arr[m])
            return BS2(arr, target, s, m-1);
        else 
                return BS2(arr, target, m+1, e);
        }
        if(target>=arr[m] && target<=arr[e])
            return BS2(arr, target, m+1, e);
        
        return BS2(arr, target, s, m-1);

    }
}