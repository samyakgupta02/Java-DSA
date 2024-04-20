//public class RBS {
//    public static void main(String[] args) {
//        int[]arr = {4,5,6,7,0,1,2};
//        System.out.println(findpivot(arr));
//
//    }
//
//    static int search(int[] nums,int target){
//        int pivot =
//    };
//
//    static int findpivot(int []arr){
//        int start =0;
//        int end = arr.length-1;
//
//        while(start<=end){
//            int mid = start +(end-start)/2;
//            //here are the 4 cases
//
//            if(mid<end && arr[mid]>arr[mid+1]){
//                return mid;
//            }
//            //the problem can arise that what if the last element is the mid element, then there will be index out of bound error
//            //so we will use the condition that mid<end
//
//            if(mid>start && arr[mid]<arr[mid-1]){
//                return mid;
//            }
//
//            if(arr[mid]<=arr[start]){
//                end = mid-1;
//
//            }else{
//                 start = mid+1;
//            }
//
//        }
//    return -1;
//    }
//}
