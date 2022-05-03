package com.yash;



public class BinarySearch
{
    public static void main(String[] args) {
        int [] nums = {-18,-12,0,0,9,10,11,12,13,18,19,20,30,50};
        int target =50;
        int ans = BinarySearch(nums ,target);
        System.out.println(ans);

    }
    static  int BinarySearch(int [] arr, int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            //Finding the middle element
          //  int mid = (start+end)/2 might be possible the start +end exceeds max value
            int mid = start +(end - start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if (target>arr[mid]){
                start = mid+1;
            }
            else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
