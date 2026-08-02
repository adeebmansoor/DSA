public class RecursiveFibonacci {
    
    // To print the final number
    // public static void main(String[] args) {
    //     int ans = fibonacci(6);
    //     System.out.println(ans);
    // }
    // static int fibonacci(int n){
    //     if (n < 2){
    //         return n;
    //     }
    //     return fibonacci(n - 1) + fibonacci(n - 2);
    // }

    // To print the fibonnaci series
    public static void main(String[] args) {
        fibonacci(0, 1, 10);
    }

    static void fibonacci(int a, int b, int n) {
        if (n == 0) return;

        System.out.println(a + " ");
        fibonacci(b, a + b, n - 1);
    }
}
