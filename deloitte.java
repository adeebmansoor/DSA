import java.util.HashMap;
import java.util.Map;

public class deloitte {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 5};
        printThriceElement(arr);
    }

    static void printThriceElement (int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int element : arr) {
            hm.put(element, hm.getOrDefault(element, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() >= 3 ) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
