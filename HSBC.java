import java.util.*;

public class HSBC {
    // static List<String> result = new ArrayList<>();
    // static String digits = "1234";

    // static char numToChar(int n) {
    // return (char) ('a' + n - 1);
    // }

    // static void backTrack(int index, StringBuilder current) {
    // if (index == digits.length()) {
    // result.add(current.toString());
    // return;
    // }

    // if (digits.charAt(index) != '0') {
    // int val = digits.charAt(index) - '0';
    // current.append(numToChar(val));
    // backTrack(index + 1, current);
    // current.deleteCharAt(current.length() - 1);
    // }

    // if (digits.charAt(index) == '1'
    // || digits.charAt(index) == '2' && digits.charAt(index) <= '6' && index + 1 <
    // digits.length()) {
    // int twoDigit = Integer.parseInt(digits.substring(index, index + 2));
    // current.append(numToChar(twoDigit));
    // backTrack(index + 2, current);
    // current.deleteCharAt(current.length() - 1);
    // }
    // }

    // public static int wordLine(String s) {
    // String[] arr = s.split("[ -]");
    // double count = 0;
    // for (String word : arr) {
    // if (Character.isLetter(word.charAt(0))) {
    // count++;
    // }
    // }
    // count = Math.ceil(count/2);
    // return (int)count;
    // }

    // static long sequence (int i, int j, int k) {
    // long sum = 0;
    // for (int l = i; l <= j; l++) {
    // sum += l;
    // }

    // for (int l = j - 1; l >= k; l--) {
    // sum += l;
    // }

    // return sum;
    // }

    static int maxSequence(int[] arr) {
        Arrays.sort(arr);
        int currCount = 1;
        int maxCount = 1;

        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) <= 1) {
                currCount++;
            } else {
                maxCount = Math.max(maxCount, currCount);
                currCount = 1;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        // String s = "How long do you have to sit dear ?";
        // System.out.println(wordLine(s));

        // String digits = "1234";
        // backTrack(0, new StringBuilder());

        // for (String str : result) {
        // System.out.println(str);
        // }

        // System.out.println(sequence(0, 5, -1));
        int[] arr = {4,13,2,3};
        System.out.println(maxSequence(arr));
    }
}
