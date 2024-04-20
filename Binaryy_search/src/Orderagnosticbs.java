public class Orderagnosticbs {
    public static void main(String[] args) {
        int []arr= {-67,-45,-12,0,23,45,78,101,406};
        int target = 45;
        int ans = OrderAgnosticBS(arr, target);
        System.out.println(ans);

    }

    static int OrderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // check if array is in ascending order or descending order
        boolean isAsc;

        if(arr[start]< arr[end]) {
            isAsc = true;
        }else{
            isAsc= false;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2; //this is done because if we do start+end then it is possible that it exceedss the range of int in java.
            if (arr[mid]== target){
                return mid;
            }
             if(isAsc){
                 if (target < arr[mid]) {
                     end = mid - 1;
                 } else {
                     start = mid + 1;

                 }
             } else{
                 if (target > arr[mid]) {
                     end = mid - 1;
                 } else {
                     start = mid + 1;

                 }
             }



        }
        return -1;
    }
}
