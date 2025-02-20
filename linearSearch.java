public class linearSearch {
    
    // 1. Search for the target element if found return the index of the element in the array
    static int search(int[] arr, int target){

        // return -1 if length of array is 0
        if (arr.length == 0){
            return -1;
        }

        // for loop for iterating every element
        for ( int i=0; i<arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    // 2. Search for the target element if found return the element in the array
    static int search2(int[] arr, int target){

        // return -1 if length of array is 0
        if (arr.length == 0){
            return Integer.MIN_VALUE;
        }

        // for loop for iterating every element
        for ( int i=0; i<arr.length; i++){
            if (arr[i] == target){
                return arr[i];
            }
        }
        return Integer.MIN_VALUE;
    }

    // 3. Search for the target element if found return true else false
    static boolean search3(int[] arr, int target){

        // return -1 if length of array is 0
        if (arr.length == 0){
            return false;
        }

        // for loop for iterating every element
        for ( int i=0; i<arr.length; i++){
            if (arr[i] == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {23, 45, 1, 2, 8, 19, -3, 16, 28};
        int target = 19;
        System.out.println(search(arr, target));
        System.out.println(search2(arr, target));
        System.out.println(search3(arr, target));
    }
}
