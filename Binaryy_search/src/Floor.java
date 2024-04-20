
public class Floor {
    public static void main(String[] args) {
        int []arr= {-67,-45,-12,0,23,45,78,101,406};
        int target = 44;
        int ans = floor(arr, target);
        System.out.println(ans);
    }


    //return the index
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; //this is done because if we do start+end then it is possible that it exceedss the range of int in java.
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                return mid;//if none of the condition satisfies that means that mid is the answer here.

            }

        }
        return end; // when we want the floor of a number we will just return the end value of the array.
    }
}