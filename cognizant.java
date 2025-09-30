import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class cognizant {
    public static void main(String[] args) {
        // Ques 1:
        // String s = "5aart6i7io8o5o56";
        // int count = 0;

        // for (int i = 1; i < s.length()-1; i++) {
        // if (Character.isLetter(s.charAt(i)) && Character.isDigit(s.charAt(i-1)) &&
        // Character.isDigit(s.charAt(i+1))) {
        // count++;
        // }
        // }
        // System.out.println(count);

        // Ques 2:
        // String s = "abadbeab";
        // String ans = "";
        // HashMap<Character, Integer> hm = new HashMap<>();
        // for (int i = 0; i < s.length(); i++) {
        // if (!hm.containsKey(s.charAt(i))) {
        // hm.put(s.charAt(i), i+1);
        // }
        // }
        // for (int i = 0; i < s.length(); i++) {
        // if (hm.containsKey(s.charAt(i))) {
        // for (int j = 0; j < hm.get(s.charAt(i)); j++) {
        // ans = ans + s.charAt(i);
        // }
        // ans = ans + "-";
        // }
        // }
        // int n = ans.length();
        // System.out.println(ans.substring(0, n-1));

        // Ques 3:
        // int[] arr = {1,2,1,3,5,2,4,2};
        // int n = 8;
        // int count = 0;

        // for (int i = 1; i < arr.length-1; i++) {
        // if (arr[i] == arr[i-1] + arr[i+1]) {
        // count++;
        // }
        // }
        // System.out.println(count);

        // Ques 4:
        // int times = 2;
        // int[] fuel = {1,2,3,4,5};
        // int[] petrolStand = {1,1,0,1,1};

        // int i = 0;
        // while (i < times) {
        // for (int j = 0; j < petrolStand.length; j++) {
        // if (petrolStand[j] == 1) {
        // fuel[j] *= 2;
        // }
        // }
        // i++;
        // }
        // System.out.println(Arrays.toString(fuel));

        // Ques 5:
        // int n = 6186;
        // String str = Integer.toString(n);
        // String palin = "";
        // for (int i = str.length()-1; i >= 0; i--) {
        // palin += str.charAt(i);
        // }
        // if (str.equals(palin)) {
        // System.out.println("Palindrome");
        // }else{
        // System.out.println("Not Palindrome");
        // }

        // Ques 6:
        // int[] arr = {1,2,3,4,5};
        // int n = arr.length;
        // int r = 4;
        // r = r % n;
        // reverse(arr, 0, r - 1);
        // reverse(arr, r, n - 1);
        // reverse(arr, 0, n - 1);
        // System.out.println(Arrays.toString(arr));

        // Ques 7:
        // int p = 1, q = 100;
        // for (int i = p; i < q; i++) {
        // if (isKarpekar(i)) {
        // System.out.print(i + " ");
        // }
        // }

        // Ques 8:
        // int power = 2;
        // String s = "HHCBCHHHHC";

        // int index = s.indexOf('B');

        // int leftSum = 0, rightSum = 0;
        // int leftPower = power;
        // for (int i = index; i >= 0 && leftPower > 0; i--) {
        //     if (s.charAt(i) == 'H') {
        //         leftSum++;
        //         leftPower--;
        //     } else if (s.charAt(i) == 'C') {
        //         leftPower++;
        //     }
        // }
        // int rightPower = power;
        // for (int i = index; i < s.length() && rightPower > 0; i++) {
        //     if (s.charAt(i) == 'H') {
        //         rightSum++;
        //         rightPower--;
        //     } else if (s.charAt(i) == 'C') {
        //         rightPower++;
        //     }
        // }
        // System.out.println(leftSum + rightSum);

        // Ques 9:
        // String[] N = {"0.6","0.7","0.3","0.8","0.5"};
        // int[] values = new int[N.length];

        // for (int i=0; i<N.length; i++) {
        //     values[i] = N[i].charAt(2) - '0';
        // }

        // int totalSum = 0;
        // for (int val : values) totalSum += val;

        // int leftSum = 0;
        // for (int i = 0; i < values.length; i++) {
        //     int rightSum = totalSum - leftSum - values[i];
        //     if (leftSum == rightSum + values[i]) {
        //         System.out.print(Integer.toString(i));
        //         return;
        //     }
        //     leftSum += values[i];
        // }

        // Ques 10:
        // int[] A = {2,3,1,2,1};
        // int S = 0;
        // int n = A.length;
        // boolean[] visited = new boolean[n];
        // boolean moveRight = true;
        // int index = S;

        // while (true) {
        //     if (visited[index] == true) {
        //         System.out.println(-1);
        //         return;
        //     }
        //     visited[index] = true;
        //     int steps = A[index];
        //     int nextIndex = moveRight ? index + steps : index - steps;

        //     if (nextIndex < 0 || nextIndex >= n) {
        //         System.out.print(A[index]);
        //         return;
        //     }
        //     index = nextIndex;
        //     moveRight = !moveRight;
        //}

        // String code = "ABCZABCADDAC";
        // int n = code.length();

        // HashSet<String> set = new HashSet<>();

        // for (int i = 0; i < n; i+=3) {
        //     char[] codes = code.substring(i, i+3).toCharArray();
        //     Arrays.sort(codes);
        //     set.add(new String(codes));
        // }

        // System.out.println(set.size());

        int a = 65;
        System.out.println(a + "-" + (char)a);

    }

    // static boolean isKarpekar(int i) {
    // if (i == 1) return true;
    // int j = i * i;
    // String str = String.valueOf(j);
    // int d = String.valueOf(i).length();

    // String left = str.substring(0, Math.max(0, str.length()-d));
    // String right = str.substring(str.length()-d);

    // int leftNum = (left.isEmpty()) ? 0 : Integer.parseInt(left);
    // int rightNum = (right.isEmpty()) ? 0 : Integer.parseInt(right);

    // return (leftNum + rightNum) == i;
    // }

    // static void reverse(int[] arr, int s, int e) {
    // while (s < e) {
    // int temp = arr[s];
    // arr[s] = arr[e];
    // arr[e] = temp;
    // s++;
    // e--;
    // }
    // }
}
