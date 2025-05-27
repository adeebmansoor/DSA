public class BitManipulation {
    public static void main(String[] args) {
        // int a = 17;
        // System.out.println(isOdd(a));
        int[] arr = {2, 4, 5, 2, 3, 5, 4};
        System.out.println(notRepeating(arr));
        // int n = 182;
        // int bit = 5;
        // System.out.println(set(n, bit));
        // System.out.println(reset(n, bit));
        // System.out.println(rightMostSetBit(n));
    }

    // Ques1. Given a no. find if its even or odd?
    // static boolean isOdd (int a){
    //     return (a & 1) == 1;
    // }

    // Ques2. Return the no. that is not repeating in the array?
    static int notRepeating(int[] arr){
        int unique = 0;
        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }

    // Ques3. Set the ith bit, if 0 -> 1 also if 1 -> 1.
    // static int set(int n, int bit){
    //     return n | (1 << (bit-1));
    // }

    // Ques4. Reset the ith bit, if 0 -> 0 also if 1 -> 0.
    // static int reset(int n, int bit){
    //     return n & ~(1 << (bit-1));
    // }

    // Ques5. Find the right most set bit.
    // static int rightMostSetBit (int n){
    //     return n & (-n);
    // }
}