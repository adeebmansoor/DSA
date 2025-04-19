import java.util.Arrays;

public class binarySearch2DstrictArray {
    // search in the row provided between the cols provided
    static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target){
        while(colStart <= colEnd){
            int mid = colStart + (colEnd - colStart) / 2;
            if(matrix[row][mid] == target){
                return new int[] {row, mid};
            }
            else if(matrix[row][mid] < target){
                colStart = mid + 1;
            }
            else {
                colEnd = mid - 1;
            }
        }
        return new int[] {-1, -1};
    }
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious, matrix may be empty

        // if matrix contains only 1 row
        if(rows == 1){
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        // if matrix contains more than 2 rows
        // run the loop till only 2 rows are remaining
        int rowStart = 0;
        int rowEnd = rows - 1;
        int colMid = cols / 2;

        while (rowStart < (rowEnd - 1)) {
            int mid = rowStart + (rowEnd - rowStart) / 2;
            if (matrix[mid][colMid] == target) {
                return new int[] {mid, colMid};
            }
            else if (matrix[mid][colMid] < target) {
                rowStart = mid;
            }
            else {
                rowEnd = mid;
            }
        }

        // now we have only 2 rows remaining
        // we will check whether th midCol contains the target value
        if (matrix[rowStart][colMid] == target) {
            return new int[] {rowStart, colMid};
        }
        if (matrix[rowStart + 1][colMid] == target) {
            return new int[] {rowStart + 1, colMid};
        }

        // Otherwise check in 4 halves created
        // check in 1st half
        if (target <= matrix[rowStart][colMid - 1]) {
            return binarySearch(matrix, rowStart, 0, colMid - 1, target);
        }
        // check in 2nd half
        if (target >= matrix[rowStart][colMid + 1] && target <= matrix[rowStart][cols - 1]) {
            return binarySearch(matrix, rowStart, colMid + 1, cols - 1, target);
        }
        // check in 3rd half
        if (target <= matrix[rowStart + 1][colMid - 1]) {
            return binarySearch(matrix, rowEnd, 0, colMid - 1, target);
        }
        // check in 4th half
        else{
            return binarySearch(matrix, rowEnd, colMid + 1, cols - 1, target);
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        System.out.println(Arrays.toString(search(matrix, 99)));
    }
}
