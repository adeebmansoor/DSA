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

    // Ques1: Print numbers in descending order?
    // static void func(int n) {
    // if (n <= 0) {
    // return;
    // }
    // System.out.print(n + " ");
    // func(n - 1);
    // }

    // Ques2: Print numbers in ascending order?
    // static void func2(int n) {
    // if (n == 0) {
    // return;
    // }
    // func2(n - 1);
    // System.out.print(n + " ");
    // }

    // Ques3: Print sum of numbers in a recursive way?
    // static int sum(int n) {
    // if (n <= 1) {
    // return 1;
    // }
    // return n + sum(n - 1);
    // }

    // Ques4: Print sum of product of numbers in a recursive way?
    // static int prod(int n) {
    // if (n <= 1) {
    // return 1;
    // }
    // return n * prod(n - 1);
    // }

    // Ques5: Print factorial of a number in a recursive way?
    // static int factorial(int f) {
    // if (f < 3) {
    // return f;
    // }
    // return f * factorial(f - 1);
    // }

    // Ques6: Print fibonacci series of a number in a recursive way?
    // static int fibonacci(int fb) {
    // if (fb < 2) {
    // return fb;
    // }
    // return fibonacci(fb - 1) + fibonacci(fb - 2);
    // }

    // Ques7: Print sum of digits of a number in a recursive way?
    // static int sumDigits(int num) {
    // if (num == 0) {
    // return 0;
    // }
    // return (num % 10) + sumDigits(num / 10);
    // }

    // Ques8: Print product of digits of a number in a recursive way?
    // static int sumProduct(int num) {
    // if (num % 10 == num) {
    // return num;
    // }
    // return (num % 10) * sumProduct(num / 10);
    // }

    // Ques9: Print number in reverse in a recursive way?
    // static void printOpp(int n) {
    // if (n == 0) {
    // return;
    // }
    // System.out.println(n);
    // printOpp(--n);
    // }

    // Ques10: Print sum of digits of a reverse number in a recursive way?
    // static int sum = 0;
    // static void revNum (int n) {
    // if (n == 0) {
    // return;
    // }
    // int rem = n % 10;
    // sum = sum * 10 + rem;
    // revNum(n / 10);
    // }

    // Ques11: Print reverse number in a recursive way?
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

    // Ques12: Check if a number is palindrome in recursive way?
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

    // Ques13: Count zeroes in a number in a recursive way?
    // static int count (int n) {
    //     return helper(n, 0);
    // }
}
