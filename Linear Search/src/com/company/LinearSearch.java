package com.company;

public class LinearSearch {

    public static void main(String[] args) {
        int[] nums = {18, 9, 11, 7, 45};
        int target = 11;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0) {
            return -1;
        }

        for(int index =0; index < arr.length; index++){
            int element = arr[index];

            if(element == target){
                return index;
            }

        }
        return -1;
    }
}
