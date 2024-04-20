package com.Samyak;

public class SearchInRange {
    public static void main(String[] args) {
         int []arr={23,54,87,3,6,9,34,987};
         int target=6;
        System.out.println(LinearSearch(arr,target,2,4));

    }



    static int LinearSearch(int []arr, int target, int start, int end){
        if (arr.length==0){
            return -1;

        }

        for (int i=start; i<=end; i++){
            int element = arr[i];
            if (element == target){
                return i;
            }
        }

        return -1;
    }
}
