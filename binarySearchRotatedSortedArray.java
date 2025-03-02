public class binarySearchRotatedSortedArray {
    static int pivot(int[] arr){
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
            // case 3: if start element is greater than equal to the mid element it means the pivot will lie on the left side of the array
            // so we will reduce the search space by making end = mid-1
            else if(arr[0] >= arr[mid]){
                end = mid - 1;
            }
            // case 4: if start element is less than the mid element it means the pivot will lie on the right side of the array
            // so we will reduce the search space by making start = mid+1
            else{
                start = mid + 1;
            }
        }
        // otherwise return -1
        return -1;
    }
    static int search(int[] arr, int target){
        int pivot = pivot(arr);
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
        int[] arr = {4,5,6,7,8,0,1,2,3};
        int target = 6;
        System.out.println(search(arr,target));
    }
}
