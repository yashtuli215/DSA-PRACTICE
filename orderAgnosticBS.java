package com.yash;

public class orderAgnosticBS {
    public static void main(String[] args) {
        int [] nums = {-18,-12,0,0,9,10,11,12,13,18,19,20,30,50};
        int target =50;
        int ans = orderAgnosticBS(nums ,target);
        System.out.println(ans);

    }
    static int orderAgnosticBS(int [] arr, int target){
        int start =0;
        int end = arr.length -1;

        //Find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start<=end){
            //find the middle element
            int mid = start +(end - start)/2;

            if(arr[mid]== target){
                return mid;
            }
            if (isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }
                else
                {
                    start = mid+1;
                }
            }
            else
            {
                if(target>arr[mid]){
                    end = mid-1;
                }
                else
                {
                    start = mid+1;
                }
            }

        }
        return -1;
    }
}
