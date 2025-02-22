public class linearSearchRange {
    static int search(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return Integer.MIN_VALUE;
        }
        for ( int i=start; i<end; i++){
            if (arr[i] == target){
                return arr[i];
            }
        }
        return Integer.MIN_VALUE;
    }
    public static void main(String[] args) {
        int[] arr = {23, 45, 1, 2, 8, 19, -3, 16, 28};
        int target = 19;
        int start = 2;
        int end = 7;
        System.out.println(search(arr, target, start, end));
    }
}