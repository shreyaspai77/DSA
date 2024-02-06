import java.util.HashMap;
import java.util.Map;

public class romanToInteger {
    public static void converter(String s) {
        Map<Character, Integer> valueMap = new HashMap<>();
        valueMap.put('V', 5);
        valueMap.put('X', 10);
        valueMap.put('I', 1);
        // valueMap.put('V', 5);
        // valueMap.put('V', 5);
        // valueMap.put('V', 5);
        int sum = valueMap.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 1; i > 0; i--) {
            if (valueMap.get(s.charAt(i)) > valueMap.get(s.charAt(i - 1))) {
                sum -= valueMap.get(s.charAt(i - 1));
            } else {
                sum += valueMap.get(s.charAt(i - 1));
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        String s = "XVIX";
        converter(s);

    }
}
