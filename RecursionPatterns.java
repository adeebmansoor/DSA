public class RecursionPatterns {
    public static void main(String[] args) {
        reverseTriangle(4, 0);
    }

    static void pattern1(int n) {
        if (n == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print('*');
        }
        System.out.println();
        pattern1(n-1);
    }

    static void triangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print('*');
            triangle(r, c+1);
        }
        else {
            System.out.println();
            triangle(r-1, 0);
        }
    }

    static void reverseTriangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            reverseTriangle(r, c+1);
            System.out.print('*');
        }
        else {
            reverseTriangle(r-1, 0);
            System.out.println();
        }
    }
}
