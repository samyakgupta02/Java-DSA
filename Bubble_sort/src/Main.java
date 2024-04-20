import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int []arr = {12,43,3,56,-67,32};
        Bubblesort(arr);
        System.out.println(Arrays.toString(arr));

    }

    // Bubble sort function starts from here
    static void Bubblesort(int[]arr){
        boolean swapped;
        for (int i=0; i < arr.length;i++){

            swapped = false;

            for (int j = 1;j<arr.length-i;j++){

                if (arr[j] < arr[j-1]) {

                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}