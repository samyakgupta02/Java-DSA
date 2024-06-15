import java.util.*;

public class Find {
    public static void main(String[] args) {
        // Test the find and findindex methods
        int[] arr = {1, 2, 3,3, 4, 5};
        int target = 3;

        // Test find method
        boolean isFound = find(arr, target, 0);
        System.out.println("Target found: " + isFound);

        // Test findindex method
        int index = findindex(arr, target, 0);
        System.out.println("Index of target: " + index);

        findallindex(arr,3,0);
        System.out.println(list);

    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }

        return arr[index] == target || find(arr, target, index + 1);
    }


    static int findindex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findindex(arr, target, index + 1);
        }
    }

    //creating an array list
    static ArrayList<Integer> list = new ArrayList<>();
    static void findallindex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            //whenever you find an answer, you add it into the list
            list.add(index);
        }
        findallindex(arr, target, index + 1);
        }


    //now we don't want to create a separate array list and just pass it inside only
    static ArrayList<Integer> findallindex2(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            //whenever you find an answer, you add it into the list
            list.add(index);
        }
        return findallindex2(arr, target, index + 1, list);
    }
    }



