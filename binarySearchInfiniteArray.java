public class binarySearchInfiniteArray {
    static int ans(int[] arr, int target){
        // find the range
        // initially the size of the box will be of 2 elements, then it will get increase exponentially
        int start = 0;
        int end = 1;

        // condition for the element to lie int the chunk
        // as we know the array is sorted, therefore the target will only lie in the chunk if it is less then the end
        // or else it is lying outside the current chunk
        while(target > arr[end]){
            // the new start value after increasing the size of the chunk will be end + 1
            int newStart = end + 1;
            // for doubling the size
            // formula: end = previous end + (size of box * 2)
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        // this is normal binary search
        while (start<=end) {
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr, target));
    }
}
