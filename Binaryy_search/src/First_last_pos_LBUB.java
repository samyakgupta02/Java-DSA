public class First_last_pos {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 4, 4, 4, 5, 6, 7};
        int target = 4;

        int firstpos = lowerbound(nums,target,-1);//initialise ans with -1
        int lastpos = upperbound(nums,target,-1);//initialise ans with -1

        if (firstpos != -1 && lastpos != -1) {
            System.out.println(firstpos);
            System.out.println(lastpos);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }

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
        return ans-1;

    }
}
