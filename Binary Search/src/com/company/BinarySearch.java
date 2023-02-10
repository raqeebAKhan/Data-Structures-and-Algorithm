package com.company;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2,4,5,12,16,18,21,27,48,57,88,95};
        int target = 48;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
        if(ans == -1){
            System.out.println("not found");
        }
    }
    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                return mid;
            }
        }
        return  -1;
    }
}
