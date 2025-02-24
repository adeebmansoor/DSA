public class binarySearchOrderAgnostic {
    static int bs(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else{
                if(target < arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int[] arr = {-3, 1, 2, 8, 16, 19, 23, 28, 45};
        int[] arr = {93, 91, 82, 68, 46, 39, 23, 8, 2};
        System.out.println(bs(arr, 65));
    }
}
