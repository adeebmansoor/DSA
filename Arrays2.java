import java.util.Arrays;
import java.util.Scanner;
public class Arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows of array: ");
        int row = sc.nextInt();
        System.out.print("Enter the no. of columns of array: ");
        int col = sc.nextInt();
        // Input
        int [][] arr = new int[row][col];
        System.out.print("Enter the elements of array: ");
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Output
        // 1st method:
        // for (int i=0; i<row; i++){
        //     for(int j=0; j<col; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // 2nd method:
        // for (int i=0; i<row; i++){
        //     System.out.println(Arrays.toString(arr[i]));
        // }

        // 3rd method:
        // for (int[] r : arr) {
        //     for (int c : r) {
        //         System.out.print(c + " ");
        //     }
        //     System.out.println();
        // }

        // 4rd method:
        // for (int[] r : arr) {
        //     System.out.println(Arrays.toString(r));
        // }
    }
}
