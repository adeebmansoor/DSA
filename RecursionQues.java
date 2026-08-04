import java.util.ArrayList;
import java.util.List;

public class RecursionQues {
    public static void main(String[] args) {
        // System.out.println(letterCombinations("23"));
        // System.out.println(letterCombinationsCount("23"));
        // System.out.println(dice("", 4));
        System.out.println(diceFace("", 4, 7));
    }

    // Ques 1 Letter Combination
    // static String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    // static List<String> letterCombinations(String digits) {
    //     if (digits.length() == 0) {
    //         return new ArrayList<>();
    //     }
    //     return helper("", digits);
    // }

    // static ArrayList<String> helper(String p, String up) {
    //     if (up.isEmpty()) {
    //         ArrayList<String> list = new ArrayList<>();
    //         list.add(p);
    //         return list;
    //     }

    //     ArrayList<String> list = new ArrayList<>();
    //     int digit = up.charAt(0) - '0';
    //     String letters = map[digit];
    //     for (int i=0; i<letters.length(); i++) {
    //         char ch = letters.charAt(i);
    //         list.addAll(helper(p + ch, up.substring(1)));
    //     }
    //     return list;
    // }

    // Ques2 Letter Combination, returning count
    // static String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    // static int letterCombinationsCount(String digits) {
    //     if (digits.length() == 0) {
    //         return 0;
    //     }
    //     return helper("", digits);
    // }

    // static int helper(String p, String up) {
    //     if (up.isEmpty()) {
    //         return 1;
    //     }

    //     int count = 0;
    //     int digit = up.charAt(0) - '0';
    //     String letters = map[digit];
    //     for (int i=0; i<letters.length(); i++) {
    //         char ch = letters.charAt(i);
    //         count += helper(p + ch, up.substring(1));
    //     }
    //     return count;
    // }

    // Ques3 How many ways to draw 4 from a dice
    static ArrayList<String> dice(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i<=target; i++) {
            list.addAll(dice(p + i, target - i));
        }
        return list;
    }

    // Ques4 More than 6 Face dice
    static ArrayList<String> diceFace(String p, int target, int face) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= face && i<=target; i++) {
            list.addAll(diceFace(p + i, target - i, face));
        }
        return list;
    }
}