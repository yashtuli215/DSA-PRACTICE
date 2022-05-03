package com.yash;

public class LinearSearch {

    public static void main(String[] args) {
        // write your code here
        int [] nums ={23,45,1,2,8,19,-3,16,-11,28};
        int target =8;
        int ans = linearSearch(nums,target);
        System.out.println(ans);

    }
    //Search in the array
    static int linearSearch(int [] arr ,int target){
        if(arr.length == 0){
            return -1;
        }
        //run for loop
        for(int index =0;index<arr.length;index++){
            // Check for every element if it is equal to target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}


