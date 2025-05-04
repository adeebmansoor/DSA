public class Patterns {
    public static void main(String[] args) {
    // 1. *****
    //    *****
    //    *****
    //    *****
    //    *****
        for (int i=1; i<=5; i++){
            for (int j=1; j<=5; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    // 2. *
    //    **
    //    ***
    //    ****
    //    *****
        System.out.println();
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    // 3. *****
    //    ****
    //    ***
    //    **
    //    *
        System.out.println();
        int n = 5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    // 4. 1
    //    1 2
    //    1 2 3
    //    1 2 3 4
    //    1 2 3 4 5
        System.out.println();
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
