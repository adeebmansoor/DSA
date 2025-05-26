public class BitManipulation {
    public static void main(String[] args) {
        int n = 182;
        int bit = 5;
        System.out.println(set(n, bit));
        System.out.println(reset(n, bit));
        System.out.println(rightMostSetBit(n));
    }
    // Ques. Set the ith bit, if 0 -> 1 also if 1 -> 1.
    static int set(int n, int bit){
        return n | (1 << (bit-1));
    }
    // Ques. Reset the ith bit, if 0 -> 0 also if 1 -> 0.
    static int reset(int n, int bit){
        return n & ~(1 << (bit-1));
    }
    // Ques. Find the right most set bit.
    static int rightMostSetBit (int n){
        return n & (-n);
    }
}