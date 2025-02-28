public class binarySearchFloorNumber {
    static int floorNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[0]){
                return Integer.MIN_VALUE;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[end];
    }
    public static void main(String[] args) {
        int[] arr = {-3, 1, 2, 8, 16, 19, 23, 28, 45};
        System.out.println(floorNumber(arr, 20));
    }
}