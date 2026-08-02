import java.util.Arrays;

public class RecursionBasics {
    public static void main(String[] args) {
        // printName("Adeeb", 5);
        // numbers1toN(5);
        // numbersNto1(5);
        // System.out.println(sumOfN(5));
        // System.out.println(factorial(5));
        // int[] arr = {1, 3, 5, 64, 98};
        // reverseArray(arr, 0, arr.length-1);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(isPalindromeString("abba"));
        // System.out.println(isPalindromeNum(888));
        System.out.println(fibonacci(6));
    }

    // Ques1
    static void printName(String name, int n){
        if (n <= 0) {
            return;
        }
        System.out.println("Adeeb");
        printName(name, n-1);
    }

    // Ques2
    static void numbers1toN(int n){
        if (n == 0) {
            return;
        }
        numbers1toN(n - 1);
        System.out.println(n);
    }

    // Ques3
    static void numbersNto1(int n){
        if (n == 0) {
            return;
        }
        System.out.println(n);
        numbersNto1(n - 1);
    }

    // Ques4
    static int sumOfN(int n) {
        if (n == 0) {
            return 0;
        }
        
        return n + sumOfN(n - 1);
    }

    // Ques5
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        
        return n * factorial(n - 1);
    }

    // Ques6
    static void reverseArray (int[] arr, int i, int j) {
        if (i >= j) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverseArray(arr, i + 1, j - 1);
    }

    // Ques7
    static boolean isPalindromeString(String s) {
        return s.equals(reverseString(s, s.length() - 1));
    }

    static String reverseString (String s, int i) {
        if (i < 0) {
            return "";
        }
        return s.charAt(i) + reverseString(s, i - 1);
    }

    // Ques 8
    static boolean isPalindromeNum(int n) {
        return n == reverseNum(n, 0);
    }

    static int reverseNum (int n, int rev) {
        if (n == 0) {
            return rev;
        }
        return reverseNum(n / 10, rev * 10 + n % 10);
    }

    // Ques 9
    static int fibonacci (int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
