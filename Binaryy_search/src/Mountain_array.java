public class Mountain_array {
    public static void main(String[] args) {
        int []arr= {8,19,11,4,3,17,23,7};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }

    public static int peakIndexInMountainArray(int[] arr){

        int start =0;
        int end = arr.length-1;

        while(start<end){
            int mid = start +(end-start)/2;

            if (arr[mid] > arr[mid+1]){
                //you are in the descending part of the array
                //this may be the answer but look at the left of the middle element
                //this is why end != mid-1
                end = mid;

            } else {
                // you are in ascending part of the array
                start = mid + 1; //because we knnow that mid + 1 element > mid element
            }
        }
        //in the end, start==end and pointing to the largest number because of the two checks above.
        //start and end are always trying to find max element in the above two checks
        //hence, when they are pointing to just one element, that is the maximum one becuase that is what the checks say
        //more elaboration: at every point of time for start and end,they have the best possible answertill that time
        //and if we are saying that only one item is remaining because of the above line, that is the best possible answer.
        return start; //or return end. here both are equal
    }

    }
