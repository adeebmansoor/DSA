public class Recursion2 {
    public static void main(String[] args) {
        // func(5);
        // System.out.println();
        // func2(5);
        // System.out.println();
        // System.out.println(sum(5));
        // System.out.println(prod(5));
        // System.out.println(factorial(4));
        // System.out.println(fibonacci(8));
        // int ans = sumDigits(1342);
        // System.out.println(ans);
        // int ans2 = sumProduct(1342);
        // System.out.println(ans2);
        // printOpp(5);
        // revNum(1342);
        // System.out.println(sum);
        // boolean ans = palin(9811);
        // System.out.println(ans);
        // int zero = count(1000);
        // System.out.println(zero);
    }

    // static void func(int n) {
    // if (n <= 0) {
    // return;
    // }
    // System.out.print(n + " ");
    // func(n - 1);
    // }

    // static void func2(int n) {
    // if (n == 0) {
    // return;
    // }
    // func2(n - 1);
    // System.out.print(n + " ");
    // }

    // static int sum(int n) {
    // if (n <= 1) {
    // return 1;
    // }
    // return n + sum(n - 1);
    // }

    // static int prod(int n) {
    // if (n <= 1) {
    // return 1;
    // }
    // return n * prod(n - 1);
    // }

    // static int factorial(int f) {
    // if (f < 3) {
    // return f;
    // }
    // return f * factorial(f - 1);
    // }

    // static int fibonacci(int fb) {
    // if (fb < 2) {
    // return fb;
    // }
    // return fibonacci(fb - 1) + fibonacci(fb - 2);
    // }

    // static int sumDigits(int num) {
    // if (num == 0) {
    // return 0;
    // }
    // return (num % 10) + sumDigits(num / 10);
    // }

    // static int sumProduct(int num) {
    // if (num % 10 == num) {
    // return num;
    // }
    // return (num % 10) * sumProduct(num / 10);
    // }

    // static void printOpp(int n) {
    // if (n == 0) {
    // return;
    // }
    // System.out.println(n);
    // printOpp(--n);
    // }

    // static int sum = 0;
    // static void revNum (int n) {
    // if (n == 0) {
    // return;
    // }
    // int rem = n % 10;
    // sum = sum * 10 + rem;
    // revNum(n / 10);
    // }

    // static int rev2(int n) {
    //     int digits = (int) (Math.log10(n) + 1);
    //     return helper(n, digits);
    // }

    // static int sum = 0;
    // static int helper (int num, int digits) {
    //     if (num % 10 == num) {
    //         return num;
    //     }
    //     int rem = num % 10;
    //     return rem * (int)Math.pow(10, digits-1) + helper(num/10, digits-1);
    // }

    // static boolean palin (int n) {
    //     return n == rev2(n);
    // }

    // static int helper(int n, int c) {
    //     if (n == 0) {
    //         return c;
    //     }
    //     int rem = n % 10;
    //     if (rem == 0) {
    //         return helper(n/10, c+1);
    //     }
    //     return helper(n/10, c);
    // }

    // static int count (int n) {
    //     return helper(n, 0);
    // }
}
