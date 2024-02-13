import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class setHash {
    public static void main(String[] args) {
        Map<Character, Integer> intStr = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        String name = "shreyas";
        char[] namearr = name.toCharArray();
        for (char c : namearr) {
            intStr.put(c, intStr.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : intStr.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
        arr.add(1);
        arr.add(7);
        arr.add(0);
        arr.sort(null);
        for (Integer c : arr) {
            System.out.println(c);
        }

    }
}
