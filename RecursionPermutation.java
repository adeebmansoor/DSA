public class RecursionPermutation {
    public static void main(String[] args) {
        permutation("", "abc");
    }

    static void permutation (String s, String p) {
        if (p.isEmpty()) {
            System.out.println(s);;
            return;
        }

        char ch = p.charAt(0);
        for (int i = 0; i <= s.length(); i++) {
            String first = s.substring(0, i);
            String second = s.substring(i, s.length());
            permutation(first + ch + second, p.substring(1));
        }
    }
}
