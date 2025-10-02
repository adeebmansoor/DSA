import java.util.ArrayList;
import java.util.Arrays;

public class RecursionArray {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 6, 6, 6, 12, 56, 78 };
        // System.out.println(isSorted(arr, 0));
        // System.out.println(linearSearch(arr, 0, 12));
        // System.out.println(linearSearchIndex(arr, 0, 78));
        // linearSearchAllIndex(arr, 0, 78);
        // System.out.println(list);
        System.out.println(linearSearchAllIndex(arr, 0, 6, new ArrayList<>()));
    }

    // Ques1. check array is sorted.
    // static boolean isSorted(int[] arr, int index) {
    // if (index == arr.length - 1) {
    // return true;
    // }
    // return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    // }

    // Ques2. linear search in array find value.
    // static boolean linearSearch (int[] arr, int index, int target) {
    // if (index == arr.length-1) {
    // return false;
    // }
    // return arr[index] == target || linearSearch(arr, index+1, target);
    // }

    // Ques3. linear search in array find index.
    // static int linearSearchIndex(int[] arr, int index, int target) {
    //     if (index == -1) {
    //         return -1;
    //     }
    //     if (arr[index] == target) {
    //         return index;
    //     } else {
    //         return linearSearchIndex(arr, index + 1, target);
    //     }
    // }

    // Ques4. linear search in array find all the indices of the repeated elements.
    // static ArrayList<Integer> list = new ArrayList<>();
    // static void linearSearchAllIndex(int[] arr, int index, int target) {
    //     if (index == arr.length) {
    //         return;
    //     }
    //     if (arr[index] == target) {
    //         list.add(index);
    //     }
    //     linearSearchAllIndex(arr, index + 1, target);
    // }

    // Ques5. linear search in array find all the indices of the repeated elements returning an arraylist.
    static ArrayList<Integer> linearSearchAllIndex(int[] arr, int index, int target, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return linearSearchAllIndex(arr, index + 1, target, list);
    }
}
