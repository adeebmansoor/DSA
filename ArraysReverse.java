import java.util.Arrays;

public class ArraysReverse {
    public static void main(String[] args) {
        int[] arr = {45, 67, 98, 103, 5, 77};
        System.out.println(Arrays.toString(reverse(arr)));
    }

    static int[] reverse(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
