import java.util.ArrayList;

public class RecursionSubsequence {
    public static void main(String[] args) {
        // ArrayList <String> list2 = new ArrayList<>();
        // subsequence("", "abc");
        // System.out.println(list);
        // subsequence2("", "abc", list2);
        // System.out.println(list2);
        System.out.println(subsequence3("", "abc"));
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
    static ArrayList<String> subsequence3(String s, String p) {
        if (p.isEmpty()) {
            ArrayList <String> list3 = new ArrayList<>();
            list3.add(s);
            return list3;
        }

        char ch = p.charAt(0);
        ArrayList<String> left =  subsequence3(s + ch, p.substring(1));
        ArrayList<String> right = subsequence3(s, p.substring(1));

        left.addAll(right);
        return left;
    }
}
