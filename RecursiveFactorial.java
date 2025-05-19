public class RecursiveFactorial {
    public static void main(String[] args) {
        int ans = factorial(4);
        System.out.println(ans);
    }
    static int factorial (int n) {
        if (n < 3){
            return n;
        }
        return n * factorial(n - 1);
    }
}
