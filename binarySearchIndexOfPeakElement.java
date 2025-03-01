public class binarySearchIndexOfPeakElement {
    static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        // only (start < end) is used here because when start & end will get equal that means there is only one element is left
        // which is the max element therefore we can end the loop and return either the start or end value
        while(start < end){
            int mid = start + (end - start)/2;
            // we will check if the mid element is less than mid+1 element, if it is that means the max element lies on right side
            // for searching in the right side we know the condition (start = mid + 1)
            if (arr[mid] < arr[mid+1]){
                start = mid + 1;
            }
            // we will check if the mid element is less than mid-1 element, if it is that means the max element lies on left side
            // for searching in the left side we know the condition (end = mid - 1)
            else if (arr[mid] < arr[mid - 1]){
                end = mid - 1;
            }
            // if the mid element is not less than either mid+1 or mid-1 elements that means it is the max element
            // therefore we return the mid value
            else{
                return mid;
            }
        }
        // if the loop breaks that means both start and end pointers are at the same position
        // and according to the condition it is the max element
        // therefore we will return either the start or end value
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {0,8,26,18,5,4,1};
        System.out.println(peakIndex(arr));
    }
}
