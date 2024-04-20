package com.Samyak;

public class Minimum {
    public static void main(String[] args) {
        int []arr = {23,54,87,3,6,9,34,987};
        System.out.println(min(arr));

    }


    static int min(int []arr){
        if(arr.length == 0){
            return -1;
        }
        int ans = arr[0];
        for (int i =1; i<arr.length; i++){
            if(arr[i]< ans){
                ans = arr[i];

            }
        }
        return ans;
    }
}
