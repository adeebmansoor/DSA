import java.util.Arrays;

public class sortingSelectionSort {
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i=start; i<=end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,5,1,4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}