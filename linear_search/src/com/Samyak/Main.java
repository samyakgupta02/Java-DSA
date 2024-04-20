package com.Samyak;
public class Main {
    public static void main(String[] args)
    {

        int[] nums = {12,34,32,-3,45,-4,-56,93,24,1};
        int target = 32;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }
// search the array and return index if item found
// otherwise return -1 if item not found
    static int linearSearch(int[]arr, int target){
        if(arr.length == 0){                   // no brackets after length because it is a variable
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}