import java.util.HashMap;
import java.util.Map;

public class setHash {
    public static void main(String[] args) {
        Map<Character, Integer> intStr = new HashMap<>();
        String name = "shreyas";
        char[] namearr = name.toCharArray();
        for (char c : namearr) {
            intStr.put(c, intStr.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : intStr.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        
    }
}
