public class RecursionStrings {
    public static void main(String[] args) {
        // skip( "baccad", "");
        // System.out.println(skip2("haaaadbf"));
        // System.out.println(skipWord("i love adeeb", "adeeb"));
        System.out.println(skipAppNotApple("baccapplad", "app"));
    }

    // string without a's using recursion
    static void skip(String s, String ans) {
        if (s.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = s.charAt(0);
        if (ch == 'a') {
            skip(s.substring(1), ans);
        }
        else {
            skip(s.substring(1), ans + ch);
        }
    }

    // Return a string without a's using recursion
    static String skip2(String s) {
        if (s.isEmpty()) {
            return "";
        }

        char ch = s.charAt(0);
        if (ch == 'a') {
            return skip2(s.substring(1));
        }
        else {
            return ch + skip2(s.substring(1));
        }
    }

    static String skipWord(String s, String word){
        if (s.isEmpty()) {
            return "";
        }

        if (s.startsWith(word)) {
            return skipWord(s.substring(word.length()), word);
        }
        else {
            return s.charAt(0) + skipWord(s.substring(1), word);
        }
    }

    static String skipAppNotApple(String s, String word){
        if (s.isEmpty()) {
            return "";
        }

        if (s.startsWith(word) && !s.startsWith("apple")) {
            return skipAppNotApple(s.substring(word.length()), word);
        }
        else {
            return s.charAt(0) + skipAppNotApple(s.substring(1), word);
        }
    }
}
