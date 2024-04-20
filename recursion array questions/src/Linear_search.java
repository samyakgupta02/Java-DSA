import java.util.ArrayList;

public class Linear_search {
    public static void main(String[] args) {
        int[] arr = {12, 34, 54,12};
        System.out.println(find(arr,12,0));
        findallindex(arr, 12, 0);
        System.out.println(list);

        System.out.println(findallindex(arr,12,0,new ArrayList<>()));
        //this is an approach in which we are not creating an array list outside the function
        //instead we are creating a list inside the function only.


        System.out.println(findallindex2(arr,12,0));

    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }

        return arr[index] == target || find(arr, target, index + 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    //finding all the occurrences of the target element and store them in a list.

    static void findallindex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }

        if (arr[index] == target) {
            list.add(index);

        }
        findallindex(arr, target, index + 1);
    }

    static ArrayList<Integer> findallindex(int[] arr, int target, int index,ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);

        }
        return findallindex(arr, target, index + 1,list);
    }

    static ArrayList<Integer> findallindex2(int[] arr, int target, int index) {
        //we need to create an array list at every point
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }
        //this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);

        }
        ArrayList<Integer> ansfrombelowcalls = findallindex2(arr, target, index + 1);

        list.addAll(ansfrombelowcalls);

        return list;
    }
}

