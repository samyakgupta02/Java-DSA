public class Infinitearray {
    public static void main(String[] args) {

        int[]arr ={3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));
    }

    static int ans(int []arr,int target){
        //first find the range
        //first start with a box if size 2

        int start =0;
        int end = 1;

        //condition for the target to lie in the range

        while(target > arr[end]){
            int newStart = end+1;
            //double the size of box
            //end = previous end + size of box*2

            end  = end + (end-start+1)*2;
            start = newStart;
        }

        return Binarysearch(arr,target,start,end);
    }

    static int Binarysearch(int[] arr, int target, int start, int end) {
        //here we will not take start and end as fixed values.

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
        return -1;
    }
}
