import java.util.ArrayList;

public class RecursionPermutation {
    public static void main(String[] args) {
        // permutation("", "abc");
        // System.out.println(permutation1("", "abc"));
    }

    // Method 1
    // static void permutation (String s, String p) {
    //     if (p.isEmpty()) {
    //         System.out.println(s);;
    //         return;
    //     }

    //     char ch = p.charAt(0);
    //     for (int i = 0; i <= s.length(); i++) {
    //         String first = s.substring(0, i);
    //         String second = s.substring(i, s.length());
    //         permutation(first + ch + second, p.substring(1));
    //     }
    // }

    // Method 2
    // static ArrayList<String> permutation1 (String s, String p) {
    //     if (p.isEmpty()) {
    //         ArrayList <String> list = new ArrayList<>();
    //         list.add(s);
    //         return list;
    //     }

    //     char ch = p.charAt(0);
    //     ArrayList<String> ans = new ArrayList<>();
    //     for (int i = 0; i <= s.length(); i++) {
    //         String first = s.substring(0, i);
    //         String second = s.substring(i, s.length());
    //         ans.addAll(permutation1(first + ch + second, p.substring(1)));
    //     }
    //     return ans;
    // }

    // Return the count of Permutations
    // static int permutation1 (String s, String p) {
    //     if (p.isEmpty()) {
    //         return 1;
    //     }

    //     int count = 0;
    //     char ch = p.charAt(0);
    //     for (int i = 0; i <= s.length(); i++) {
    //         String first = s.substring(0, i);
    //         String second = s.substring(i, s.length());
    //         count += (permutation1(first + ch + second, p.substring(1)));
    //     }
    //     return count;
    // }
    
}
