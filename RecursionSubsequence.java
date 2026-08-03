import java.util.ArrayList;

public class RecursionSubsequence {
    public static void main(String[] args) {
        // ArrayList <String> list2 = new ArrayList<>();
        // subsequence("", "abc");
        // System.out.println(list);
        // subsequence2("", "abc", list2);
        // System.out.println(list2);
        // System.out.println(subsequence3("", "abc"));
        // subsequenceASCII("", "ab");
        // System.out.println(list4);
        // System.out.println(subsequenceAsciiRet("", "abc"));
        // System.out.println(subsequence3("", "abc"));
        // dice("", 4);
        System.out.println(dice2("", 4));
    }

    // Method1
    // static ArrayList<String> list = new ArrayList<>();
    // static void subsequence(String s, String p) {
    //     if (p.isEmpty()) {
    //         list.add(s);
    //         return;
    //     }

    //     char ch = p.charAt(0);
    //     subsequence(s + ch, p.substring(1));
    //     subsequence(s, p.substring(1));
    // }

    // Method2
    // static void subsequence2(String s, String p, ArrayList<String> list2) {
    //     if (p.isEmpty()) {
    //         list2.add(s);
    //         return;
    //     }

    //     char ch = p.charAt(0);
    //     subsequence2(s + ch, p.substring(1), list2);
    //     subsequence2(s, p.substring(1), list2);
    // }

    // Method3
    // static ArrayList<String> subsequence3(String s, String p) {
    //     if (p.isEmpty()) {
    //         ArrayList <String> list3 = new ArrayList<>();
    //         list3.add(s);
    //         return list3;
    //     }

    //     char ch = p.charAt(0);
    //     ArrayList<String> left =  subsequence3(s + ch, p.substring(1));
    //     ArrayList<String> right = subsequence3(s, p.substring(1));

    //     left.addAll(right);
    //     return left;
    // }

    // Subsequence and ASCII value
    // Method1
    // static ArrayList<String> list4 = new ArrayList<>();
    // static void subsequenceASCII(String s, String p) {
    //     if (p.isEmpty()) {
    //         list4.add(s);
    //         return;
    //     }

    //     char ch = p.charAt(0);
    //     subsequenceASCII(s + ch, p.substring(1));
    //     subsequenceASCII(s, p.substring(1));
    //     subsequenceASCII(s + (ch + 0), p.substring(1));
    // }

    // Method2
    // static ArrayList<String> subsequenceAsciiRet(String s, String p) {
    //     if (p.isEmpty()) {
    //         ArrayList <String> list4 = new ArrayList<>();
    //         list4.add(s);
    //         return list4;
    //     }

    //     char ch = p.charAt(0);
    //     ArrayList<String> first =  subsequenceAsciiRet(s + ch, p.substring(1));
    //     ArrayList<String> second = subsequenceAsciiRet(s, p.substring(1));
    //     ArrayList<String> third = subsequenceAsciiRet(s + (ch + 0), p.substring(1));

    //     first.addAll(second);
    //     first.addAll(third);
    //     return first;
    // }

    // Return count Subsequences
    // static int subsequence3(String s, String p) {
    //     if (p.isEmpty()) {
    //         return 1;
    //     }

    //     int left = 0, right = 0;
    //     char ch = p.charAt(0);
    //     left += subsequence3(s + ch, p.substring(1));
    //     right += subsequence3(s, p.substring(1));

    //     return left + right;
    // }

    // Ques: Dice possibility of drawing 4
    // static void dice(String p, int target) {
    //     if (target == 0) {
    //         System.out.println(p);
    //         return;
    //     }

    //     for (int i = 1; i <= 6 && i <= target; i++) {
    //         dice(p + i, target - i);
    //     }
    // }

    // Method 2
    static ArrayList<String> dice2(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> four = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            four.addAll(dice2(p + i, target - i));
        }
        return four;
    }
}
