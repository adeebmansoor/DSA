public class ArraysMaxMin {
    public static void main(String[] args) {
        int[] arr = {45, 67, 98, 103, 5, 77};
        System.out.println("The Max element is: " + maxElem(arr));
        System.out.println("The Min element is: " + minElem(arr));
    }

    static int maxElem(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static int minElem(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
