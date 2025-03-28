package Searching;


class TernarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println(TS(arr, 0, arr.length - 1, 0));
        int arr1[] = {1, 2, 3, 11, 5, 6, 7, 8, 9, 11, 11, 12, 13, 14, 15};
        System.out.println(TS(arr1, 0, arr1.length - 1, 11));
    }

    static int TS(int arr[], int l, int r, int target) {
        if (l > r) return -1;

        int mid1 = l + (r - l) / 3;
        int mid2 = r - (r - l) / 3;

        if (arr[mid1] == target) return mid1;
        if (arr[mid2] == target) return mid2;

        if (target < arr[mid1]) 
            return TS(arr, l, mid1 - 1, target);
        else if (target > arr[mid2]) 
            return TS(arr, mid2 + 1, r, target);
        else 
            return TS(arr, mid1 + 1, mid2 - 1, target);
    }
}
