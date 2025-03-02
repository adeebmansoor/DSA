// Rotated sorted array with duplicate values
public class binarySearchRotatedSortedArray2 {
    static int pivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            // case 1: if mid element is greater than the mid+1 element that means it is the pivot
            // thus we return mid
            // also mid should be less then the end so that mid+1 check does not goes out of bounds
            if((mid < end) && (arr[mid] > arr[mid + 1])){
                return mid;
            }
            // case 2: if mid element is lesser than the mid-1 element that means mid-1 is the pivot
            // thus we return mid-1
            // also mid should be greater then the start so that mid-1 check does not goes out of bounds
            else if((mid > start) && (arr[mid] < arr[mid - 1])){
                return mid - 1;
            }
            // case 3: this is to check if the start, end & mid values are all equal or duplicates
            // if its true the we will eliminate the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                // checking if the start value we are skipping is not the pivot
                // if it is then we will return it, else skip it
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                // checking if the end value we are skipping is not the pivot
                // if it is then we will return it, else skip it
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end --;
            }
            // left side is sorted, search pivot in the right side
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        // otherwise return -1
        return -1;
    }
    static int search(int[] arr, int target){
        int pivot = pivotWithDuplicates(arr);
        // case 1: if you do not find the pivot that means the array is not rotated
        // just do normal binary search for this case
        if (pivot == -1){
            return binarySearch(arr, target, 0, arr.length-1);
        }
        // case 2: if you found the pivot that means the array is rotated
        // case 2a: if pivot is equals to the target, we will return the pivot
        if (arr[pivot] == target){
            return pivot;
        }
        // case 2b: if target is greater than equals to the start element
        // then we will reduce the search end = pivot - 1;
        else if (target >= arr[0]){
            return binarySearch(arr, target, 0, pivot - 1);
        }
        // case 2c: if target is less than the start element
        // then we will reduce the search start = pivot + 1;
        return binarySearch(arr, target, pivot + 1, arr.length-1);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,8,9,2,2,2,6,2};
        int target = 8;
        System.out.println(search(arr,target));
    }
}