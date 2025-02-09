import java.util.Scanner;
public class Methods {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the Number: ");
        // int n = sc.nextInt();
        // isPrime(n);
        // if(isArmstrong(n)){
        //     System.out.println("It is an Armstrong number");
        // }
        // System.out.println("It is not an Armstrong number");

        // Print all 3 digits Armstrong numbers?
        for (int i=100; i<=999; i++){
            if( isArmstrong(i)){
                System.out.println(i);
            }
        }
        // sc.close();
    }

    // Ques1. Check if a given no. is prime or not?
    // static void isPrime(int n){
    //     for (int i=2; i<n; i++){
    //         if(n % i == 0){
    //             System.out.println(n + " is not a Prime Number.");
    //             break;
    //         }
    //         else{
    //             System.out.println(n + " is a Prime Number.");
    //             break;
    //         }
    //     }
    // }


    // Ques2. Check if a given no. is Armstrong number or not?
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + (rem * rem * rem);
        }
        return sum == original;
    }
}


