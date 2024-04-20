public class Lower_Upper_Bound {
    public static void main(String[] args) {

    }
    //first we need lower bound and upper bound methods
    static int lowerbound(int[]arr,int target, int ans){
         int start = 0;
         int end = arr.length -1;

         while(start <= end){
             int mid = start + (end - start)/2;

             if(arr[mid]>=target){
                 ans = mid;

                 //check for index lower than mid
                 end = mid-1;
             }else{
                 start = mid +1;
             }
         }
         return ans;

    }
    static int upperbound(int[]arr,int target, int ans){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid]>target){
                ans = mid;

                //check for index lower than mid
                end = mid-1;
            }else{
                start = mid +1;
            }
        }
        return ans;

    }
}
